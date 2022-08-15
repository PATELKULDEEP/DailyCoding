public class ContiguousOnes {

    public static void main(String[] args) {

        System.out.println(checkOnesSegment("110"));

    }
    public static boolean checkOnesSegment(String s) {

        int size = s.length();

        for(int i=0;i<size-1;i++){

            if(s.substring(i,i+2) == "01"){
                return false;
            }

        }
        return true;

    }

}
