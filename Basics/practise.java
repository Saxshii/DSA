public class practise{


    public static void binarySearch(int numbers[], int key){
        System.out.println("Binary Search");
        int n = numbers.length;
        int lowest = 0, highest = n-1;
        while(lowest <= highest){
            int mid = (lowest + highest)/2;
           
            if(numbers[mid] == key){
                System.out.println("key found at index: " + mid);
                break;
            }else if(numbers[mid] <key){
                lowest = mid + 1 ;
            }
            else{
                highest = mid -1;
            }
        }}

        public static int rotated(int array[], int target){
            System.out.println("rotated search array");
          int low = 0, high = array.length-1;
          while(low <= high){
            int mid = (low + high)/2;

          if(array[mid] == target){
            System.out.println("target found at index: " + mid);
            return mid;
          }
          else if(array[low] <= array[mid]){
            if( target >= array[low] && target <= array[mid]){
                high = mid - 1;
            }else{
                low = mid + 1;}

            }else{
                if(target >= array[mid +1] && target <= array[high]){
                    low = mid + 1;
                }else{
                    high = mid - 1;}
            }}
            System.out.println("tagert not found");
            return -1;
        }

        public static void BubbleSort(int arr[]){
            System.out.println("Bubble Sort");
            for(int i=0; i<arr.length-1; i++){
                for(int j = 0;j<arr.length-i-1;j++){
                    if(arr[j] > arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
            for(int k=0; k<arr.length;k++){
                System.out.print(arr[k] + " ");
            }
        }
        public static void selectionSort(int arr[]){
            System.out.println();
            System.out.println("Selection Sort");
            for(int i = 0; i<arr.length-1; i++){
                int minIndex = i; 
                for(int j=i+1; j<arr.length;j++){
                    if(arr[minIndex] > arr[j]){
                        minIndex = j;
                    }
                }
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
            for(int k=0; k<arr.length;k++){
                System.out.print(arr[k] + " ");
            }
        }
        public static void insertionSort(int arr[]){
            System.out.println("Insertion Sort: ");
            for(int i = 1; i<arr.length; i++){
                int key = arr[i];
                int j = i - 1;
                while(j>= 0 && arr[j]>key){
                    arr[j+1] = arr[j];
                    j--;
                }
                arr[j+1] = key;
            }
            for(int k=0; k<arr.length;k++){
                System.out.print(arr[k] + " ");
            }
        }
        public static void countingSort(){
            
        }

{

}    public static void main(String args[]){
        // int key = 12; 
        // int numbrers[] ={1,2,3,5,7,8,9,12,15,19,};
        // binarySearch(numbrers, key);

        // int array[] = {4,5,6,7,0,1,2,3};
        // rotated(array, 0); 

        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        // BubbleSort(arr);
        // selectionSort(arr);
        insertionSort(arr);

    }
}