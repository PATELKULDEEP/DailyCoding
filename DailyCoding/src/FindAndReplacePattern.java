import java.util.ArrayList;
import java.util.List;

public class FindAndReplacePattern {

    public static void main(String[] args) {
        String[] a = {"abc", "deq", "mee", "aqq", "dkd", "ccc"};
        String pattern = "abb";
        System.out.println(findAndReplacePattern(a,pattern));

    }
    public static List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res = new ArrayList<>();
        for (String word : words) {
            if (check(word, pattern)) res.add(word);
        }
        return res;
    }

    static boolean check(String a, String b) {
        for (int i = 0; i < a.length(); i++) {
                System.out.println("a = "+a.indexOf(a.charAt(i)) + " , b = "+b.indexOf(b.charAt(i)));
            if (a.indexOf(a.charAt(i)) != b.indexOf(b.charAt(i))) return false;
        }
        return true;
    }

}
