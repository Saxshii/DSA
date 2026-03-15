public class patterns{

// star pattern
public static void star(){
    System.out.println("Star pattern");
    for(int i=1; i <= 4; i++){
        for(int j=1; j<=i; j++){
            System.out.print("*" + " ");
        }
        System.out.println(" ");
    }
}

// inverted star
public static void invStar(){
    System.out.println("Star pattern");
    int n= 4;
    for(int i=1; i <= n; i++){
        for(int j = 1; j <= n -i + 1 ; j++){
            System.out.print("*" + " ");
        }
        System.out.println(" ");
    }
}

// Hollow rectangle
public static void HollowRectangle( int rows, int cols){
    System.out.println("Hollow rectangle:");
    for(int i = 1; i <= rows; i++){
        for(int j = 1; j <= cols; j++){
            if(( i == 1 || i == 4) || ( j == 1 || j== 5)){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println(" ");
    }
}

// inverted n rotated half pyramid
public static void invPyramid(int rows){
    System.out.println("inverted half pyramid");
    for(int i = 1; i <= rows; i++){

        // spaces
        for(int j = 1; j <= rows - i; j++){
            System.out.print(" ");}
        // stars
        for(int j = 1; j<= i; j++){
            System.out.print("*");
        }
        System.out.println(" ");

        }
      
    }

// inverted n half pyramid with numbers
public static void halfPyramid(int n){
    System.out.println("half pyramid with numbers: ");
    for(int i = 1; i<= n; i++){
        for (int j = 1; j <= n-i+1; j++){
            System.out.print(j + " ");
        }
        System.out.println(" ");
    }
}

// FLOYD'S triangle
public static void floydTriangle(int n){
    System.out.println("fLOYD'S Triangle: ");
    int num = 1;
    for (int i = 1; i <= n; i++) {
        for(int j = 1; j <= i; j++){
            System.out.print(num + " ");
            num++;
        }
        System.out.println(" ");
    }
}

//  Zero One Triangle
public static void zeroOne(int n){
    System.out.println("Zero One triangle: ");
    for( int i = 1; i <= n; i++){
        for (int j = 1; j<= i; j++){
            int sum = i+j;
            if(sum % 2 == 0){
                System.out.print(" 1 ");
            }else{
                System.out.print(" 0 ");
            }
        }
        System.out.println(" ");
    }
}
 
// Butterfly pattern
public static void butterfly(int n){
    System.out.println("butterfly pattern: ");
    // first half
    for(int i= 1; i<=n; i++){
        // stars
        for(int j=1; j<=i; j++ ){
            System.out.print("*");
        }
        // spaces
        for(int j=1; j<= 2*(n-i); j++){
            System.out.print(" ");
        }
        // stars
        for(int j=1; j<= i; j++){
            System.out.print("*");
        }
        System.out.println(" ");
    }
    // second half
    for (int i= n; i>=1; i--){
           // stars
        for(int j=1; j<=i; j++ ){
            System.out.print("*");
        }
        // spaces
        for(int j=1; j<= 2*(n-i); j++){
            System.out.print(" ");
        }
        // stars
        for(int j=1; j<= i; j++){
            System.out.print("*");
        }
        System.out.println(" ");
    }
}


// Solid Rhombus
public static void solidRhombus(int n){
    System.out.println("solid rhombus: ");
    for(int i = 1; i<= n; i++){
        // spaces
        for(int j = 1; j<= n-i; j++){
            System.out.print(" ");
        }
        for(int k = 1; k<= 5; k++){
            System.out.print("*" + " ");
        }
        System.out.println(" ");
    }
}

// Hollor rhombus
public static void hollowRhombus(int n){
    System.out.println("hollow rhombus: ");
    for(int i=1; i<=n; i++){
        // spaces
        for(int j =1; j<= n-i; j++ ){
            System.out.print(" ");
        }
        // star
        for(int j=1; j<=n; j++ ){
            if( i==1 || i==n || j==1 || j==n){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println(" ");
    }
}

public static void diamond(int n){
    System.out.println("diamond pattern: ");
    // first half
    for(int i=1; i<=n; i++){
        // spaces
        for(int s = 1; s<=n-i; s++){
            System.out.print(" ");
        }
        for(int j=1; j<= (2*i)-1; j++){
            System.out.print("*");
        }
        System.out.println(" ");
    }
    // second half
    for(int i=n; i>=1; i--){
        // spaces
        for(int s = 1; s<=n-i; s++){
            System.out.print(" ");
        }
        for(int j=1; j<=(2*i)-1; j++){
            System.out.print("*");
        }
        System.out.println(" ");
    }
}


    public  static void main (String args[]){

        star();
        invStar();
        HollowRectangle(4,5);
        invPyramid(4);
        halfPyramid(5);
        floydTriangle(5);
        zeroOne(5);
        butterfly(4);
        solidRhombus(5);
        hollowRhombus(5);
        diamond(4);
    }
}