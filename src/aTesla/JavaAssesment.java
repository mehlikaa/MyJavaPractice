package aTesla;

import java.util.Scanner;

public class JavaAssesment {
    public static void main(String[] args) {
        // you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

        //For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5. Given N = 32 the function should return 0, because N has binary representation '100000' and thus no binary gaps.
        //Write an efficient algorithm for the following assumptions
        //N is an integer within the range [1..2,147,483,647].


     //public void write(){
         Scanner scan=new Scanner(System.in);
         System.out.println("Bir deger giriniz : ");
         int x=scan.nextInt();
         solution(x);

    }


        public static int solution(int N) {
            // write your code in Java SE 8
        if(N>0 && N<2147483647)
                System.out.println("N is an integer within the range [1..2,147,483,647]");
            else  System.out.println("N is NOT");

        return N;
        }

}
