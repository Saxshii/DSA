public class revise{
    public static void print(int array[]){
        for (int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
    }

    public static void largest(int num[]){
        int highest = Integer.MIN_VALUE;
        for (int i=0; i<num.length; i++){
            if(highest < num[i]){
            highest = num[i];
            }}
        System.out.println(highest);
    }

    public static int secondlargest(int arr[]){
        int highest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE; 
        for (int i=0; i<arr.length; i++){
            if(highest < arr[i]){
            highest = arr[i];
            }
        }
        for(int i=0; i< arr.length;i++){
            if(arr[i] > second && arr[i] < highest){
            second = arr[i];
        }}
        if(second == Integer.MIN_VALUE){
            return -1;
        }else{
            return second;
        }}

    public static boolean checkSorted(int nums[]){
        boolean check = false;
        for(int i =0; i< nums.length - 1; i++){
            if(nums[i] <= nums[i + 1]){
                check = true;
            }
        }
        System.out.println("check is: " + check);
        return check;
    }

    public static void removeDuplicate(int arr[]){
        for(int i =0; i<arr.length; i++){
            boolean duplicate = false;
            for(int j= i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    duplicate = true;
                    break;
                }
            }
            if(!duplicate){
                System.out.print(arr[i] + " ");
            }
        }
    } 

    public static void swap(int arr[], int i, int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String args[]){
        int brr[] = {2,4,6,8};
        print(brr);

        int num[] = {1,8,7,56,90};
        largest(num);

        // int arr[] = {10,20,4,45,99};
        // secondlargest(arr);

        int nums[] = {1,2,3,4,5};
        checkSorted(nums);
        
        // int arr[] = {10,20,20,30,40,50,50};
        // removeDuplicate(arr);

        int arr[] = {1,2,3,4,5,6,7};
        int i = 0, j = arr.length-1; 
        swap(arr, i, j);
        print(arr);
        
    }
}