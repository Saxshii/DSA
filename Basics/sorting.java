

public class sorting{

// BUBBLE sort    
public static void bubbleSort(int arr[]){
    for(int turn = 0; turn<arr.length - 1; turn++){
        int swapped = 0;
        for(int j=0; j<arr.length-1-turn; j++){
            if(arr[j] > arr[j+1]){
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;

            swapped++;
            }
        }
        if(swapped < 1){
            System.out.println("already swapped");
            break;
        }
    }
}
public static void printArr(int arr[]){
    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i] + " ");
    }
    System.out.println(" ");
}

// SELECTION sort
public static void selectionSort(int array[]){
    System.out.println("Selection sort: ");
    for(int i=0; i<array.length-1; i++){
        int min = i;
        for (int j=i+1; j<array.length;j++){
            if(array[min] > array[j]){
                min = j;
            }
        }
        // swap
        int temp = array[min];
        array[min] = array[i];
        array[i] = temp;
    }
}
public static void printArray(int array[]){
    for(int i=0; i<array.length; i++){
        System.out.print(array[i] + " ");
    }
    System.out.println(" ");
}

// INSERTION sort
public static void insertionSort(int array[]){
    for(int i=1; i<array.length; i++){
        int curr = array[i];
        int prev = i-1;
        while(prev >= 0 && array[prev] >curr){
            array[prev + 1] = array[prev];
            prev--;
        }
        array[prev + 1] = curr;
    }
}

// counting sort
public static void counting(int array[]) {
    int largest = Integer.MIN_VALUE;
    for(int i=0; i<array.length; i++){
        largest = Math.max(largest, array[i] );
    }
    int count[] = new int[largest+1];
    for(int i =0; i< array.length; i++){
        count[array[i]]++;
    }
    int j=0;
    for(int i = 0; i< count.length; i++){
        while(count[i] > 0){
        array[j] = i;
        j++;
        count[i]--;
        }
    }
}

    public static void main(String[] args) {
        // int arr[] = {5,4,1,3,2};
        // bubbleSort(arr);
        // printArr(arr);

        int array[] = {5,4,1,2,3};
        // selectionSort(array);
        // insertionSort(array);
        //inbuilt sorting:    Arrays.sort(array);
        counting(array);
        printArr(array);
    }
}
