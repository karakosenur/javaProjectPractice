package Practice01;

import java.util.Scanner;

public class C08_manavKasaProgrami {
    public static void main(String[] args) {

        /*
        Manav Kasa Programı
        Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
        Meyveler ve KG Fiyatları
        Armut : 2,14 TL
        Elma : 3,67 TL
        Domates : 1,11 TL
        Muz: 0,95 TL
        Patlıcan : 5,00 TL
         */

        double armutKg=2.14;
        double elmaKg=3.67;
        double domatesKg=1.11;
        double muzKg=0.95;
        double patlicanKg=5.0;

        double alinanArmut, alinanElma, alinanMuz, alinanDomates, alinanPatlican;

        Scanner scan=new Scanner(System.in);
        System.out.print("Kac kg armut aldiginizi giriniz : " +armutKg );
        alinanArmut=scan.nextDouble();

        System.out.print("Kac kg elma aldiginizi giriniz : " +elmaKg);
        alinanElma=scan.nextDouble();

        System.out.print("Kac kg domates aldiginizi giriniz : " +domatesKg);
        alinanDomates=scan.nextDouble();

        System.out.print("Kac kg muz aldiginizi giriniz : "+muzKg );
        alinanMuz=scan.nextDouble();

        System.out.print("Kac kg patlican aldiginizi giriniz : " +patlicanKg);
        alinanPatlican=scan.nextDouble();

        double toplam=elmaKg*alinanElma+armutKg*alinanArmut+domatesKg*alinanDomates+muzKg*alinanMuz+patlicanKg+alinanPatlican;
        System.out.println("Aldiginiz urunlerin toplam fiyati : " + toplam);







    }
}
