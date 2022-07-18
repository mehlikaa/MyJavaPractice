package part2;

public class Mjp023_constructor3 {
    String insV;
    static String staticV;
    public static void swing(){
        System.out.println("static method Swing ...");
    }
    public void climb(){
        System.out.println("method Climb");
    }
    public static void play(){
        System.out.println("static method Play ...");
        swing();

        //climb(); static method icinde static olmayan method calismaz.
        // obje ile cagirabiliriz.
        Mjp023_constructor3 obje=new Mjp023_constructor3();
        obje.climb();
    }

    public static void main(String[] args) {

        Mjp023_constructor3 rope=new Mjp023_constructor3();
        //static olan methodlar static mainden direk cagirilabilir.
        swing();
        play();
//        Mjp023_constructor3 rope2=null;   //  NullPointerException hatasi
//        rope2.climb();
        //sadece climb a bu sekilde ulasilabilir.

    }
}
