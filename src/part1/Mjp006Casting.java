package part1;

public class Mjp006Casting {
    public static void main(String[] args) {
        byte xb=105;
        int xi=xb;
        short xs=xb;
        double xd=xb;
        long xl=xb;
        long xll= (long) xd;
        float xf=xb;

        System.out.println("xb : "+xb);
        System.out.println("xs : "+xs);
        System.out.println("xd : "+xd);
        System.out.println("xl : "+xl);
        System.out.println("xi : "+xi);

        double d=100.0;
        int i= (int) d;
        byte b= (byte) d;
        System.out.println(" double  : "+d);
        System.out.println(" integer : "+i);
        System.out.println(" byte    : "+b);


    }
}
