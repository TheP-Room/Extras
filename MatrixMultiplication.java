import java.util.Scanner;
public class MatrixMultiplication {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows,cols,rows1,cols1;
        System.out.println("--------------------------");
        System.out.print("Rows for Matrix 1 :");
        rows = sc.nextInt();
        System.out.print("Columns for Matrix 1 :");
        cols = sc.nextInt();
        System.out.println("--------------------------");
        System.out.print("Rows for Matrix 2 :");
        rows1 = sc.nextInt();
        System.out.print("Columns for Matrix 2 :");
        cols1 = sc.nextInt();
        System.out.println("--------------------------");
        int[][] mt1 = new int[rows][cols];
        int[][] mt2 = new int[rows1][cols1];
        int[][] mt3 = new int[rows][cols1];
        if (cols != rows1) {
            System.out.println("Matrix Multiplication not defined.");
            System.out.println("--------------------------");
        }
        else {
            System.out.println("Enter Data of Matrix 1 :");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print("Element " + i + ',' + j + " : ");
                    mt1[i][j] = sc.nextInt();
                }
            }
            System.out.println("--------------------------");
            System.out.println("Enter Data of Matrix 2 :");
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols1; j++) {
                    System.out.print("Element " + i + ',' + j + " : ");
                    mt2[i][j] = sc.nextInt();
                }
            }
            System.out.println("--------------------------");
            System.out.println("Matrix 1 : ");
            for (int i = 0; i<rows; i++){
                for (int j = 0; j<cols; j++){
                    System.out.print(mt1[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("--------------------------");
            System.out.println("Matrix 2 : ");
            for (int i = 0; i<rows1; i++){
                for (int j = 0; j<cols1; j++){
                    System.out.print(mt2[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("--------------------------");
            System.out.println("Multiplication : ");
            int temp = 0;
            for (int i = 0; i<rows; i++){
                for (int j = 0; j<cols1; j++){
                    for (int k = 0; k<cols; k++){
                        temp += mt1[i][k]*mt2[k][j];
                    }
                    mt3[i][j] = temp;
                    temp = 0;
                }
            }
            for (int i = 0; i<rows; i++){
                for (int j = 0; j<cols1; j++){
                    System.out.print(mt3[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("--------------------------");
        }
    }
}
