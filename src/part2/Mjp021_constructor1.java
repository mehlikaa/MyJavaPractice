package part2;

public class Mjp021_constructor1 {

    String name="Emily";
    int age=20;
    Mjp021_constructor1(){
        System.out.println("Parametresiz Constructordan selamlar.");
        }
    //once this ile parametresiz constructor'a gidildi ve sonraki satirdan devam edildi.

    Mjp021_constructor1(String name, int age){
        this();
        this.name=name;
        this.age=22;
    }
    public static void main(String[] args) {
        Mjp021_constructor1 st=new Mjp021_constructor1("Oliver", 21);
        System.out.println("st.name = " + st.name+"\nst.age : "+st.age);
        //st.name = Oliver
        //st.age : 22
    }

}
