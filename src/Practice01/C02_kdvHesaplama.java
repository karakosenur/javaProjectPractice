package Practice01;

import java.util.Scanner;

public class C02_kdvHesaplama {
    public static void main(String[] args) {

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
