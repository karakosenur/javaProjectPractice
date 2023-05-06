package Practice01;

import java.util.Scanner;

public class C07_odevVucutKitleIndeksi {

    public static void main(String[] args) {
        /*
       Vücut Kitle İndeksi Hesaplama
        Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

        Formül
        Kilo (kg) / Boy(m) * Boy(m)

         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen Kilonuzu Kg Giriniz : ");
        double kilo = scan.nextDouble();

        System.out.print("Lütfen Boyunuzu Cm Olarak Giriniz : ");
        double boy = scan.nextDouble();

        double kitleEndeksi = (kilo * 10000 / (boy * boy));
        System.out.println("Vücut Kitle Endeksiniz : "+kitleEndeksi);

        if (kilo <=0 || boy<=0 || boy>300 || kilo >500){
            System.out.println("Yanlis giris yaptiniz, tekrar deneyin");
        } else if (kitleEndeksi<20) {
            System.out.println("zayif");
        } else if (kitleEndeksi<25) {
            System.out.println("Normal");
        } else if (kitleEndeksi<30) {
            System.out.println("Kilolu");
        }else{
            System.out.println("Obez");
        }

    }

}
