import java.util.HashMap;
import java.util.Map;

class FirstUniqueCharacter {

    public static void main(String[] args) {
        System.out.println(firstUniqChar("kuldeep"));
    }

    public static int firstUniqChar(String s) {

//         1st Method :- 

        int freq [] = new int[26];
        for(int i = 0; i < s.length(); i ++)
            freq [s.charAt(i) - 'a'] ++;
        for(int i = 0; i < s.length(); i ++)
            if(freq [s.charAt(i) - 'a'] == 1)
                return i;
        return -1;

//         2nd Method :- 

//        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
//        int n = s.length();
//        // build hash map : character and how often it appears
//        for (int i = 0; i < n; i++) {
//            char c = s.charAt(i);
//            count.put(c, count.getOrDefault(c, 0) + 1);
//        }
//
//        // find the index
//        for (int i = 0; i < n; i++) {
//            if (count.get(s.charAt(i)) == 1)
//                return i;
//        }
//        return -1;

//         3rd Method :- 

//        HashMap<String,Integer> hm = new HashMap<>();
//        int len = s.length();
//        for(int i=0;i<len;i++){
//            if(!hm.containsKey(s.substring(i,i+1))){
//                hm.put(s.substring(i,i+1),i);
//            }
//            else{
//                hm.put(s.substring(i,i+1),len+2);
//            }
//        }
//
//        int ans =len+10;
//
//        for (Map.Entry<String,Integer> entry : hm.entrySet()) {
//
//            if(entry.getValue() < ans){
//                ans = entry.getValue();
//            }
//
//        }
//        if(ans < len) return ans;
//        return -1;


//     4th Method :- O(N^2)    In this TLE Comes;

//        if(s.length() == 1){
//            return 0;
//        }
//
//        for(int i=0;i<s.length();i++){
//            boolean check = false;
//            for(int j=0;j<s.length();j++)
//            {
//                if((s.substring(i,i+1).equals(s.substring(j,j+1))) && i != j){
//                    check = true;
//                }
//            }
//            if(!check){
//                return i;
//            }
//        }
//        return -1;
    }
}