package part1;

public class Mjp008StringManipulation1 {
    public static void main(String[] args) {
        // Soru 5) Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin.
    String x="seda";
    String y="";
        System.out.println("x : "+x);
        for (int i = x.length()-1; i >=0 ; i--) {
             y=y+x.charAt(i);
        }
        System.out.println(" Y : "+y);

        y="";
        for (int i = 0; i <x.length() ; i++) {
            y=x.charAt(i)+y;

        }
        System.out.println(" Y2 : "+y);
    }
}
