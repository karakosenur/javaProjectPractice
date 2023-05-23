package Practice01;

import java.util.Scanner;

public class C20_dortBesinKatlari {
    //Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int sayi =1000;
        int girilensayi = 0;
        while (girilensayi<sayi){ // toplam 500'den kucuk oldugu sure boyunca
            System.out.println("dordun kuvvetlerini bulmak icin bir tamsayi giriniz");
            girilensayi= scanner.nextInt();
            for (int i = 1; i <girilensayi ; i*=4) {
                System.out.println(i);
            }
            System.out.println("besin kuvvetlerini bulmak icin bir tamsayi giriniz");
            girilensayi= scanner.nextInt();
            for (int i = 1; i <girilensayi ; i*=5) {
                System.out.println(i);
            }
            break;

        }

    }
}
