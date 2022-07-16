import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mjp009Manipulation2 {
    public static void main(String[] args) {
//        Soru 7) Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
//        isim-soyisim : M***** B*******
//        kart no : **** **** **** 1234
        String fullName="Mehlika Balaban";
        fullName.trim();
        List<String> listim=new ArrayList<>(Arrays.asList(fullName.split("\\s")));
        System.out.println("list "+listim);

        for (int i = 0; i <listim.size() ; i++) {
            System.out.print(listim.get(i).charAt(0)+listim.get(i).substring(1).replaceAll("\\w","*")+" ");
        }

        //System.out.println(fullName.charAt(0)+fullName.substring(1, fullName.indexOf(" ")).replaceAll("\\w","*"));
                //fullName.substring(fullName.indexOf(" "),(fullName.indexOf(" ")+1)+fullName.indexOf(" ")+1).replaceAll("\\w","*"));
        String kartNo="1111 2222 3333 4444";
        System.out.println("\n"+kartNo.substring(0,kartNo.length()-4).replaceAll("\\d","*")+kartNo.substring(kartNo.length()-4));

    }
}
