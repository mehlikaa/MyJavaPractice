package codingBat;

public class CBW2_007 {
//    Given a non-empty string like "Code" return a string like "CCoCodCode".
//    stringSplosion("Code") → "CCoCodCode"
//    stringSplosion("abc") → "aababc"
//    stringSplosion("ab") → "aab"

    public static void main(String[] args) {
        stringBits("Hello");
    }
    public static String stringBits(String str){
        String result="";

        for (int i = 0; i <= str.length() ; i++) {
            result+=str.substring(0,i);
        }
        System.out.println("result :"+result);
        return result;
    }
}
