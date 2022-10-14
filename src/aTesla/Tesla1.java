package aTesla;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Tesla1 {
// you can write to stdout for debugging purposes, e.g.   System.out.println("this is a debug message");
    //For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5. Given N = 32 the function should return 0, because N has binary representation '100000' and thus no binary gaps.
        //Write an efficient algorithm for the following assumptions   //N is an integer within the range [1..2,147,483,647].
        public static void main(String[] args) {
            solution(1041);
        }

    public static int solution(int N) {
        int count=0;
        List<String> listim =new ArrayList<>();
        String strResult = Integer.toBinaryString(N);
        int max=0;
        System.out.println(strResult);

        for (int i = 0; i < strResult.length(); i++) {

            //System.out.print(" strResult.charAt(i)  "+ strResult.charAt(i));
            if (strResult.charAt(i)=='1'){

                count++;
                //System.out.println("Index numberi : "+ strResult.charAt(i));
    }

        }System.out.println("Count "+count);

        if (count >1) {
            listim=new ArrayList<>(Arrays.asList(strResult.split("1")));
            System.out.println("list "+listim);

        }

        for (int i = 1; i <listim.size() ; i++) {
            if (listim.get(i) == listim.get(i-1)) {
             max=listim.get(i).length();
            }
        }
        System.out.println("Max 0: "+ max);

        return N;
    }

}
