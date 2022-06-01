import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args){

//        int[] nums1 = {2,0};
//        int[] nums2 = {1};
//        int m=1,n=1;

//        int[] nums1 = {0};
//        int[] nums2 = {1};
//        int m=0,n=1;
//        int[] nums1 = {-2,-1,0,0,3,4,0,0,0,0,0,0,0};
//        int[] nums2 = {-1,-1,0,1,2,5,6};
//        int m = 6, n = 7;
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m=3,n=3;
        System.out.print(Arrays.toString(merge(nums1, m, nums2, n)));
    }
    static int[] merge(int[] nums1, int m, int[] nums2, int n){

//       for(int i=0;i<n;i++){
//           nums1[i+m] = nums2[i];
//       }
//       Arrays.sort(nums1);

//        Merging using insertion method;
       int size = m+n;

       if(m == 0){
           for(int i=0;i<size;i++){
               nums1[i] = nums2[i];
           }
       }

       if(n != 0 && m != 0){
            int i=0,j=0;
           while(j<n){

               if(nums1[i] <= nums2[j] && i < m+j){
                   nums1[i] = nums1[i];
                   i++;
               }
              else{
                   for(int k=size-1;k > i ; k--){
                       nums1[k] = nums1[k-1];
                   }
                   nums1[i] = nums2[j];
                   j++;
               }




           }

       }


        return nums1;
    }

}
