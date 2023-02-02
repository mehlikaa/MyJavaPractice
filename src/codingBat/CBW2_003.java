package codingBat;

public class CBW2_003 {
//    Given a string and a non-negative int n, we'll say that the front of the string is
//    the first 3 chars, or whatever is there if the string is less than length 3.
//    Return n copies of the front;
//    frontTimes("Chocolate", 2) → "ChoCho"
//    frontTimes("Chocolate", 3) → "ChoChoCho"
//    frontTimes("Abc", 3) → "AbcAbcAbc"

    public static void main(String[] args) {
        frontTimes("",5);
    }
    public static String frontTimes(String word, int count){
        String result="";

        for (int i = 0; i <count ; i++) {
            if(word.length()>0 && word.length()<4){
                result+=word;
            }
            else if (word.length()>=4){
                result+=word.substring(0,3);
            } else result ="blank";
        }
        System.out.println("result :"+ result);
        return result;
    }
}
