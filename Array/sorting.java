public class sorting{

// print
public static void print(int[] arr){
    int n = arr.length;
    for(int i = 0; i<n ; i++){
        System.out.print( arr[i] + " ");
    }
}

// Bubble sorting
public static void bubbleSort(int[] arr){
int n = arr.length;
for(int i = 0; i<n-1; i++){
    for(int j = 0; j<n-1-i; j++){
        if(arr[j] > arr[j+1]){
            int temp = arr[j+1];
            arr[j+1] = arr[j];
            arr[j] = temp;     
        }
    }
}
print(arr);
}

// selection sorting
public static void selectionSort(int[] arr){
    int n = arr.length;
    for (int i = 0; i< arr.length-1; i++) {
        int smallest = i;
        for(int j = i; j<n; j++){
            if(arr[smallest] > arr[j]){
                smallest = j;
            }
        }
        int temp = arr[i]; 
        arr[i] = arr[smallest];
        arr[smallest] = temp;
    }
    print(arr);
}

    public static void main(String args[]){
    int[] num = {7,8,3,4,1};
    // bubbleSort(num);
    selectionSort(num);

    }
}