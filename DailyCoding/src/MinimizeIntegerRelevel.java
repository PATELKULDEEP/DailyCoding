import java.util.Scanner;

public class MinimizeIntegerRelevel {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long N = input.nextLong();
        int K = input.nextInt();
        String newN = String.valueOf(N);
        if(K == 0){
            System.out.println(N);
        }
        else{


                int len = newN.length();
                if(newN.charAt(0) != '1'){
                    newN = "1"+newN.substring(1,len);
                    for(int i=1;i<K&&i<len;i++){
                        newN = newN.substring(0,i) + "0"+newN.substring(i+1,len);
                    }
                }
                else {
                    for(int i=1;i<K+1&&i<len;i++){
                        newN = newN.substring(0,i) + "0"+newN.substring(i+1,len);
                    }
                }


        }
        int num = Integer.parseInt(newN);
        System.out.println(num);
    }

}
