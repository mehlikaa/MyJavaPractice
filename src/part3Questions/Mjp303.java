package part3Questions;

public class Mjp303 {
    /*Problem Tanımı
        100'den 0'a kadar 13'e tam bölünebilen sayıları ve toplamlarını ekrana yazdırınız (büyükten küçüğe).
    Ekran Çıktısı
        91
                78
                65
                52
                39
                26
                13       */
    public static void main(String[] args) {
        int topla=0;
        for (int i = 1; i < 100; i++) {
            if ((i%13==0)){
                System.out.print("i = " + i+"\t");
                topla+=i;
            }
        }
        System.out.println("\nToplam : "+topla);

            topla=0;
            for (int i = 100; i > 0; i--) {
                if ((i%13==0)){
                    System.out.print("i = " + i+"\t");
                    topla+=i;
                }
            }
            System.out.println("\nToplam : "+topla);
    }
}
