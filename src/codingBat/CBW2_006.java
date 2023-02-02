package codingBat;

public class CBW2_006 {
    //Given a string, return a new string made of every other char starting with the first,
    // so "Hello" yields "Hlo".
    //  stringBits("Hello") → "Hlo"
    //  stringBits("Hi") → "H"
    //  stringBits("Heeololeo") → "Hello"

    public static void main(String[] args) {
        stringBits("Heeololeo");
    }
    public static String stringBits(String str){
        String result="";

        for (int i = 0; i <str.length() ; i+=2) {
            //result+=str.substring(i,i+1);         // 1. yontem; substring
            result+=str.charAt(i);                  // 2. yontem; charAt
        }
        System.out.println("result : " + result);
        return result;
    }
}
