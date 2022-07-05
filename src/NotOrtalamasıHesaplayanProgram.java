import java.util.Scanner;

public class NotOrtalamasıHesaplayanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Fizik notunuzu giriniz: ");
        int fizik = input.nextInt();

        System.out.println("Matematik notunuzu giriniz: ");
        int matematik = input.nextInt();

        System.out.println("Türkçe notunuzu giriniz: ");
        int türkçe = input.nextInt();

        System.out.println("Kimya notunuzu giriniz: ");
        int kimya = input.nextInt();

        System.out.println("Tarih notunuzu giriniz: ");
        int tarih = input.nextInt();

        System.out.println("Müzik notunuzu giriniz: ");
        int müzik = input.nextInt();

        int ortalama = (fizik + matematik + türkçe + kimya + tarih + müzik) / 6;
        System.out.println("Ortalamanız: " + ortalama);

        boolean geçtiMi = ortalama >= 60;
        String sonuc = geçtiMi ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(sonuc);
    }
}
