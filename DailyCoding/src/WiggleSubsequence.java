public class WiggleSubsequence {

    public static void main(String[] args) {

        int[] arr = {1,7,4,9,2,5};

        System.out.println(maxWiggleLength(arr));

    }

    public static int maxWiggleLength(int[] nums){

        if(nums.length == 0)
            return 0;

        int[] inc = new int[nums.length];
        int[] dec = new int[nums.length];

        inc[0] = 1;
        dec[0] = 1;



        for(int i = 1 ; i < nums.length; i++)
        {
            if( nums[i] > nums[i-1] )
            {
                inc[i] = dec[i-1]+1;
                dec[i] = dec[i-1];
            }
            else if(nums[i] < nums[i-1])
            {
                dec[i] = inc[i-1]+1;
                inc[i] = inc[i-1];
            }
            else
            {
                dec[i] = dec[i-1];
                inc[i] = inc[i-1];
            }
        }

        return Math.max(dec[nums.length-1],inc[nums.length-1]);

    }


}
