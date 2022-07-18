package part1;

public class Mjp013ScopeInstanceVariable {
    //instance variable, classta olusturulur. static olan main metoddan obje olusturup ulasilabilir.
    // metodlardan direk kullanilabilir.
    int width;
    int height;
    String str;
    boolean bool;
    char ch;
    static int stInt;
    //initialize etmek zorunlu degildir Default deger kullanir.

    public static void main(String[] args) {
        Mjp013ScopeInstanceVariable obje=new Mjp013ScopeInstanceVariable();
        Mjp013ScopeInstanceVariable obje2=new Mjp013ScopeInstanceVariable();
        System.out.println("Default atama \n obje.width = " + obje.width+
                                      "\t\t obje.height = " + obje.height+
                                      "\t\tString ilk atama : "+ obje.str+
                                      "\t\tboolean ilk atama : "+obje.bool+
                                      "\t\t boolean ilk atama : "+obje.ch);
        obje.height=5;      obje.width=10;
        int alan=obje.height* obje.width;
        System.out.println("obje.width = " + obje.width+"\t\t obje.height = " + obje.height+"\nMainde alan = " + alan);
        System.out.println("\n obje2.width = " + obje2.width+"\t\t obje2.height = " + obje2.height+"\tMainde alan = " + alan);
        //Her obje icin farkli deger alabilir.
        obje.method1();
        System.out.println("Mainden stInt = " + stInt);

        method2();

    }
    public void method1(){
        int alan1=height* width;
        System.out.println("Metodda alan1 = " + alan1);
        System.out.println("------\n Static Integer Ilk Deger : "+stInt);
        stInt=3;
        System.out.println("Method1 deger alan Static Integer Deger ile = " + stInt);
    }
    public static void method2(){
        int x;
        Mjp013ScopeInstanceVariable obje3=new Mjp013ScopeInstanceVariable();
        obje3.method1();

        System.out.println("Method2 'ten stInt = " + stInt);
        //Degeri verilen static v. Farkli methodda son verilen degeri ile geldi.
        System.out.println("Width : "+ obje3.width);
        //static mainde deger verilen Instance v. Farkli methodda degeri ile gelmedi. default

        // System.out.println(" x : "+ x);
        // Local variable'a initialze yapilmadiginda default atamiyor CTE veriyor.
    }

}
