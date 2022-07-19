package part2;

public class Mjp028_Varargs {
    public static void main(String[] args) {
        new Mjp028_Varargs().add2(3,5,8,9); //statik olmayan metod ile
        add(1,8,5,3,7,9,76);
        add(8,9);
    }
    public  static void add(int x,int... sayi){  // dizi gibi davranir.
        int topla=0;
        for (int i:sayi
        ) {
            topla += i;
        }
        System.out.println("topla = " + topla);
        System.out.println("Carp : "+topla*x);
    }
    public  void add2(int... sayi){  // dizi gibi davranir.
        int topla=0;
        for (int i:sayi
        ) {
            topla += i;
        }
        System.out.println("topla = " + topla);

    }
}
