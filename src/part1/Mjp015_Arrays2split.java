package part1;

import java.util.Arrays;

public class Mjp015_Arrays2split {
    public static void main(String[] args) {
        String message="Bir berber bir berbere, Gel beraber, bir berber dukyani acalim demis.";

        System.out.println("message = " + message);
        String arr1[]=message.split(" ");
        String arr2[]=message.split(",");
        String arr3[]=message.split("");
        System.out.println("Arr1 : "+Arrays.toString(arr1));
        System.out.println("Arr2 : "+Arrays.toString(arr2));
        System.out.println("Arr3 : "+Arrays.toString(arr3));
    }
}
