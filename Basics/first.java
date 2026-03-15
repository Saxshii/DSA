
import java.util.*;
public class first{

    public static void Repeat(){
        System.out.println("ILY");
    }

   
    public static void main(String[] args) {
        Repeat();
      
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter your number: ");

        int num = sc.nextInt();
        while (num > 0){
            int lastDigit = num % 10;
            System.out.println("last digits: "+ lastDigit + " ");
            num = num / 10;
        }

    System.out.println("enter a number: ");
    int p = sc.nextInt();

    boolean isPrime = true;
    
    if (p <= 1){
        System.out.println("Not prime");
    }
    else{
    for(int i = 2; i <= Math.sqrt(p) ; i++ ){
       if(p % i == 0){
        isPrime = false;
        break;
       }
    }}
    if (isPrime){
        System.out.println("prime");
    }else{
        System.out.println("Not prime");
    }

    // int number = sc.nextInt();
    // int count = 0; 
    // while (number != 0){
    //     number /= 10;
    //     count++;
    // }
    // System.out.println(count);

    
    // int number = sc.nextInt();
    // int count = 0; 
    // while (number != 0){
    //     int lastdigit = number % 10;
    //     if (lastdigit % 2 == 0){
    //     count++;
    //     }
    //     number /= 10;
    // }
    // System.out.println("count of even digits in our number: " + count);

    }
}