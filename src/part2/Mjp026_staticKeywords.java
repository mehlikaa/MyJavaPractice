package part2;

public class Mjp026_staticKeywords {

    int number;
    String name;
    static String college ="ITS";

    Mjp026_staticKeywords(int num, String nameS, String college ){
        this.name=nameS;
        this.number=num;
        // static college ile this kullanilamiyor.
        //college  name tum class icin gecerli

    }

    public static void main(String[] args) {
        Mjp026_staticKeywords s1=new Mjp026_staticKeywords(111,"Karan","MIT");
        Mjp026_staticKeywords s2=new Mjp026_staticKeywords(222,"Aryan","Harvard");
//eger atama yaparsam degistirebilirim.
        college="SABIT";
        System.out.println(" s1.number : "+s1.number);
        System.out.println(" s2.number : "+s2.number);

        System.out.println("s1.name : "+s1.name);
        System.out.println("s2.name : "+s2.name);

        System.out.println("College : "+college);
    }

}
