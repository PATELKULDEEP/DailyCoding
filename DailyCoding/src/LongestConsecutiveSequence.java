import java.util.Arrays;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {

        int[] nums = {0,3,7,2,5,8,4,6,0,1};

        System.out.println(longestConsecutive(nums));

    }

    public static int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }

        Arrays.sort(nums);

        int max = 1;
        int max1=1;
        for(int i=0;i<nums.length-1;i++){

            if(nums[i]+1 == nums[i+1]){
                max++;
            }
            else if(nums[i] == nums[i+1]){

            }
            else{

                max = 1;

            }
            if(max > max1){
                max1 = max;
            }


        }


        return max1;

    }

}
