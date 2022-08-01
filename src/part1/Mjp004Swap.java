package part1;

public class Mjp004Swap {

    public static void main(String[] args) {

        int x1=2, x2=5 , x3=0;
        System.out.println(" x1 : "+ x1+"\tx2 : "+x2+"\tx3 : "+ x3);
        x3=x1;
        x1=x2;
        x2=x3;

        System.out.println(" x1 : "+ x1+"\tx2 : "+x2+"\tx3 : "+ x3+"\n------------");


        int x = 12, y = 25;
        System.out.println("Original values of x and y");
        System.out.println("x = " + x);
        System.out.println("y = " + y);


        x = x ^ y ^ (y = x);
        System.out.println("Swapped values of x and y");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }

}
