import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class EvenNumberDigits {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a size of array : ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){

            arr[i] = input.nextInt();

        }
        System.out.println(findNumbers(arr));

    }
    static int findNumbers(int[] nums){

        int count =0;

        for(int i=0;i<nums.length;i++){
            String s = String.valueOf(nums[i]);
            if(s.length() % 2 == 0){
                count++;
            }
        }
        return count;





//        int count = 0;
//        for(int i=0;i<nums.length;i++){
//            int size = 0;
//            int number = nums[i];
//            while(number > 0){
//                number = number/10;
//                size++;
//            }
//            if(size%2 == 0){
//                count++;
//
//            }
//
//        }
//
//        return count;
    }

}
