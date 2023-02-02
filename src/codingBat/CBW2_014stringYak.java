package codingBat;

public class CBW2_014stringYak {
    //Suppose the string "yak" is unlucky. Given a string, return a version where all
    // the "yak" are removed, but the "a" can be any char. The "yak" strings will not overlap.
    //  stringYak("yakpak") → "pak"
    //  stringYak("pakyak") → "pak"
    //  stringYak("yak123ya") → "123ya"
    public static void main(String[] args) {
        stringYak("Mehlikayakgemileri");
    }
    public static String stringYak(String str) {
        String result="";

        for (int i = 0; i <str.length() ; i++) {
            if (str.toLowerCase().contains("yak"))
                str=str.replaceAll("yak","");
        }
        System.out.println(str);
        return str;
    }
}
