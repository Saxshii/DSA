import java.util.*;
public class intro{

// print all characters of a string
public static void letters(String str){
    for(int i = 0; i<str.length(); i++){
        System.out.print(str.charAt(i) + " ");
    }
}

// check if string is palindrome ex: noon
public static boolean palindrome(String str){
    int n = str.length();
    for(int i = 0; i<n/2; i++){
        if(str.charAt(i) != str.charAt(n-i-1)){
            return false;
        }
    }
    return true;
}

// string comparision
public static void compare(){
    String A = "Sakshi";
    String B = "Sakshi";
    String C = new String("Sakshi");

    if(A == B){
        System.out.println("strings are equal");
    }else{
        System.out.println("strings are not equal");
    }

    if(A == C){ // == checks on object level
        System.out.println("strings are equal");
    }else{
        System.out.println("strings are not equal");
    }

    if(A.equals(B)){   // it checks strings value
        System.out.println("strings are equal");
    }
}

// SUB STRING
public static void subString(String str, int start, int end){
    for(int i = start; i<end; i++){
        System.out.print(str.charAt(i) + " ");
    }
}   // inbuilt substring fnc: .substring(start, end)


// Largets string  :lexicographic order(alphabetical)
// Fucntion- compare to
public static void largestString(String str){
    String fruits[] = {"apple", "mango", "banana"};
}

// to upper Case
public static void upperCase(String str){
    str = "i love you";
    StringBuilder sb = new StringBuilder("");
    char ch = Character.toUpperCase(str.charAt(0));
    sb.append(ch);

    for(int i = 1; i<str.length(); i++){

    }
}

// String compression
public static void compress(){
    String str = "aaabbccccdd";
    String newStr = "";

    for(int i =0; i<str.length(); i++){
        Integer count = 1;
        while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
            count++; i++;
        }
        newStr += str.charAt(i);
        if(count > 1){
            newStr += count.toString();
        }
    }
    System.out.println(newStr);
}

public static void main(String args[]){ 
    char[] arr = {'a', 'b', 'c', 'd'};
    
    // declaration of string
    String str = "abcd";
    String str1 = new String("xyz");

    Scanner sc = new Scanner(System.in);
    String name;
    name = sc.next();

    // System.out.println("my name: " + name);
    // System.out.println("length of my name: " + name.length());

    // letters(name);
    // palindrome(name);
    // System.out.println("");
    // compare();
    // subString(name, 1, 4);

    // StringBuilder sb = new StringBuilder("");
    // for(char ch ='a'; ch<='z' ; ch++){
    //     sb.append(ch);
    // }

    // System.out.println(sb);

    compress();


}
}