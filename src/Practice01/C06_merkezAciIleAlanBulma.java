package Practice01;

import java.util.Scanner;

public class C06_merkezAciIleAlanBulma {
    public static void main(String[] args) {

        /*
        Ödev
        Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

        𝜋 sayısını = 3.14 alınız.

        Formül : (𝜋 * (r*r) * 𝛼) / 360
         */
        int merkezAci,yaricap;
        double pi=3.14;

        Scanner scan=new Scanner(System.in);


        System.out.print("Merkez aci olcusu ile dairenin alanini bulmak icin yaricap giriniz :" );

        yaricap=scan.nextInt();
        System.out.print("Merkez aci olcusu ile dairenin alanini bulmak icin merkez aci olcusu giriniz :" );
        merkezAci=scan.nextInt();
        //Formül : (𝜋 * (r*r) * 𝛼) / 360
        double daireAlani=(pi*(yaricap*yaricap)*merkezAci)/360;

        System.out.println("Girdiginiz degerlere gore daire alani : " + daireAlani);


    }
}
