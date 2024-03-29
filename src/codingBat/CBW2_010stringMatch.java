package codingBat;

public class CBW2_010stringMatch {

    //Given 2 strings, a and b, return the number of the positions where they contain
    // the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and
    // "az" substrings appear in the same place in both strings.
    // stringMatch("xxcaazz", "xxbaaz") → 3
    // stringMatch("abc", "abc") → 2
    // stringMatch("abc", "axc") → 0
    public static void main(String[] args) {
        stringMatch("mehlika", "melikka");
    }
//    public static int stringMatch(String a, String b) {
//        if(a.length()<b.length()) {
//            for (int i = 0; i <a.length()-1 ; i++) {
//                if((a.charAt(i)==b.charAt(i))&&(a.charAt(i+1)==b.charAt(i+1)))
//                    count++;
//            }
//        }else{
//            for (int i = 0; i <b.length()-1 ; i++) {
//                if((a.charAt(i)==b.charAt(i))&&(a.charAt(i+1)==b.charAt(i+1)))
//                    count++;
//            }}
//            System.out.println(count);
//        return count;
//    }

    public static int stringMatch(String a, String b) {
        int len = Math.min(a.length(), b.length());

        int count = 0;

        for (int i = 0; i <len-1 ; i++) {
            String subA=a.substring(i,i+2), subB=b.substring(i,i+2);
            if(subA.equals(subB))
                count++;
        }
        return count;
    }
}
