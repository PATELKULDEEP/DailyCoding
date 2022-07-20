public class NumberOfSubsequence {

    public static void main(String[] args) {

        String s = "abcde";
        String[] words = {"a","bb","acd","ace"};

        System.out.println(numMatchingSubseq(s,words));

    }

    public static int numMatchingSubseq(String s, String[] words) {

        int count = 0;
            for(int j=0;j< words.length;j++) {
                int check = words[j].length()-1;
                String word = words[j];
                for (int i = 0,k=0; i < s.length() ; i++) {

                    if(word.charAt(k) == s.charAt(i)){
                        if(check == 0){
                            count++;
                            break;
                        }
                        check--;
                        k++;
                    }

                }

            }


        return count;
    }

}
