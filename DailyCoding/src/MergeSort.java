import java.util.Scanner;

public class MergeSort {

    static int[] arr = new int[20];


    public static void main(String[] args){

        System.out.println("Merge Sort");
        input();
        output();
    }

    private static void output() {
        int i = 0;
//        merSort(arr[],l,r);
        while( arr[i] > 0){
            System.out.print(arr[i]);
            i++;
        }
    }

    public static void input(){
        Scanner input = new Scanner(System.in);
        int i = 0;
        System.out.println("Enter the Number and to end the list enter any negative number : ");
        while(i < 20){
        int x = input.nextInt();
        if(x<0)
            break;
        arr[i] = x;
        i++;
        }
    }

//    public static void merSort(arr[], l, r){

//        if(l <= r){
//
//        int mid = (l+r)/2;
//
//        merSort(arr[], l, mid);
//        merSort(arr[],mid+1,r);
//
//        merge(arr[],l,mid,r);
//        }

//    }

}
