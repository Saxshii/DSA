public class Arrays{

    public static void basic( int num[] ){
        System.out.println("length of num array is: " + num.length);
        for(int i=0; i < num.length; i++){
            System.out.println("at index " + i + " value present is: " + num[i] );
        }
    }
    
// LINEAR SEARCH
    public static void linearSearch( int marks[], int key){
        System.out.println("length of marks array is: " + marks.length);
        for(int i = 0; i < marks.length; i++){
            if(marks[i] == key){
                System.out.println("key found at index " + i );
            } 
        }
    }

   public static void menuSearch(){
     String menu[] = { "dosa", "burger", "pizza", "garlic bread", "manchurian", "noodles", "pasta", "poha", "naan n paneer", "choclate ice cream", "kulfi" };
        String item = "manchurian";
    
    System.out.println("length of our array is: " + menu.length);
    for(int i = 0; i< menu.length; i++){
        if(menu[i].equals(item)){
            System.out.println("our item is found at index: " + i);
        }
    }
   }

// find Largest number
   public static int findLargest(int numbers[]){
    int largest = Integer.MIN_VALUE;
    System.out.println("our largest at start: " + largest);
    for(int i=0; i< numbers.length; i++){
        if(largest < numbers[i]){
            largest = numbers[i];
        }
    }
    System.out.println(largest);
    return largest;
   }

//  print pairs of each element in array
   public static void printPairs(int pairs[]){
    for(int i = 0; i<pairs.length; i++){
        int curr = pairs[i];
        for(int j = i+1; j<pairs.length; j++){
            System.out.print("(" + curr + "," + pairs[j] + ")");
        }
        System.out.println();
    }
   }
   


    public static void main(String args[]){
        // int num[] = {1, 2, 3, 4, 5};
        // // basic(num);

        // int marks[] = {5, 2, 6, 8, 3, 10, 7 };
        // int key = 10;
        // // linearSearch(marks, key);
        
        // // menuSearch();

        // int numbers[] = { 1,2 , 4, 6, 8, 10 };
        // // findLargest(numbers);

        // int pairs[] = {2,4,6,8,10} ;
        // printPairs(pairs);
       
    }
}