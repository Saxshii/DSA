

public class TwoDArrays{
// print spiral array
public static void spiralArray(int matrix[][]){
int n = matrix.length, m = matrix[0].length;

    int start_row = 0, end_row = n-1;
    int start_col = 0, end_col = m-1;

    while(start_row <= end_row && start_col <= end_col){
        // top
        for(int j = start_col; j<= end_col; j++){
            System.out.print(matrix[start_row][j] + " ");
        }
        // right
        for(int i = start_row + 1; i<= end_row; i++){
            System.out.print(matrix[i][end_col] + " ");
        }
        // bottom
        for(int j = end_col -1; j>= start_col; j--){
            System.out.print(matrix[end_row][j] + " ");
        }
        // left
        for(int i = end_row -1; i>= start_row + 1; i--){
            System.out.print(matrix[i][start_col] + " ");
        }
        start_col++; start_row++;
        end_col--; end_row--;
    }
    System.out.println(" ");
}

// diagonal sum
public static void diagonalSum(int matrix[][]){
    int sum = 0;
    for(int i = 0; i<matrix.length; i++){
        sum += matrix[i][i];
        if(i != matrix.length-1-i){
            sum += matrix[i][matrix.length-i-1];
        }
    }
    System.out.println("sum of diagonals: " + sum);
}

// Staircase method
public static boolean staircase(int array[][], int key){
    int row = 0, col = array[0].length-1; 

    while(row < array.length && col >= 0){
        if(array[row][col] == key){
            System.out.println("key found at (" + row + "," + col + ")" );
            return true;
        }
        else if(key < array[row][col]){
            col--;
        }
        else{
            row++;
        }

    }
    return false;
}

public static void main(String args[]){

int matrix[][] = new int[4][4];

int num = 1;
for(int i = 0; i<matrix.length;i++){
    for (int j = 0; j<matrix[0].length; j++){
        matrix[i][j] = num;
        num++;
    }
}
spiralArray(matrix);
diagonalSum(matrix);

int array[][] = {{10,20,30,40},{515,25,35,45},{27,29,37,48},{32,33,39,50}};
staircase(array, 33);








// INPUT
    // for(int i =0; i< matrix.length; i++){
    //     for(int j =0; j <matrix[0].length; j++){
    //         matrix[i][j] = sc.nextInt();
    //     }
    // }
// output
// for(int i =0; i< matrix.length; i++){
    //     for(int j =0; j <matrix[0].length; j++){
    //         System.out.print(matrix[i][j] + " ");
    //     }
    //     System.out.println(" ");
    // }

}}