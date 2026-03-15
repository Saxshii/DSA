
// import java.util.*;
public class function{

    public static int Calc(int a, int b){
        int Sum = a + b;
        System.out.println(Sum);
        return Sum;
    }

    public static void Max(){
        int a = 3;
        int b = 4;
        int c = 2;

         if(a > b && a > c){
            System.out.println("a is greater" + a);
         }else if (b > c) {
             System.out.println("b is greater" + b);
         }else{
            System.out.println("c is greater" + c);
         }

    }

    public static int Factorial(int n){
        int fact = 1;
        for(int i=1; i <= n; i++){
            fact = fact * i;
        }
        System.out.println(fact);
        return fact;
    }

    public static boolean prime(int n){
        boolean isPrime = true;

        for(int i=2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                System.out.println("Not prime");
                isPrime = false;
                break;
            }else{
                System.out.println("Prime");
            }
        }
       return isPrime;
    }

    public static int Avg(int a, int b, int c){
        int sum = a+b+c;
        int avg = sum/3;
        System.out.println("Average of 3 numbers " + a + "," + b +","+ c + " is: " + avg);
        return avg;
    }

    // public static boolean isEven(int number){
    //     if(number % 2 == 0){
    //         return true;
    //     }else{
    //         return false;
    //     }
    // }

    public static boolean palindrome(int num){
        int original = num;
        int reverse = 0;

        while(num != 0){
            int lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            num /= 10;
        }
        System.out.println("reverse of no.: " + reverse);

        if(original == reverse){
            System.out.println("num is palindrome: " + original);
            return true;
        }else{
            return false;
        }
    }

    public static int digitSum(int num){
        int ori = num;
        int sum = 0;
        while(num > 0){
            int lastDigit = num % 10;
            sum += lastDigit;
            num /= 10;
        }
        System.out.println("Sum of digits of a number " + ori + " is: " + sum);
        return sum;
    }

    public static void main(String[] args) {
           
        // System.out.println(isEven(4));
        digitSum(1234);
        // palindrome(12321);
        // Avg(2, 6, 1);
        // prime(13);
        // System.out.println("factorial of n is:");
        // Factorial(3);
        // Max();
        // Calc(3 ,4);





    }
}