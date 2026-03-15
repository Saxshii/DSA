
import java.util.Scanner;

public class basic{

// print 2d array
public static void print(int[][] arr){
    int n = arr.length; 
    int m = arr[0].length;
    for(int i =0; i<n; i++){
        for(int j = 0; j<m; j++){
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
}

// add two matrices
public static void add( int[][] a, int r1, int c1, int[][] b, int r2, int c2){
    if(r1 != r2 || c1 != c2){
        System.out.println("Matrices dimensions do not match.");
        return;
    }

    int[][] sum = new int[r1][c1];

    for(int i = 0; i < r1; i++){  //rows
        for(int j = 0; j < c1; j++){   //columns
            sum[i][j] = a[i][j] + b[i][j];
        }
    }
    print(sum);
}

// Multiplication of matrices
public static void multiply(int[][] a, int r1, int c1, int[][] b, int r2, int c2){
    if(c1 != r2){
        System.out.println("Matrices dimensions do not match.");
        return;
    }

    int[][] c = new int[r1][c2];
    
    for(int i = 0; i < r1; i++){  //rows
        for(int j = 0; j < c2; j++){  //column
            for(int k = 0; k < c1 ; k++){
                c[i][j] += a[i][k] *  b[k][j];
            }   
        }
    }
    print(c);
}



    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // int matrix[][] = {{1,2}, {3,4}, {5,6}};
        // print(matrix);

        System.out.print(" enter no. of rows and columns: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        int[][] num1 = new int[r1][c1];
        System.out.print("Enter values: ");
        for(int i =0; i<r1; i++){
            for(int j = 0; j<c1; j++){
                num1[i][j] = sc.nextInt();
            }
        }

        System.out.print(" enter no. of rows and columns: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        int[][] num2 = new int[r2][c2];
        System.out.print("Enter values: ");
        for(int i =0; i<r2; i++){
            for(int j = 0; j<c2; j++){
                num2[i][j] = sc.nextInt();
            }
        }

        // int num1[][] = { {2,1}, {2,1} };
        // int num2[][] = { {1,3}, {1,3}, {1,3} };
        System.out.println("Addition of matrices: ");
        // add(num1, r1,r2, num2, c1, c2);
        multiply(num2, r1, c1, num2, r2, c2);






    }
}