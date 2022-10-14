package aTesla;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tesla2 {
// you can write to stdout for debugging purposes, e.g.   System.out.println("this is a debug message");
    //For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5. Given N = 32 the function should return 0, because N has binary representation '100000' and thus no binary gaps.
        //Write an efficient algorithm for the following assumptions   //N is an integer within the range [1..2,147,483,647].
        public static void main(String[] args) {
            for (int i = 0; i < 150; i++) {
                solution(i);          //0-10  545    641    302020304   2320
            }
        }

    public static int solution(int N) {

        List<String> listim =new ArrayList<>();
        String strResult = Integer.toBinaryString(N);
            int countOne=0;
            List<String> oneCountList=new ArrayList<>(Arrays.asList(strResult.split("")));
            //System.out.print("oneCountList = " + oneCountList+"\t\t");
            for (int i = 0; i <oneCountList.size() ; i++) {
                if(oneCountList.get(i).contains("1")){
                    countOne++;}
            }
            //System.out.println("countOne = " + countOne);
        System.out.print("N : "+N+"\t\t\t"+"MY number : "+strResult+"\t\t");
        int max=0;
        listim=new ArrayList<>(Arrays.asList(strResult.split("1")));
        //System.out.print("list1 "+listim+"\t\t");
        if(strResult.charAt(strResult.length()-1)=='0'){
            listim.remove(listim.size()-1);
            //System.out.print("SOn sifirlar atildan sonra : "+listim+"\t\t");
        }

        //if ((N==1)||(N==0)||(strResult.length()<1))
        if ((N==1)||(N==0))
        {max=0;        System.out.print("\t=>"); }
            else if ((countOne>1)||((listim.size()>2))){
                if(listim.size()>0){
                listim.remove(0);}
            //System.out.print("\tlist2 "+listim+"\t\t");
                for (int i = 0; i < listim.size(); i++) {
                    if (listim.get(i).length() > max)
                        max = listim.get(i).length();
                }
            } else max = 0;

            System.out.println("\tSon Max : " + max);

        return N;
    }

}
