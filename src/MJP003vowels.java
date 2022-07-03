import javax.sound.midi.Soundbank;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MJP003vowels {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Metninizi giriniz : ");
        String str= scan.nextLine();

        List<String> list= List.of(str.toLowerCase().split(""));
        System.out.println("List : "+list);

        int count=0;
        for (int i = 0; i <list.size(); i++) {
            if(list.get(i).contains("a")||list.get(i).contains("e")||list.get(i).contains("i")||list.get(i).contains("o")||list.get(i).contains("u")) {
            count++;
            }
        }
        System.out.println(" Kelimemizde : "+count+"adet vowel bulunmaktadir.");
    }
}
