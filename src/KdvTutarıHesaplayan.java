import java.util.Scanner;

public class KdvTutarıHesaplayan {
    public static void main(String[] args) {
        double tutar , KdvOran=0.18,KdvTutar , kdvliTutar;
        Scanner input = new Scanner(System.in);
        System.out.println("Tutarı giriniz: ");
        tutar = input.nextDouble();
        if (tutar < 1000) {
            KdvOran = 0.08;
            KdvTutar = tutar * KdvOran;
            kdvliTutar = tutar + KdvTutar;
            System.out.println("Tutar:"+tutar);
            System.out.println("Kdv oranı:"+KdvOran);
            System.out.println("KDV Tutarı: " + KdvTutar);
            System.out.println("KDVli Tutar: " + kdvliTutar);

        } else {
            KdvTutar = tutar * KdvOran;
            kdvliTutar = tutar + KdvTutar;
            System.out.println("Tutar:"+tutar);
            System.out.println("Kdv oranı:"+KdvOran);
            System.out.println("KDV Tutarı: " + KdvTutar);
            System.out.println("KDVli Tutar: " + kdvliTutar);
        }



    }
}
