import java.util.Scanner;

public class kullaniciGiris {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kullanıcı Girişi");
        System.out.print("Kullanıcı Adı : ");
        String kullaniciAdi = input.nextLine();
        System.out.print("Şifre : ");
        String sifre = input.nextLine();
        if (kullaniciAdi.equals("admin") && sifre.equals("admin")) {
            System.out.println("Hoşgeldiniz " + kullaniciAdi);
        } else {
            System.out.println("Kullanıcı adı veya şifre hatalı");
            System.out.println("Şifrenizi sıfırlamak istiyor musunuz ?");
            String sifreSifirla = input.nextLine();
            if (sifreSifirla.equals("evet")) {
                if( !sifre.equals("admin") || !sifre.equals(sifre)){
                    System.out.print("Yeni şifre : ");
                    String yeniSifre = input.nextLine();
                    System.out.println("Şifre oluşturuldu.");

            } else {
                System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
            }
        }
    }
}
}


// Language: