package codingBat;

import java.util.Locale;

public class CBW2_005 {
// Given a string, return true if the first instance of "x" in the
// string is immediately followed by another "x".
//  doubleX("axxbb") → true
//  doubleX("axaxax") → false
//  doubleX("xxxxx") → true

    public static void main(String[] args) {
        doubleX("Mehx");
    }
    public static boolean doubleX(String str){
        boolean bool = false;

        if(str.toLowerCase().contains("xx"))  {
            if(str.substring(str.toLowerCase().indexOf("x"),str.indexOf("x")+2).equals("xx")){bool=true;}
        }
        else bool=false;
        System.out.println("False/True : "+ bool);
        return bool;
    }
    //Solution:
    //boolean doubleX(String str) {
    //  int i = str.indexOf("x");
    //  if (i == -1) return false; // no "x" at all
    //
    //  // Is char at i+1 also an "x"?
    //  if (i+1 >= str.length()) return false; // check i+1 in bounds?
    //  return str.substring(i+1, i+2).equals("x");
    //
    //  // Another approach -- .startsWith() simplifies the logic
    //  // String x = str.substring(i);
    //  // return x.startsWith("xx");
    //}

}
