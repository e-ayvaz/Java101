import java.util.Scanner;

public class sınıfGecme {
    public static void main(String[] args) {
        double mat,fizik,türkce,kimya,müzik;
        Scanner input = new Scanner(System.in);
        System.out.println("Matematik:");
        mat=input.nextDouble();
        System.out.println("Fizik:");
        fizik=input.nextDouble();
        System.out.println("Türkçe:");
        türkce=input.nextDouble();
        System.out.println("Kimya:");
        kimya=input.nextDouble();
        System.out.println("Müzik:");
        müzik=input.nextDouble();
        double ortalama=(mat+fizik+türkce+kimya+müzik)/5;
        System.out.println("Ortalama: " + ortalama);
        if(ortalama>=55){
            System.out.println("Sınıfı Geçtiniz");
        }
        else if(ortalama>100 || ortalama<0){
            System.out.println("Geçersiz Not");
        }
        else {
            System.out.println("Sınıfı Geçemediniz");
        }
    }
}
