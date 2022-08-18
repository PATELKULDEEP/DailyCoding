
import java.util.Scanner;

public class SumOfDigit1toN
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p = input.nextInt();
        int r = input.nextInt();
        int x = input.nextInt();

        int smallest = r;
        int largest = p;

        for(int i=p;i<r;i++){

            int n = i;
            int sum = 0;
            while (n != 0) {
                sum = sum + n % 10;
                n = n / 10;
            }

            if(sum == x){
                smallest = i;
                break;
            }

        }
        for(int j=r;j>p;j--){
            int n = j;
            int sum = 0;
            while (n != 0) {
                sum = sum + n % 10;
                n = n / 10;
            }

            if(sum == x){
                largest = j;
                break;
            }
        }

        System.out.println(smallest);
        System.out.println(largest);

    }
}
