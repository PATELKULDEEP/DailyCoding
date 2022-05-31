import java.util.HashSet;

public class HashSetInputOutput {

    public static void main(String[] args){


        HashSet<Integer> hs = new HashSet<>();

        for(int i=0;i<10;i++){
            hs.add(i);
        }
        System.out.print(hs);

    }

}
