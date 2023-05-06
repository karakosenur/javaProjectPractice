package Practice01;

import java.util.Scanner;

public class C01_ortalamaNotHesaplama {
    public static void main(String[] args) {

        double mat, fizik, kimya, tarih, muzik, turkce;

        Scanner scan=new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz : ");
        mat=scan.nextDouble();

        System.out.println("Turkce notunuzu giriniz : ");
        turkce=scan.nextDouble();

        System.out.println("Fizik notunuzu giriniz : ");
        fizik=scan.nextDouble();

        System.out.println("Kimya notunuzu giriniz : ");
        kimya=scan.nextDouble();

        System.out.println("Muzik notunuzu giriniz : ");
        muzik=scan.nextDouble();

        System.out.println("Tarih notunuzu giriniz : ");
        tarih=scan.nextDouble();

       double toplam=(mat + fizik + kimya + muzik + tarih+ turkce);
       double ortalama=(toplam/6);

        System.out.println("Ortalama notunuz : " + ortalama);





    }
}
