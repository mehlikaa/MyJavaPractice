package part1;

import java.util.List;
import java.util.Scanner;

public class MJP003vowels {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count;
        int blank;

        System.out.print("Metninizi giriniz : ");
        String str = scan.nextLine();
        // Kisa yontemle,  CharAt ile
        System.out.println("/nStr : " + str + "\nstr.lenght : " + str.length());
        count = 0;
        blank = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                blank++;
            }
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.println(" Kelimemizde : " + count + " adet vowel bulunmaktadir.");
        System.out.println(" Kelimemizde : " + (str.length() - count - blank) + " adet consonant bulunmaktadir.\n" + blank + " adet bosluk bulunuyor.");


//        //List kullanilarak
//        List<String> list = List.of(str.toLowerCase().split(""));
//        System.out.println("/n----LIST ----\nList : " + list);
//
//        count = 0;
//        blank=0;
//        for (int i = 0; i < list.size(); i++) {
//            if (str.charAt(i) == ' ') {
//                blank++;
//            }
//            if (list.get(i).contains("a") || list.get(i).contains("e") || list.get(i).contains("i") || list.get(i).contains("o") || list.get(i).contains("u")) {
//                count++;
//            }
//        }
//        System.out.println(" Kelimemizde : " + count + " adet vowel bulunmaktadir.");
//        System.out.println(" Kelimemizde : " + (list.size()- count - blank) + " adet consonant bulunmaktadir.\n" + blank + " adet bosluk bulunuyor.");
//
    }
    }