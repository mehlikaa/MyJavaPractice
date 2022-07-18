package part2;

public class Mjp022_constructor2 {
    int x=3;
    int y=5;
    Mjp022_constructor2(){
        x+=1;
        System.out.println(" x : "+x);      // x : 4
    }
    Mjp022_constructor2(int i){
        this();
        this.y=i;
        x+=y;
        System.out.println(" x : "+x);      // x : 7
    }
    Mjp022_constructor2(int i, int i2){
        this(3);
        this.x-=4;
        System.out.println(" x : "+x);      // x : 3
    }

    public static void main(String[] args) {
        Mjp022_constructor2 mc1=new Mjp022_constructor2(4,3);

        //static kelimesi bir variable’i veya Method’u Class’a baglamak icin kullanilir.
        //Bir variable veya Method static olarak etiketlendiginde o artik class’in elemani olur
        //ve ona ulasmak icin object olusturmamiza gerek kalmaz.
        //Instance variable’a ulasmak icin ise MUTLAKA object olusturmaliyiz
        //
        // Static olan Variable ve methodlara Class ismi ile direk ulasilabilir.
        Mjp023_constructor3.play();
        Mjp023_constructor3.swing();
        Mjp023_constructor3.staticV="static Variable";
        //instance variable ve static olmayan methodlar, obje ile ulasilabilir.
        Mjp023_constructor3 obje=new Mjp023_constructor3();
        obje.insV="Instance Variable";
    }
    // x : 4
    // x : 7
    // x : 3

}
