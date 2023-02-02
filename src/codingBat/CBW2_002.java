package codingBat;

import java.util.Scanner;

public class CBW2_002 {
    //Given a string and a non-negative int n, return a larger string that is n copies of the original string.
//    stringTimes("Hi", 2) → "HiHi"
//    stringTimes("Hi", 3) → "HiHiHi"
//    stringTimes("Hi", 1) → "Hi"

    public static String stringTimes(String str, int n) {
        String returnStr = "";
        for (int i = 0; i < n; i++) {
            returnStr+=str;
        }
        System.out.println("returnStr :"+returnStr);
        return returnStr;
    }

    public static void main(String[] args) {
         Scanner scan=new Scanner(System.in);
         System.out.print("Bir kelime yaziniz? ...");
         String word=scan.next();
         System.out.print("Pozitif bir sayi yaziniz? ...");
         int count= scan.nextInt();

         stringTimes(word,count);

    }

}
