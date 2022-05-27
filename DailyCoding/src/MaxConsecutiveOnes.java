import java.util.Scanner;

public class MaxConsecutiveOnes {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of Array : ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
        System.out.println(numberOfConsecutiveOnes(arr));


    }
    public static int numberOfConsecutiveOnes(int[] arr){
        int count = 0;
        int maxCount = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 1){
                count++;
                if( maxCount < count){
                    maxCount = count;
                }
            }
            else
                count = 0;

        }

        return maxCount;
    }

}
//
//  [1 1 0 1 1 1]
//