package Practice01;

import java.util.Scanner;

public class C05_daireninAlaniniHesapla {
    public static void main(String[] args) {

        /*
        Dairenin Alanını ve Çevresini Hesaplayan Program
        Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

        Alan Formülü : π * r * r;

        Çevre Formülü : 2 * π * r;


         */

        Scanner scan=new Scanner(System.in);

        int yaricap;
        System.out.println("Dairenin alanini ve cevresini hesaplamak uzere yaricapini giriniz :  ");
        yaricap=scan.nextInt();

        double pi=3.14;

        double daireAlani=yaricap*yaricap*pi;
        double daireCevresi=2*pi*yaricap;

        System.out.println("Daire alani : " +daireAlani );
        System.out.println("Daire cevresi : " +daireCevresi);





    }
}
