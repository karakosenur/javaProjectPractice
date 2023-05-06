package Practice01;

import java.util.Scanner;

public class C03_dikUcgendeHipotenus {
    public static void main(String[] args) {

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
