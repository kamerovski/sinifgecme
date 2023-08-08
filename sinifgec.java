package sinifgecme;

import java.util.Scanner;

public class sinifgec {
    public static void main(String[] args) {
        int fizik,mat,turk;
        double avarage;
        Scanner scan = new Scanner(System.in);
        System.out.println("Fizik notunuzu giriniz: ");
        fizik = scan.nextInt();

        System.out.println("Matematik notunuzu giriniz: ");
        mat = scan.nextInt();

        System.out.println("Türkçe notunuzu giriniz: ");
        turk = scan.nextInt();

        if (fizik>100 || fizik<0 || mat>100 || mat<0 || turk>100 || turk<0) {
            System.out.println("Notunuzu hatalı girdiniz!");
        }else {
            avarage = (fizik + mat + turk) / 3;
            System.out.println("ortalamanız: " + avarage);
        }

    }
}
