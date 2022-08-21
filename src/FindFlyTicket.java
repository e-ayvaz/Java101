import java.util.Scanner;

public class FindFlyTicket {
    public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
        System.out.println("Mesafeyi km türünden giriniz :");
        int mesafe = input.nextInt();
        System.out.println("Yaşınızı giriniz:");
        int yas = input.nextInt();
        System.out.println("Yolculuk tipini seçiniz:  \n1 => Tek Yön  \n2 => Gidiş Dönüş");
        int yolcuTipi = input.nextInt();
        switch (yolcuTipi){
                case 1:
                    if (yas < 12){
                        System.out.println("Tek Yön Bilet Fiyatı: " + (mesafe * 0.05) + "₺");
                    }
                    else if (yas < 24){
                        System.out.println("Tek Yön Bilet Fiyatı: " + (mesafe * 0.09) + "₺");
                    }
                    else if (yas > 65){
                        System.out.println("Tek Yön Bilet Fiyatı: " + (mesafe * 0.07) + "₺");
                    }
                    else {
                        System.out.println("Tek Yön Bilet Fiyatı: " + (mesafe * 0.10) + "₺");
                    }
                    break;
                case 2:
                    if (yas < 12){
                        System.out.println("Gidiş Dönüş Bilet Fiyatı: " + (mesafe * 0.05)*0.8 + "₺");
                    }
                    else if (yas < 24){
                        System.out.println("Gidiş Dönüş Bilet Fiyatı: " + (mesafe * 0.09)*0.8 + "₺");
                    }
                    else if (yas > 65){
                        System.out.println("Gidiş Dönüş Bilet Fiyatı: " + (mesafe * 0.07)*0.8 + "₺");
                    }
                    else {
                        System.out.println("Gidiş Dönüş Bilet Fiyatı: " + (mesafe * 0.10)*0.8 + "₺");
                    }
                    break;
                default:
                    System.out.println("Hatalı giriş yaptınız");
                    break;

            }
    }
        
    }
}
