import java.util.Arrays;
import java.util.Scanner;

public class SquareOfSortedArray {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i< n ;i++){
            arr[i] = input.nextInt();
        }
        int[] square = squareOfDigit(arr);

        System.out.println(Arrays.toString(square));

        int[] sort = sortArray(square);

        System.out.println(Arrays.toString(sort));

    }
    static int[] squareOfDigit(int[] arr){

        int[] newArr = new int[arr.length];

        for(int i = 0; i< arr.length;i++){
            newArr[i] = arr[i]*arr[i];
        }

        return newArr;
    }
    static int[] sortArray(int[] arr ){

//        int[] newArr = new int[arr.length];
//        4,16,1,25
        for(int i = 0; i< arr.length;i++){
            int temp = 0 ;
            for(int j=i;j< arr.length;j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }

        return arr;
    }

}
