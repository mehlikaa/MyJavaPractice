package codingBat.String2;

public class CBS2_001doulbleChar {
    // Given a string, return a string where for every char in the original, there are two chars.
    //  doubleChar("The") → "TThhee"
    //  doubleChar("AAbb") → "AAAAbbbb"
    //  doubleChar("Hi-There") → "HHii--TThheerree"
    public static void main(String[] args) {
        doubleChar("Mehlika");
    }

    public static String doubleChar(String str) {

        String result="";

        for (int i = 0; i <str.length() ; i++) {
            result = result+String.valueOf(str.charAt(i))+String.valueOf(str.charAt(i));
        }
        System.out.println("Result : "+ result);
        return result;
    }
}
