package part1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Mjp014_Arrays1 {
    public static void main(String[] args) {

        int arrr[]=new  int[9];
        int arr[];
        int[] arr1;       // declare

        int[] arr2;
        int[] arr3={1,2,3,4,5};     // initialize

        arr1=new int[5];
        arr2= new int[]{1, 2, 3, 4, 5,6};

        arr2[3]=121;
        System.out.println("arr1 = " + Arrays.toString(arr1));
        System.out.println("arr2 = " + Arrays.toString(arr2));
        System.out.println("arr3 = " + Arrays.toString(arr3));

        System.out.println("arr2 [3] : "+ arr2[3]);

        //elemanlari alt alta yazdirma
//        for (int i = 0; i < arr2.length; i++) {
//            System.out.println("Array2'nin "+i+". elemani : "+arr2[i]);
//        }
        //sort yapmamiz sart
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        System.out.println("Binarysearch, arr2'de 121 var mi  = " + Arrays.binarySearch(arr2,121));
        System.out.println("Binarysearch, arr2'de 121 var mi  = " + Arrays.binarySearch(arr2,14));   // -6
            // olmayan degerler - ile sonuclanir. eger olsaydi hangi indexte olacagini soyler.

        int arr11[]={1,5,8,11,6};
        int arr22[]={5,1,8,11,6};
        System.out.println("arr11 ve arr22 equals ? "+Arrays.equals(arr11,arr22));
        //sort yapilmali
        Arrays.sort(arr11);
        Arrays.sort(arr22);
        System.out.println("Sorttan sonra\narr11 ve arr22 equals ? "+Arrays.equals(arr11,arr22));

    }
}
