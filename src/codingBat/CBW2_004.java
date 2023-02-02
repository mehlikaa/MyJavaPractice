package codingBat;

public class CBW2_004 {
    // Count the number of "xx" in the given string. We'll say that overlapping is allowed,
    // so "xxx" contains 2 "xx".
    //  countXX("abcxx") → 1
    //  countXX("xxx") → 2
    //  countXX("xxxx") → 3
    public static int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            System.out.println(str.substring(i, i + 2));
            if (str.substring(i, i + 2)=="xx") count++;
            //if (str.substring(i, i + 2).equals("xx")) count++;
        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        countXX("1xx4xxx8xx");
    }
}
//    public static int countXX(String str){
//        int result=0;
//        str=str.toLowerCase();
//
//        System.out.println(str);
//        if(str.contains("xx")){
//            for (int i = 0; i <=str.length() ; i++) {
//                str.indexOf("xx");
//                str=str.substring(str.indexOf("xx")+1);
//                System.out.println("==str : :"+ str +"\t==result : "+result);
//                result++;
//            }
//        } else System.out.println("xx bulunmamaktadir.");
//        System.out.println("str : :"+ str +"\tresult : "+result);
//        return result;
//    }

