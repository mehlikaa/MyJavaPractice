import java.util.Scanner;

public class Mjp012DoWhileLoop {
    //Bir sayi isteyin ve girilen sayi sifir olana kadar sayilari toplayin ve 0'a basildiginda toplami yazdirin.
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int topla = 0,x =0;
        do {
            System.out.print("Bir sayi giriniz : ");
            x=scan.nextInt();
            topla+=x;
        }while(x!=0);
        System.out.println("topla = " + topla);

        //Kullanicidan toplamak icin sayi isteyin ve toplam 100’e ulasincaya kadar devam istemeyi ettirin.
        // Toplam 500’e ulastiginda veya gectiginde toplami ve kac sayi girildigini yazdirin
        int topla2 = 0,x2 =0;
        do {
            System.out.print("Bir sayi giriniz : ");
            x2=scan.nextInt();
            topla2+=x2;
        }while(topla2<100);
        System.out.println("topla2 = " + topla2);
    }
}
