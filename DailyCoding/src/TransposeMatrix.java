import java.util.Scanner;
public class TransposeMatrix
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        int[][] arr = new int[m][n];
        for(int i=0 ;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = input.nextInt();
            }
        }
        int ar[][] = transposeMatrix(arr);

        for(int i=0 ;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static int[][] transposeMatrix(int[][] matrix){
        // [M,N]  [N,M]
        // [[1,2,3]
        //   ,[4,5,6],
        //[7,8,9]]
        //  [[1,4,7],
        //   [2,5,8]
        //   [3,6,9]
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] newMatrix = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                newMatrix[i][j] = matrix[j][i];
            }
        }

        return newMatrix;
    }
}