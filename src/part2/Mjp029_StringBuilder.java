package part2;

public class Mjp029_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        sb.append("aaa").insert(1,"bb").insert(4,"ccc");
        System.out.println("sb = " + sb);


        String st1="java";
        StringBuilder sb2=new StringBuilder("java");

       // if(st1==sb2) System.out.println("String ve StringBuilder == esit");

        if(st1.equals(sb2)) System.out.println("String ve StringBuilder equals esit");
        else System.out.println("String ve StringBuilder equals esit degiller");

        System.out.println("v harfinin indexi : " +sb2.indexOf("v"));
        System.out.println("istenen indexteki karakter : " +sb2.charAt(2));
        System.out.println("istenen indexteki karakter silindi : " +sb2.deleteCharAt(2));
        System.out.println("sb2 lenght :"+sb2.length());
        System.out.println("sb2 capacity : "+sb2.capacity());
        sb2.trimToSize();
        System.out.println("TrimToSize and new capacity :"+sb2.capacity());

    }
}
