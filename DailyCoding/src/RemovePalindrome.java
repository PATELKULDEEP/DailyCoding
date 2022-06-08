import java.util.Scanner;

public class RemovePalindrome {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String s = input.next();
        System.out.println(removePalindromeCount(s));

    }

    public static int removePalindromeCount(String s){
        int countBack = 0,countFront =0;
        String newSBack = s;
        String newSFront = s;

        for(int i=0;i<s.length();i++){

            System.out.println(newSBack);

            if(checkPalindrome(newSBack))
            {
                newSBack = newSBack.substring(newSBack.length());
                countBack++;
            } else {
                newSBack = newSBack.substring(0,newSBack.length()-1);
                countBack++;
            }
            if(newSBack.equals("")){
                break;
            }

        }
        for(int i=0;i<s.length();i++){

            System.out.println(newSFront);

            if(checkPalindrome(newSFront))
            {
                newSFront = newSFront.substring(newSFront.length());
                countFront++;
            } else {
                newSFront = newSFront.substring(i+1);
                countFront++;
            }
            if(newSFront.equals("")){
                break;
            }

        }
        if(countBack < countFront){
            return countBack;
        }


        return countFront;
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
