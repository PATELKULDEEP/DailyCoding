import java.util.Scanner;

public class OddSumRelevel {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int[] A = new int[N];
        int sum = 0;
        int odd = 0;
        int even = 0;
        for(int i=0;i<N;i++){
            A[i] = input.nextInt();
            if(A[i] % 2 == 0){
                even++;
            }
            else {
                odd++;
            }
            sum+= A[i];
        }
        if(sum%2 != 0){
            System.out.println(0);
        }
        else{
            if(odd%2 == 0){
                System.out.println(2);
            }
            else {
                System.out.println(1);
            }
        }
    }

}
