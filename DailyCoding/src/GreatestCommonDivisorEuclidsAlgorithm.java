import java.util.Scanner;

public class GreatestCommonDivisorEuclidsAlgorithm {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Euclid's Algorithm");
        System.out.println("Enter two non-negative Integer");
        int p = input.nextInt();
        int q = input.nextInt();

        System.out.println(gcd(p,q));

    }

    public static int gcd(int p, int q){

        if(q == 0) return p;
        int r = p%q;
        return gcd(q,r);

    }

}
