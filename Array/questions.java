import java.util.*;
public class questions{

public static void print(int[] arr){
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
}

// Find max n min element
public static void maxMin(int[] arr){
    int n = arr.length;
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for(int i=0; i<n; i++){
        if(arr[i]>max){
            max = arr[i];
        }
        if(arr[i] < min){
            min = arr[i];
        }
    }
    System.out.println("max is: " + max + " min is: " + min);
}

// Sum of all the elemnts
public static void sum(int[] arr){
    int n = arr.length; 
    int sum = 0;
    for (int i = 0; i< arr.length; i++) {
        sum += arr[i];
    }
    System.out.println("sum of the array is: " + sum);
}

// Liner search
public static void linearSearch(int[] arr, int k){
    int n = arr.length;
    boolean found = false;
    for (int i = 0; i < arr.length; i++) {
        if(arr[i] == k){
            System.out.println("linear search: element found at index: " + i);
            found = true;
            break;
        }
    }
    if(found == false){
        System.out.println("element not present int the array");
    }
}
// binary search
public static void binarySearch(int[] arr, int k){
    int n = arr.length;
    int low = 0, high = n - 1; 
    boolean found = false;
    while(low<= high) {
        int mid = (low + high)/2;
        if(k == arr[mid]){
            System.out.println("binary search: element found at index: " + mid);
            found = true;
            break;
        }
        if(k < arr[mid]){
            high = mid -1;
        } else{
            low = mid + 1;
        }
    }
    if(found == false){
        System.out.println("element not present");
    } 
}

// count frequency of each element
public static void count(int[] arr) {
    int n = arr.length;
    int i = 0;
    while (i < n) {
        int freq = 1;
        while (i + 1 < n && arr[i] == arr[i + 1]) {
            freq++;
            i++;
        }
        System.out.println(arr[i] + " occurs " + freq + " times");
        i++;
    }
}
// public static void count(int[] arr) {
//     int n = arr.length;
//     for (int i = 0; i < n; i++) {
//         int freq = 1;
//         // skip already counted elements
//         if (i > 0 && arr[i] == arr[i - 1]) {
//             continue; } skips current iteration
//         for (int j = i + 1; j < n; j++) {
//             if (arr[i] == arr[j]) {
//                 freq++; } }
//         System.out.println(arr[i] + " occurs " + freq + " times");
//     }}


// Second largest n Second smallest
public static void findSecond(int[] arr){
    int n = arr.length;
    int highest = Integer.MIN_VALUE;
    int lowest = Integer.MAX_VALUE;

    int secondhigh = Integer.MIN_VALUE;
    int secondlow = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
        if(highest < arr[i]){
            highest = arr[i];
        }
         if(lowest > arr[i]){
            lowest = arr[i];
        }
    }
    for(int i=0; i<n; i++){
        if(secondhigh < arr[i] && arr[i] != highest){
            secondhigh = arr[i];
        }
        if(secondlow > arr[i] && arr[i] != lowest){
            secondlow = arr[i];
        }
    }
    System.out.println("second lowest element is : " + secondlow);
    System.out.println("second highest element is : " + secondhigh);
}

// remove duplicates from a sorted array
public static void removeDuplicate(int[] arr){
    int n = arr.length;
    boolean duplicate = false;
    for(int i =0; i<n; i++){
        for(int j = i+1; j<n; j++){
        if(arr[i] == arr[j]){
            duplicate = true;
        }
    }}
    if(duplicate != true){
        for(int k = 0; k<n; k++)
        {System.out.print(arr[k] + " ");}
    }
}

// check if array is sorted
public static void checkSort(int arr[]){
    int n = arr.length;
    boolean sorted = true;
    for (int i = 1; i < n ; i++) {
        if(arr[i-1] > arr[i]){
            sorted = false;
            break;
        }
    }
    if(sorted ){
        System.out.println("array is sorted");
    }else{
        System.out.println("not sorted");
    }
}

// find missing number
public static void missing(int[] arr){
    int n = arr.length;
    for(int i=1; i<n ; i++){
        if(arr[i] != arr[i-1] + 1 ){
            System.out.println("missing number is: " + arr[i-1]+1 );
        }
    }
}

// unique element
public static void findUnique(int[] arr){
    int n = arr.length;
    for(int i = 0; i< n ; i++){
        boolean unique = true;
        for(int j = 0; j<n; j++){
            if( i!= j && arr[i] == arr[j]){
                unique = false;
                break;
            }
        }
         if(unique){
            System.out.println("unique element: " + arr[i]);
         }
    }
}

// reverse an array
public static void reverse(int[] arr){
    int n = arr.length - 1, i=0;
    while(i<n){
        int temp = arr[n];
        arr[n] = arr[i];
        arr[i] = temp;
        i++; 
        n--;
    }
    print(arr);
}

// swap elements
public static void swap(int[] arr, int start, int end){
    while(start < end){
        int temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp;
        start++;
        end--;
    }
}

// reverse subarray
public static void reverseSubarray(int[] arr){
    int i = 0, n = arr.length-1; 
    System.out.print("reverse from index 1 to second last: ");
    swap(arr, i+1, n-1);
    print(arr);
}

// rotate array left
public static void rotateLeft(int[] arr, int k){
    int n = arr.length;
    k = k % n;
    if (k == 0) return;
    swap(arr, 0, k-1);
    swap(arr, k, n-1);
    swap(arr, 0, n-1);

    System.out.print("array rotated " + k + " times is: " );
    print(arr);
}

// move negative to left sides
public static void moveNegative(int[] arr){
    int n = arr.length -1 ;
    int i = 0;
    while(i < n){
        if(arr[i] > 0 && arr[n] < 0 ){
            int temp = arr[n];
            arr[n] = arr[i];
            arr[i] = temp;
            i++; n--;
        }
        if(arr[i] < 0){
            i++;
        }
        if(arr[n] > 0){
            n--;
        }
    }
    print(arr);
}

// move zero element to end
public static void moveZero(int[] arr) {
    int n = arr.length - 1;
    int i = 0;

    while (i < n) {
        if (arr[i] == 0 && arr[n] != 0) {
            int temp = arr[i];
            arr[i] = arr[n];
            arr[n] = temp;
            i++;
            n--;
        } else if (arr[i] != 0) {
            i++;
        } else if (arr[n] == 0) {
            n--;
        }
    }
    print(arr);
}
//     int n = arr.length;
//     int j = 0;  // position to place the next non-zero element
//     for (int i = 0; i < n; i++) {
//         if (arr[i] != 0) {
//             // swap non-zero element to the front
//             int temp = arr[i];
//             arr[i] = arr[j];
//             arr[j] = temp;
//             j++;
//         }}    print(arr);


// segregate even and odd
public static void evenOdd(int[] arr){
    int n = arr.length, j = 0;

    for(int i =0; i<n; i++){
        if(arr[i] % 2 == 0 ){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j++;
        }
    }print(arr);
}

// print all subarrays
public static void subarrays(int[] arr){
    int n = arr.length;
    for (int i = 0; i < n; i++) {
        for(int j= i +1; j<=n; j++){
            for(int k = i; k<j; k++){
                System.out.print(arr[k] + " ");
            }
            System.out.println();}
            System.out.println();
    }
}

// KADANE'S ALGORITHM
public static void kadane(int[] arr){
    int n = arr.length;
    int maxSum = Integer.MIN_VALUE;
    int currentSum = 0;

    for(int i=0; i<n; i++){
        currentSum += arr[i];
        maxSum = Math.max(currentSum, maxSum);

        if(currentSum < 0){
        currentSum = 0;
    }}
    System.out.println("maximum sum is : " + maxSum);
}




    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int array[] = {1, 2, 3, 4, 5, 6};
        int arr[] = {1, 2, 2, 3, 4};
        int num[] = {1, 3, 5, 4, 6, 8};
        int unique[] = {1, 2, 5, 3, 1, 5, 2};
        int negative[] = {1, -2, 5, -4, 6, 3};
        int zero[] = {1, 2, 0, 0, 0, 5, 6};
        int text[] = {-1, -2 -3 -5};
        
        // reverse(array);
        // reverseSubarray(array);
        // rotateLeft(array, 3);
        // moveNegative(negative);
        // evenOdd(array);
        // subarrays(array);
        kadane(text);






        

   }

}