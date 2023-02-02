package HogartJan11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hogart2 {
    public static void main(String[] args) {

        String x = "5698743146";
        String arr[]=new String[10];
        List myList=new ArrayList<>();
        List my2List=new ArrayList<>();

        arr=x.split("");
        System.out.println("My Array :"+ Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("My Sorted Array :"+ Arrays.toString(arr));

        for (int i = 0; i <arr.length ; i++) {
            if(Integer.parseInt(arr[i])%2==1){
                myList.add(arr[i]);
            }
        }
        System.out.println(myList);

        for (int i = myList.size()-1; i >= 0 ; i--) {
            my2List.add(myList.get(i));
        }
        System.out.println("My2List :"+my2List);

    }
}
