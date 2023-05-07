package Practice01;

import java.util.Scanner;

public class C10_kullaniciSifresi {
    public static void main(String[] args) {

        /*
        Ödev
        Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
        eğer kullanıcı sıfırlamak isterse
        yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip ,
        şifreler aynı ise ekrana
        "Şifre oluşturulamadı, lütfen başka şifre giriniz."
        sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
         */

        String sifre, kullaniciAdi,yeniSifre,kullaniciGirisi;

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen kullanicinizi giriniz");
        kullaniciAdi=scan.nextLine();

        System.out.println("sifrenizi giriniz");
        sifre=scan.nextLine();

        if (sifre.equals("java123") && kullaniciAdi.equals("patika")){
            System.out.println("dogru giris yaptiniz");
        } else {
            System.out.println("yanlis giris yaptiniz. sifrenizi sifirlamak ister msiniz?");
            kullaniciGirisi=scan.nextLine();
            if (kullaniciGirisi.equals("evet")){
                System.out.println("lutfen yeni sifrenizi giriniz");
            }
            yeniSifre=scan.nextLine();

            if (yeniSifre.equals("java123")){
                System.out.println("Yeni sifreniz eskisi ile ayni olmamali. " +
                        "\nŞifre oluşturulamadı, lütfen başka şifre giriniz.");
                yeniSifre=scan.nextLine();
            }else {
                System.out.println("Şifre oluşturuldu");
            }

        }


    }
}
