import java.util.Scanner;

public class manavKasaProgramı {
    public static void main(String[] args) {

        double armut=2.14,a_adet,
                elma=3.67,e_adet,
                domates=1.11,d_adet,
                muz=0.95,m_adet,
                patlıcan=5.00,p_adet;

        Scanner input = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? :");
        a_adet = input.nextDouble();
        System.out.print("Elma Kaç Kilo ? : ");
        e_adet = input.nextDouble();
        System.out.print("Domates Kaç Kilo ? : ");
        d_adet = input.nextDouble();
        System.out.print("Muz Kaç Kilo ? :");
        m_adet = input.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ? :");
        p_adet = input.nextDouble();


        double armutFiyat=armut*a_adet,
                elmaFiyat=elma*e_adet,
                domatesFiyat=domates*d_adet,
                muzFiyat=muz*m_adet,
                patlıcanFiyat=patlıcan*p_adet;

        double toplamFiyat=armutFiyat+elmaFiyat+domatesFiyat+muzFiyat+patlıcanFiyat;
        System.out.println("Toplam Tutar : "+toplamFiyat +"TL");
    }
}
