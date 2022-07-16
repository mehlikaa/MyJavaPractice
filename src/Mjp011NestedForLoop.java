import java.util.Scanner;

public class Mjp011NestedForLoop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        int x=scan.nextInt();

        for (int i = 1; i <x ; i++) {
            System.out.print(i+" ");
            for (int j = 2; j <x ; j++) {
                System.out.print(i*j+" ");
            }
            System.out.print("\n");
        }
//  Example 2
//        for (int j = 1; j <= 10; j++) {
//            for (int i = 1; i <= 10; i++) {
//                System.out.print(i + "*" + j + "=" + (i * j) + " ");
//            }
//            System.out.println();
//        }

    }
}
