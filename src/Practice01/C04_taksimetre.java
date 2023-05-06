package Practice01;

import java.util.Scanner;

public class C04_taksimetre {
    public static void main(String[] args) {

        /*
        Taksimetre Programı
        Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

        Taksimetre KM başına 2.20 TL tutmaktadır.
        Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        Taksimetre açılış ücreti 10 TL'dir.
         */
        double km;

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen gideceginiz mesafeyi km cinsinden giriniz : ");
        km=scan.nextDouble();

        double acilisUcreti=10;
        double kmDegeri=2.20;
        double toplamTutar=(km*kmDegeri) + acilisUcreti;

        if (toplamTutar<20){
            System.out.println("Odenecek minumum tutar : 20 TL'dir");
        }else {
            System.out.println("Odenecek toplam tutar : "+ toplamTutar);
        }







    }
}
