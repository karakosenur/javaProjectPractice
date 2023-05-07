package Practice01;

import java.util.Scanner;

public class C11_dersNotuHesaplama {
    public static void main(String[] args) {

        /*
        Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
        Geçme Notu : 55
        Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
         */
        int matematik, fizik, turkce, kimya, muzik;
        Scanner scan=new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz : ");
        matematik=scan.nextInt();
        if(!(matematik >= 0 && matematik<=100)) System.out.println("Gecersiz not girisi");

        System.out.print("Fizik notunuzu giriniz : ");
        fizik=scan.nextInt();
        if(!(fizik >= 0 && fizik<=100)) System.out.println("Gecersiz not girisi");

        System.out.print("Turkce notunuzu giriniz : ");
        turkce=scan.nextInt();
        if(!(turkce >= 0 && turkce<=100)) System.out.println("Gecersiz not girisi");

        System.out.print("Kimya notunuzu giriniz : ");
        kimya=scan.nextInt();
        if(!(kimya >= 0 && kimya<=100)) System.out.println("Gecersiz not girisi");

        System.out.print("Muzik notunuzu giriniz : ");
        muzik=scan.nextInt();
        if(!(muzik >= 0 && muzik<=100)) System.out.println("Gecersiz not girisi");

        double ortalama=((matematik+fizik+kimya+turkce+muzik)/5);
        if (ortalama>=55){
            System.out.println("tebrikler sinifi gectiniz");
        }else {
            System.out.println("Sinifi gecemediniz. Seneye gorusuruz");
        }


    }
}
