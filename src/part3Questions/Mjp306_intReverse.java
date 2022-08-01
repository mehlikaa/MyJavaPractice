package part3Questions;

public class Mjp306_intReverse {
    public static void main(String[] args) {
        System.out.println("My number = " + 13579);
        reverse(-13579);
    }
    public static int reverse(int x) {
        String rev="";
        String xS;
        int c=0;
        if(x<0) c=1;
            if(c==1) x = -x;
            xS= String.valueOf(x);
            for (int i = 0; i < xS.length(); i++) {
                rev = xS.charAt(i) + rev;
            }
            x = Integer.parseInt(rev.replaceAll("\\D", ""));
        if(c==1) x=-x;

        System.out.println("Rev = " + rev);
        System.out.println("x = " + x);

        return x;
    }

}
