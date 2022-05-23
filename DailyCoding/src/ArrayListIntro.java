import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListIntro {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

//        Defining arraylist
        ArrayList<Integer> list = new ArrayList<Integer>();
//        ArrayList<String> list1 = new ArrayList<>();
//        ArrayList<Boolean> list2 = new ArrayList<>();

//        Adding Elements in ArrayList
        list.add(1);
        list.add(2);
        int j = 0;
        while(j < 4){
            int value = input.nextInt();
            list.add(value);
            j++;
        }

//        Printing list
        System.out.println(list);

//        getting list value
        System.out.println(list.get(2));

//        setting in value or replacing the value
        list.set(1,0);
        System.out.println(list);

//        Adding value at first
        list.add(0,-1);
        System.out.println(list);

//        deleting element in list
        list.remove(0);
        System.out.println(list);

    }

}
