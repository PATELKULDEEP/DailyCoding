import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args){

        int[] nums1 = {-2,-1,0,0,3,4,0,0,0,0,0,0,0};
        int[] nums2 = {-1,-1,0,1,2,5,6};
        int m = 6, n = 7;
        System.out.print(Arrays.toString(merge(nums1, m, nums2, n)));
    }
    static int[] merge(int[] nums1, int m, int[] nums2, int n){

       for(int i=0;i<n;i++){
           nums1[i+m] = nums2[i];
       }
       Arrays.sort(nums1);
       return nums1;
    }

}
