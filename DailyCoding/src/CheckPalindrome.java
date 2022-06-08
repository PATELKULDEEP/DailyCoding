import java.util.Scanner;

public class CheckPalindrome {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String s = input.next();
        System.out.println(checkPalindrome(s));

    }
    public static boolean checkPalindrome(String s){

        String newS = "";
        for(int i=s.length()-1;i>=0;i--){
            newS = newS + s.charAt(i);
        }
        if(s.equals(newS)){
            return true;
        }

        return false;
    }

}
