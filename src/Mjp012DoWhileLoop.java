import java.util.Scanner;

public class Mjp012DoWhileLoop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int topla = 0,x =0;
        do {
            System.out.print("Bir sayi giriniz : ");
            x=scan.nextInt();
            topla+=x;
        }while(x!=0);
        System.out.println("topla = " + topla);

    }
}
