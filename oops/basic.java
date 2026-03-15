public class basic{
    
    public static void main(String[] args) {

        // object of class book
        Book b = new Book(); 
        b.name = "Shatter me";
        b.rate = 5;

        Student s1 = new Student(); // CONSTRUCTOR CALLED
        s1.name = "sakuu";
        s1.age = 20;

        Student s2 = new Student("sakshi");

        // Dog shiro = new Dog();
        // shiro.eat();
         
    }
}

// made a class book 
class Book{
    String name;
    int rate;

    void bookName(String str){
        name = str;}
    void rateBook(int newrate){
        rate = newrate;
    }
}

// Encapsulation
// class Student
class Student{
    String name;
    int age;

    Student(){ //CONSTRUCTOR
    System.out.println("non parameterized constructor called");
    }

    Student(String name){ 
    this.name = name; //this referes to current obj values
    System.out.println("parameterized constructor called");
    }

    Student(Student s1){ //COPY constructor
    this.name = s1.name;
    this.age = s1.age;
    }
}

// Inheritence 

// 1. SINGLE LEVEL
class Animal{  //base class
    String name;
    void eat(){
        System.out.println("eats");
    }
    void breath(){
        System.out.println("breaths");
    }
}
class Dog extends Animal{  //derived class
    void play(){

    }
}

// 2. MULTI LEVEL

// class Animal{  //base class
//  }
// class Dog extends Animal{  //derived class
// }
// class Shiro extends Dog{
// }

// 3. HIERARCHIAL

// class Animal{
//   }
// class dog extends Animal{
//   }
// class cat extends animal{
//   } 
// 4. HYBRID 

// polymorphism
// compile time(method overlaoding) - fnc with same name diff params

class Math{
    // void add(int a, int b){
    // }
    // void add(int a,, int b, int c){
    // }
    // viod add(float a, float b){
    // }
}

// run time(function overidding) - fnc with same name n params
class Maths{
    void mul(int a, int b){
    }
}
class solve extends Maths{
    void mul(int a, int b){
    }
}

// Abstraction
// 1. ABSTRACT CLASS - can't create object of object class
abstract class Names{
    String name;
    Names(){  //can have constructor 
        System.out.println("my name");
    }
}

// 2. INTERFACE - b;uprint of class, variables are final public n static
interface chessplayer{
    void moves();
}
class Queen implements chessplayer{
    public void moves(){
        System.out.println("");
    }
}

// KEYWORDS

//  STATIC - used to share same variable/method of given class in obj
// if any obj will change it's value it will be changed for all
class Books{
    String writer;
    static String genre;
    void genre(){
        System.out.println("print genre");
    }
}
class shatterme extends Books{
    void print(){
        System.out.println(genre);
    }
}