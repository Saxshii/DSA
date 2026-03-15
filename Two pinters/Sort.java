
public class Sort{

     public static void swap(int[] arr, int i, int j){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    public static void zeroOnes(int[] arr ){
        int left = 0, right = arr.length-1;
        while(left < right){
            if (arr[left] == 0) {
            left++;
        }
        else if (arr[right] == 1) {
            right--;
        }
        else {   
            swap(arr, left, right);
            left++;
            right--;
        }
        }
    }

    public static void palindrome(String str){
        int n = str.length();
        int left = 0, right = n-1;
        while(left <= right){
            if(str.charAt(left) != str.charAt(right)){
                System.out.println("not palindrome");
                return;
            }else{
                left++; right--;
            }
        }
        System.out.println("palindrome");
    }

    public static int[] twoSum(int[] arr, int target){
        int n = arr.length;
        int left = 0, right = n-1;

        for(int i = 0; i < n; i++){ 
            if( (arr[left] + arr[right]) == target){
                return new int[]{left+1, right+1};
            }
            else if( ( arr[left] + arr[right]) > target){
                right--;
            }
            else{
                left++;
            }
        }
        return new int[]{-1,-1};
    }

   
    public static void main(String[] args) {
     String str = "madam";
    //  palindrome(str);  

     int[] arr = {2,7,11,15};
     System.out.println( twoSum(arr, 9) );  



    }
}