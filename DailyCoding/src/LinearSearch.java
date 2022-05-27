import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i< n;i++){
            arr[i] = input.nextInt();
        }
        System.out.print("Enter Element to Find : ");
        int target = input.nextInt();
        System.out.println(search( arr, target));

    }
    static int search(int[] arr,int target){

        for(int j=0;j<arr.length;j++){
            if(arr[j] == target){
                return target;
            }
        }

        return -1;
    }


}
