import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args) {
        System.out.println("Hesap Makinesi");
        Scanner input = new Scanner(System.in);
        System.out.print("birinci sayı : ");
        int sayi1= input.nextInt();
        System.out.print("ikinci sayı : ");
        int sayi2= input.nextInt();
        double sonuc=0;
        System.out.println("1. Toplama");
        System.out.println("2. Çıkarma");
        System.out.println("3. Çarpma");
        System.out.println("4. Bölme");
        System.out.println("5. Çıkış");
        System.out.println("Lütfen bir işlem seçiniz:");
        int islem = input.nextInt();
        switch (islem){
            case(1):
                System.out.println("Toplama işlemi seçtiniz.");
                System.out.println("Lütfen iki sayı giriniz:");
                sonuc= sayi1 + sayi2;
                System.out.println("Sonuç: " + sonuc);
                break;
                case (2):
                System.out.println("Çıkarma işlemi seçtiniz.");
                System.out.println("Lütfen iki sayı giriniz:");
                    sonuc= sayi1 - sayi2;
                System.out.println("Sonuç: " + sonuc);
                break;
                case (3):
                System.out.println("Çarpma işlemi seçtiniz.");
                System.out.println("Lütfen iki sayı giriniz:");
                    sonuc = sayi2 - sayi1;
                System.out.println("Sonuç: " + sonuc);
                break;
            case(4):
                System.out.println("Bölme işlemi seçtiniz.");
                System.out.println("Lütfen iki sayı giriniz:");
                sonuc = sayi1 / sayi2;
                System.out.println("Sonuç: " + sonuc);
                break;
            case(5):
                System.out.println("Çıkış yapıldı.");
                break;

        }


    }
}
