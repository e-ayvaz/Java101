import java.util.Scanner;

public class ucgenAlan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Uçgenin kenar uzunluklarını giriniz: ");
        int kenarUzunluk1 = input.nextInt();
        int kenarUzunluk2 = input.nextInt();
        int kenarUzunluk3 = input.nextInt();

        double _2u ; //üçgenin üç kenarının toplamı
        _2u = kenarUzunluk1+kenarUzunluk2+kenarUzunluk3; //üçgenin üç kenarının toplamı
        double _u;
        _u= _2u/2;
        double alan ;
        alan = (int) Math.sqrt(_u*(_u-kenarUzunluk1)*(_u-kenarUzunluk2)*(_u-kenarUzunluk3));
        System.out.println("Alan: " + alan);

    }
}
