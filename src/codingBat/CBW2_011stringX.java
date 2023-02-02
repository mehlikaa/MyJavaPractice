package codingBat;

public class CBW2_011stringX {
    //Given a string, return a version where all the "x" have been removed.
    // Except an "x" at the very start or end should not be removed.
    // stringX("xxHxix") → "xHix"
    // stringX("abxxxcd") → "abcd"
    // stringX("xabxxxcdx") → "xabcdx"
    public static void main(String[] args) {
        stringX("xmexxhxxlikax");
    }

    public static String stringX(String str) {
        String newStr = "";
        for (int i = 0; i < str.length()-1 ; i++) {
                if (str.charAt(i) != 'x')
                    newStr += str.substring(i, i + 1);
                    else {
                    newStr += "";
                    if(str.substring(i+1,i+2).equals("x")) {
                        newStr+=str.substring(i+1,i+2);
                        i++;
                    }
                    }
            }

        if (str.charAt(str.length()-1)=='x') newStr+="x";

        System.out.println(newStr);
        return newStr;
    }
}


