import java.util.Scanner;

public class sirala {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. sayıyı giriniz: ");
        int sayi1 = input.nextInt();
        System.out.println("2. sayıyı giriniz: ");
        int sayi2 = input.nextInt();
        System.out.println("3. sayıyı giriniz: ");
        int sayi3 = input.nextInt();

        int[] sayilar = {sayi1, sayi2, sayi3};
        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar.length - 1; j++) {
                if (sayilar[j] > sayilar[j + 1]) {
                    int temp = sayilar[j];
                    sayilar[j] = sayilar[j + 1];
                    sayilar[j + 1] = temp;
                }
            }
        }
        System.out.println("Sıralanmış sayılar: ");
        for (int i = 0; i < sayilar.length; i++) {
            System.out.print(sayilar[i] + " ");
        }
    }
}
