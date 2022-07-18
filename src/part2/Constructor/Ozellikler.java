package part2.Constructor;

import org.w3c.dom.ls.LSOutput;

public class Ozellikler {
    public static void main(String[] args) {
        Car carObje = new Car();
        Car carObje2 = new Car();

        System.out.println("Otomobilimizin \n" +
                "\tIlan No   : " + carObje.ilanNo +
                "\tYil       : " + carObje.yil +
                "\tFiyati    : " + carObje.fiyat +
                "\tMarkasi   :" + carObje.marka +
                "\tModeli    :" + carObje.model);
        carObje.ilanNo = 101;
        carObje.yil = 2020;
        carObje.fiyat = 10000;
        carObje.marka = "Volvo";
        carObje.model = "Seat";

        System.out.println("Otomobilimizin \n" +
                "\tIlan No   : " + carObje.ilanNo +
                "\tYil       : " + carObje.yil +
                "\tFiyati    : " + carObje.fiyat +
                "\tMarkasi   :" + carObje.marka +
                "\tModeli    :" + carObje.model);

        System.out.println("Otomobilimizin \n" +
                "\tIlan No   : " + carObje2.ilanNo +
                "\tYil       : " + carObje2.yil +
                "\tFiyati    : " + carObje2.fiyat +
                "\tMarkasi   :" + carObje2.marka +
                "\tModeli    :" + carObje2.model);


        Car RenoCar = new Car(1001, 2001, 12000, "Reno", "Seat");

    }
}
