import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class NPrimeNumber {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the N : ");
        int n = input.nextInt();

        System.out.println(Arrays.toString(solve(n)));

    }
    public static int[] solve(int n) {

        ArrayList<Integer> al = new ArrayList<Integer>();

        for(int i = 1;i<=n;i++){

            if(isPrime(i)){
                al.add(i);
            }

        }
        int[] arr = new int[al.size()];
        for (int i = 0; i < al.size(); i++){
            arr[i] = al.get(i);

        }

        return arr;
    }
    static boolean isPrime(int n){

        if(n == 1 || n == 0)
            return false;
        for(int i=2;i<n;i++){
            if(n%i==0)return false;
        }
        return true;

    }

}
