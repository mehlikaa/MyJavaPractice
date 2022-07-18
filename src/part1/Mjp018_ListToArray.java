package part1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mjp018_ListToArray {
    public static void main(String[] args) {
        List<String> list1=new ArrayList<>();
        List<String> list2= Arrays.asList("m","e","h","l","i","K","a");

        //birinci yontem
        String arr1[]=list2.toArray(new String[0]);

        System.out.println("List2 : "+list2);
        System.out.println("arr1  : "+Arrays.toString(arr1));

        //ikinci yontem
        Object arr2[]=list2.toArray();
        System.out.println("List2 : "+list2);
        System.out.println("arr2  : "+Arrays.toString(arr2));

    }
}
