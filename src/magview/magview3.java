package magview;

import java.util.ArrayList;
import java.util.List;

public class magview3 {
    public static void main(String[] args) {
        String x = "Javanedenamahepguzeldir";
        String longest="";
        List<String> listX = new ArrayList<>();
        List<String> listX2 = new ArrayList<>();
        List<String> listX3 = new ArrayList<>();

        for (int i = 0; i < x.length(); i++) {
            listX.add(String.valueOf(x.charAt(i)));
        }
        System.out.println("ListX : " + listX);

        for (int i = 0; i < listX.size(); i++) {
            int count=0;
            for (int j = 0; j < listX.size(); j++) {
                if (listX.get(i).contains(listX.get(j)))
                    count++;
            }   if(count==1) listX2.add(listX.get(i));
        }
        System.out.println("ListX2 : " + listX2);

        for (int i = 0; i <listX2.size()-1 ; i++) {
            listX3.add(x.substring((x.indexOf(listX2.get(i)))+1,x.indexOf(listX2.get(i+1))));
            if(longest.length()<listX3.get(i).length())
                longest=listX3.get(i);
        }   System.out.println("ListX3 : " + listX3);     System.out.println("Longest : " + longest);
    }
}


