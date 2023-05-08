package Practice01;

import java.util.Scanner;

public class C19_dordeBolununSayilarinToplami {
    public static void main(String[] args) {

        /*
        Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden
        ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen tek sayi giriniz : ");
        int sayi=scan.nextInt();
        int toplam=0;
        int sayac=0;

        while (sayi%2==0){
            System.out.println("tek sayi giriniz");
            sayi=scan.nextInt();
        }
        if (sayi%2==1){
            for (int i = 1; i <sayi ; i++) {
                if (i%4==0 ){
                    toplam +=i;
                    sayac++;
                }
            }System.out.println(toplam);
        }




    }
}
