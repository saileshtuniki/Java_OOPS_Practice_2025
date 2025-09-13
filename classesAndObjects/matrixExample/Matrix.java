package classesAndObjects.matrixExample;

import java.util.Scanner;

public class Matrix {
    public int[][] data;
    public int rows;
    public int cols;

    public Matrix( int rows, int cols){
        this.rows = rows;
        this.cols = cols;
        this.data = new int[rows][cols];
    }

    //method to accept elements
    public void acceptMatrixElements(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the matrix ("+ rows+ "x" + cols +");");

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print("Enter at positions (" + (i+1) + "," +(j+1) + ");");
                data[i][j] = sc.nextInt();
            }
        }
    }

    //display data
    public void displayMatrix(){
        for(int i=0; i< rows; i++){
            for(int j =0; j< cols; j++){
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public Matrix addMatrix(Matrix otherMatrix){

        //validate matrix have same dimentions
        if(this.rows != otherMatrix.rows ||
            this.cols != otherMatrix.cols){
            System.out.println("Matrix dimentions do not match for addition.");
            return null;
        }

        Matrix resultMatrix = new Matrix(this.rows, this.cols);

        for(int i =0; i< rows; i++){
            for(int j=0; j< cols; j++){
                resultMatrix.data[i][j] = this.data[i][j] + otherMatrix.data[i][j];
            }
        }
        return resultMatrix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of cols: ");
        int cols = sc.nextInt();

        //create two matrix
        Matrix matrix1 = new Matrix(rows, cols);
        Matrix matrix2 = new Matrix(rows, cols);

        System.out.println("\nMatrix 1:");
        matrix1.acceptMatrixElements();

        System.out.println("\nMatrix 2:");
        matrix2.acceptMatrixElements();

        System.out.println("\nMatrix 1:");
        matrix1.displayMatrix();
        System.out.println("\nMatrix 2:");
        matrix2.displayMatrix();

        //perform matrix addition and dispaly result
        Matrix sumResult = matrix1.addMatrix(matrix2);

        if(sumResult != null){
            System.out.println("\nResult of Matrix Addition:");
            sumResult.displayMatrix();
        }
        sc.close();
    }
}
