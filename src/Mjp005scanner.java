import java.util.Scanner;

public class Mjp005scanner {

    public static void main(String[] args) {
//scanner denemeler

        //---------
        Scanner scan=new Scanner(System.in);
        System.out.print("Isminiz : ");
        String name=scan.next();
        System.out.println("Bas harfi : "+name.substring(0,1));
        System.out.println("Ikinci karakter :"+name.substring(2,4));



        System.out.print("1. Sayiyi giriniz :  ");
        int x1=scan.nextInt();
        System.out.print("2. Sayiyi giriniz :  ");
        int x2=scan.nextInt();

        System.out.println("Toplamlari : "+ (x1+x2));
        System.out.println("Farklari   : "+ (x1-x2));
        System.out.println("Carpimlari   : "+ (x1*x2));

        System.out.println("-----\nKarenin kenar uzunlugu   : "+ x1);
        System.out.println("Karenin karesi    : "+ (x1*x1));
        System.out.println("Karenin cevresi    : "+ (x1*4));

    }
}
