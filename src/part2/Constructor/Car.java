package part2.Constructor;

public class Car {
    int ilanNo;
    int yil;
    String marka;
    String model;
    int fiyat;

    public static void main(String[] args) {

    }
    public void hiz(int maxHiz){
        System.out.println("Bu araba ; "+maxHiz+" hiz yapabilir.");
    }
    public void yakit(int yakitTuru){
        System.out.println("Aracimiz : "+yakitTuru+" kullanmaktadir.");
    }

    public Car(){
    }
    public Car(int ilanc,int yilc,int fiyatc,String markac,String modelc){
             this.ilanNo=ilanc;
             this.yil=yilc;
             this.fiyat=fiyatc;
             this.marka="RenoC";
             this.model=modelc;

        //System.out.println( "Constructor1'den \nIlan No : "+ilanNo+ "\tYil    : "+yil+
                           // "\tFiyat   : "+fiyat+  "\tMarka   : "+marka+"\tModel  : "+model);
    }

}
