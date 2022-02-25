import java.util.Random;

public class MJP001 {
    //Random claas'i kullanilarak,1-200 arasinda bir sayi uretilir.
    //100'den buyuk, kucuk yada 100'e esit oldugu kontorl edilir.
    public static void main(String[] args) {
        Random rand=new Random();
        int x= rand.nextInt(200);
        System.out.println(x);
        if (x>100){
            System.out.println("Sayimiz 100den buyuktur.");
        }else if(x<100){
            System.out.println("Sayimiz 100den kucuktur.");
        } else
            System.out.println("Sayimiz 100.");
    }
}
