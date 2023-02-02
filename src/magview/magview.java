package magview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class magview {
    public static void main(String[] args) {
        String x = "Javanedenamahepguzeldir";
        List<String> listX = new ArrayList<>();

        for (int i = 0; i < x.length(); i++) {
            listX.add(String.valueOf(x.charAt(i)));
        }
        System.out.println("ListX : " + listX +"\n"+listX.size());

//        Map<String, Integer> map = new HashMap<>();
//        List<String> listX2 = new ArrayList<>();
//        for (int i = 0; i < x.length(); i++) {
//            if (!listX2.contains(String.valueOf(x.charAt(i)))) {
//                listX2.add(String.valueOf(x.charAt(i)));
//            }
//        }
//        System.out.println("ListX2 : " + listX2);





//        for (int i = 0; i < listX2.size(); i++) {
//            int count=0;
//            for (int j = 0; j < listX.size(); j++) {
//                if (String.valueOf(listX2.get(i)).contains(String.valueOf(listX.get(j))))
//                    count++;
//
//            }
//            if(count==1)
//
//            System.out.println(i + ". eleman : " + listX2.get(i) + "  " + count + "adet");
//        }

        System.out.println("Simdi saydir-----------");

        List<String> listX2 = new ArrayList<>();
        for (int i = 0; i < listX.size(); i++) {
            int count=0;
            for (int j = 0; j < listX.size(); j++) {

                if (listX.get(i).contains(listX.get(j)))
                    count++;
            }
            if(count==1) listX2.add(listX.get(i));

            System.out.println((i+1) + ". eleman : " + listX.get(i) + "  " + count + "adet");
        }
        System.out.println("ListX2 : " + listX2);

        for (int i = 0; i <listX2.size() ; i++) {


        }

    }


}


