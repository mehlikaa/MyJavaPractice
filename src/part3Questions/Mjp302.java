package part3Questions;

import java.util.Scanner;

public class Mjp302 {
    static int eb;
    static int ek;
    /*
    Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve
    en kucuk olanlarini konsola yazdiriniz
*/
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Birinci sayiyi giriniz : ");
        int x1=scan.nextInt();
        System.out.print("Ikinci sayiyi giriniz :");
        int x2=scan.nextInt();
        System.out.print("Ucuncu sayiyi giriniz :");
        int x3=scan.nextInt();
        if(x1>x2){
            if(x1>x3){
                eb=x1;
            }else eb=x3;
        }else if(x2>x3){
                eb=x2;
            }else if(x3>x1){
                eb=x3;
            }

        System.out.println("eb = " + eb);

        if(x1<x2){
            if(x1<x3){
                ek=x1;
            }else ek=x3;
        }else if(x2<x3){
            ek=x2;
        }else if(x3<x1){
            ek=x3;
        }
        System.out.println("ek = " + ek);
    }
}
