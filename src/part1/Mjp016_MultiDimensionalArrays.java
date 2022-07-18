package part1;

import java.util.Arrays;

public class Mjp016_MultiDimensionalArrays {
    public static void main(String[] args) {
        int arr[][]={{1,2},{3,4},{5,6}};
        arr[1][0]=2;
        System.out.println("0 indexli inner array : " +Arrays.toString(arr[0])); 		// inner Arrayleri yazdirma
        System.out.println("arr[0][1] : "+ arr[0][1]);			// belirli bir elemani verir.
        System.out.println("Arrays.toString(arr) : "+Arrays.toString(arr)+"\t \t referanslari verir.");    	// referansi verir.hatali yazim

        //Tum elemanlarini yazdirabilmek icin.
        for (int i=0; i<arr.length; i++) {
            for (int j=0 ; j<arr[i].length ; j++){
                System.out.print("arr["+i+"]["+j+"] : "+arr[i][j]+ " \t\t\t");
            }System.out.print("\n");
        }

        // Inner array icindekileri sayilari kendi icinde carptirma.
        int carp=1;
        for (int i=0; i<arr.length; i++) {
            carp=1;
            for (int j=0 ; j<arr[i].length ; j++){
                //System.out.println("arr["+i+"]["+j+"] : "+arr[i][j]+ " ");
                carp*=arr[i][j];
            }System.out.println(i+". arrayin sayilari Carpimi : "+carp);
        }
    }
}
