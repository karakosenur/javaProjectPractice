package Practice01;

import java.util.Scanner;

public class C02_kdvHesaplama {
    public static void main(String[] args) {

        /*
        KDV Tutarı Hesaplayan Program
        Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.

        (Not : KDV tutarını 18% olarak alın)

        KDV'siz Fiyat = 10;

        KDV'li Fiyat = 11.8;

        KDV tutarı = 1.8;

        Ödev
        Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
         */

        Scanner scan=new Scanner(System.in);

        double kdvTutari=0.18;

        System.out.print("KDVli fiyati hesaplama icin tutar giriniz : ");
        double kdvsizTutar=scan.nextDouble();

        double kdvliTutar=(kdvsizTutar*kdvTutari);
        System.out.println("KDV'siz tutar : " + kdvsizTutar);
        System.out.println("KDV orani: " + kdvTutari);
        System.out.println("KDV'li tutar : " +(kdvsizTutar+ kdvliTutar));

    }
}
