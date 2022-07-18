package part1;

import java.util.Scanner;

public class Mjp007Modulus {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Cok basamakli bir sayi giriniz : ");
        int sayim=scan.nextInt();
        int topla=0;
        while (sayim >0) {
            topla+=sayim%10;
            sayim=sayim/10;
            System.out.println("sayim = " + sayim+"    Topla : "+topla);
        }
        System.out.println("topla = " + topla);
    }
}
