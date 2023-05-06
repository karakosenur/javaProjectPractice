package Practice01;

import java.util.Scanner;

public class C03_dikUcgendeHipotenus {
    public static void main(String[] args) {

        /*
        Dik Üçgende Hipotenüs Bulan Program
        Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.

        Ödev
        Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

        Formül
        Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

        𝑢 = (a+b+c) / 2

        Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
         */

        int aKenari,bKenari;
        double cKenari;
        Scanner scan=new Scanner(System.in);

        System.out.print("Lutfen ucgenin birici dik kenarini giriniz : ");
        aKenari=scan.nextInt();

        System.out.print("Lutfen ucgenin ikinci dik kenarini giriniz : ");
        bKenari=scan.nextInt();

        cKenari=Math.sqrt((aKenari * aKenari) + (bKenari * bKenari));
        System.out.println("Girdiginiz degerlere gore ucgenin hipotenusu : " + cKenari);
    }
}
