public class basic{

    // REVERSE A STRING
    public static void reverse(String str){
        int n = str.length();
        for(int i = n -1; i>0; i--){
            System.out.print(str.charAt(i) + " ");
        }
    }

    // CHECK STRING IS PALINDROME
    public static boolean palindrome(String str){
        int n = str.length();
        for (int i = 0; i <= n/2; i++) {
            if( str.charAt(i) != str.charAt(n-i-1) ){
                return false;
            }}
            return true;
        }

    // COUNT VOWELS, CONSONANTS, DIGITS, SPACES
    public static void count(String str){
    int n = str.length();
    int vowel = 0, consonant = 0, digit = 0, space = 0;

    for(int i = 0; i < n; i++){
        char ch = Character.toLowerCase(str.charAt(i));
    if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
    vowel++;}
    else if (ch >= '0' && ch <= '9') {
    digit++;}
    else if (ch == ' ') {
    space++;}
    else if (ch >= 'a' && ch <= 'z') {
    consonant++;}
    }
    System.out.println(" Number of Vowels: " + vowel + ", Consonants: " + consonant + ", Digits: " + digit + ", Spaces: " + space);
    }

    // INTERCHANGE LOWERCASE N UPPERCASE
    public static void interchange(String str){
        String ans = " ";

        for(int i = 0; i< str.length(); i++){
            char ch = str.charAt(i);

            if( ch >= 'a' && ch <= 'z'){
                ans += Character.toUpperCase(ch);
            }
            else if( ch >= 'A' && ch <= 'Z'){
                ans += Character.toLowerCase(ch);
            }
            else{
                ans += ch;
            }
        }
        System.out.println(ans);
    }

    // REMOVE SPACES
    public static void removeSpace(String str){
        String ans = " " ;
        
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if( ch == ' ' ) {
               ch++;   
            }else{
                ans += ch;
            }
        }
        System.out.println(ans);
    }

    // COUNT FREQUENCY OF CHARACTERS
    public static void frequency(String str){
        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
        freq[str.charAt(i)]++;}

        for (int i = 0; i < 256; i++) {
        if (freq[i] > 0) {
            System.out.println((char)i + ": " + freq[i]);
        }}
    }

    // CHECK 2 STRING ARE ANAGRAM- means same length n same no of each charcter present in any order eg: RACE n CARE
    public static void anagram(String str , String str2){

        if (str.length() != str2.length()) {
        System.out.println("Not Anagram");
        return;}

        int[] freq = new int[256];  //increase freq of characters in arr
        for (int i = 0; i < str.length(); i++) {
        freq[str.charAt(i)]++;}

        for (int i = 0; i < str2.length(); i++) { //delete freq of char present in array
        freq[str2.charAt(i)]--;}

        for (int i = 0; i < 256; i++) {
            if (freq[i] != 0) { // all 1 become 0 means all same char present
                System.out.println("Not Anagram");
                return;
        }}
        System.out.println("Anagram");
    }

    // PRINT ALL SUBSTRING
    public static void substring(String str){
        for(int i = 0; i<str.length(); i++){
            for(int j=i+1; j<=str.length(); j++){
                System.out.print(str.substring(i, j) + " ");
            }System.out.println(" ");
        }
    }

    // COUNT WORDS IN A SENTENCE
    public static void countWords(String str){
        int count = 0;
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) != ' ' && (i == 0 || str.charAt(i-1) == ' ')){
                count++;
            }
        }
        System.out.println("sentence has " + count +  " words");
    }




    public static void main(String args[]){
        String name = "Sakshi";
        String line = " I am 19 years old";
        String change = "manku LOVES sakuu";
        String space = " H ey ! Goo d M  o rni ng";
        String freq = "abbcddeeef";


        // reverse(name);
        // System.out.println(palindrome(name));
        // count(line);
        // interchange(change);
        // removeSpace(space);
        // frequency(freq);
        // anagram("race", "care");
        // substring("abcd");
        countWords("I am a girl.");

    }
}