package part1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mjp017_ArrayToList {
    public static void main(String[] args) {
        String arr1[]=new String[6];
        String arr2[]={"m","e","h","l","i","k","a"};

        List<String> list1=Arrays.asList(arr2);
        System.out.println("Arr2 : "+Arrays.toString(arr2) );
        System.out.println("list1"+list1);

//        list1.add("b");                 //arrayden cevrilen list icin, add, remove ve clear kullanilamaz.
//        System.out.println("list1"+list1);  //UnsupportedOperationException

        List<String> list2=new ArrayList<>();

        list2.add("a");
        list2.add("b");
        list2.add(1,"e");
        System.out.println( list2.remove("e"));
        System.out.println( list2.remove(0));
    }
}
