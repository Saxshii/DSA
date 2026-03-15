public class basic{
     
    //  print N to 1(decreasing order)
    public static void printDec(int n ){
        if(n == 1){
            System.out.println("1");
            return;
        }
        System.out.print(n + " ");
        printDec(n-1);
    }

    // print 1 to n
    public static void printInc(int n ){
        if(n == 1){
            System.out.print(1+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n + " ");

    }
 


    public static void main(String args[]){
        printDec(10);
        printInc(10);
    }
}