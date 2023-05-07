package Practice01;

import java.util.Scanner;

public class C14_burcBulmaProgrami {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Dogdugunuz ayi giriniz : ");
        String ay=scan.nextLine();
        System.out.print("Dogdugunuz gunu giriniz : ");
        int gun=scan.nextInt();

        if ((ay.equals("Mart") && gun>=21) || (ay.equals("Nisan") && gun <=20)){
            System.out.println("Koc burcusunuz");
        } else if ((ay.equals("Nisan") && gun>=21) || (ay.equals("Mayis") && gun <=21)) {
            System.out.println("Boga burcusunuz");
        } else if ((ay.equals("Mayis") && gun>=22) || (ay.equals("Haziran") && gun <=22)) {
            System.out.println("Ikizler burcusunuz");
        }else if ((ay.equals("Haziran") && gun>=23) || (ay.equals("Temmuz") && gun <=22)) {
            System.out.println("Yengec burcusunuz");
        }else if ((ay.equals("Temmuz") && gun>=23) || (ay.equals("Agustos") && gun <=22)) {
            System.out.println("Aslan burcusunuz");
        }else if ((ay.equals("Agustos") && gun>=23) || (ay.equals("Eylul") && gun <=22)) {
            System.out.println("Basak burcusunuz");
        }else if ((ay.equals("Eylul") && gun>=23) || (ay.equals("Ekim") && gun <=22)) {
            System.out.println("Terazi burcusunuz");
        }else if ((ay.equals("Ekim") && gun>=23) || (ay.equals("Kasim") && gun <=21)) {
            System.out.println("Akrep burcusunuz");
        }else if ((ay.equals("Kasim") && gun>=22) || (ay.equals("Aralik") && gun <=21)) {
            System.out.println("Yay burcusunuz");
        }else if ((ay.equals("Aralik") && gun>=22) || (ay.equals("Ocak") && gun <=21)) {
            System.out.println("Oglak burcusunuz");
        }else if ((ay.equals("Ocak") && gun>=22) || (ay.equals("Subat") && gun <=19)) {
            System.out.println("Kova burcusunuz");
        }else if ((ay.equals("Subat") && gun>=23) || (ay.equals("Mart") && gun <=20)) {
            System.out.println("Balik burcusunuz");
        }

    }
}
