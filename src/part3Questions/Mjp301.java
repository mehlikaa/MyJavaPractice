package part3Questions;

public class Mjp301 {
        /*  Problem Tanımı  :   Kullanıcıdan üç adet sayı alarak bu sayıların
        bir dik üçgenin kenar uzunlukları olup olmadığını hesaplatan bir kod yazınız
        (Yardım: Bir üçgenin dik olduğunu anlamak için a2+b2=c2 pisagor bağlantısından yararlanabilirsiniz)

        Örnek Ekran Çıktısı
        birinci kenarı giriniz: 2    ikinci kenarı giriniz 15       üçüncü kenarı giriniz: 7
        Bu bir dik üçgen değildir.
        Bu bir dik üçgendir         */
        public static void main(String[] args) {
            int x=5,y=10,z=14;

            if((x+y==z)||(x+z==y)||(y+z==x)){
                System.out.println("Bu ucgen bir dik ucgendir.");
            } else System.out.println("Bu ucgen bir dik ucgen degildir.");
        }
}
