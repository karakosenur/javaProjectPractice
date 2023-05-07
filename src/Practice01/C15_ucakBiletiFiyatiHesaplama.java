package Practice01;

import java.util.Scanner;

public class C15_ucakBiletiFiyatiHesaplama {
    public static void main(String[] args) {
        /*
        Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
        Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
        Mesafe başına ücret 0,10 TL / km olarak alın.
        İlk olarak uçuşun toplam fiyatını hesaplayın ve
        sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

        Kullanıcıdan alınan değerler geçerli
        (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
        Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
        Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
        Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
        Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
        Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
         */

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen gideceginiz mesafeyi km cinsinden giriniz");
        int km=scan.nextInt();
        System.out.println("Lutfen yasinizi giriniz");
        int yas=scan.nextInt();
        System.out.println("Lutfen yolculuk tipini giriniz. " +
                "\n1 => Tek Yön , 2 => Gidiş Dönüş ");
        int yolTip=scan.nextInt();
        double biletFiyati=km*0.10;
        double elliInd=biletFiyati*0.50;
        double onInd=biletFiyati*0.10;
        double otuzInd=biletFiyati*0.30;
        double yirmiInd=biletFiyati*0.20;
        if (km>0){
            if (yas<=12 && yas>0 && yolTip==2 ){
                System.out.println((biletFiyati-elliInd)-((biletFiyati-elliInd)*0.20));
            } else if (yas<=12 && yas>0 && yolTip==1) {
                System.out.println(biletFiyati-elliInd);
            }
            if (yas<=24 && yas>12 && yolTip==2 ){
                System.out.println((biletFiyati-onInd)-((biletFiyati-onInd)*0.20));
            } else if (yas<=24 && yas>12 && yolTip==1) {
                System.out.println(biletFiyati-onInd);
            }
            if (yas>65 && yolTip==2 ){
                System.out.println((biletFiyati-otuzInd)-((biletFiyati-otuzInd)*0.20));
            } else if (yas>65 && yolTip==1) {
                System.out.println(biletFiyati-otuzInd);
            }
        }else {
            System.out.println("Hatalı Veri Girdiniz !");
        }


    }
}
