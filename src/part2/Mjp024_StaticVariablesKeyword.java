package part2;

public class Mjp024_StaticVariablesKeyword {
    static int count=0;

    public void increment(){
        count++;
    }

    public static void main(String[] args) {
        Mjp024_StaticVariablesKeyword obj1=new Mjp024_StaticVariablesKeyword();
        Mjp024_StaticVariablesKeyword obj2=new Mjp024_StaticVariablesKeyword();

        obj1.increment();
        obj2.increment();
        System.out.println("Obj1 count : "+count);      //2
        //static bir variable, static metod icinden direk cagirilir.
        //static bir variable, her obje icin ayri deger saklamaz.
        //degeri class icinde gecerlidir ve degisir.
        //instance variable, her obje icin ayri deger saklar.
        //System.out.println("Obj1 count : "+obj1.count);

    }
}
