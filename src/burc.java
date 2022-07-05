import java.util.Scanner;

public class burc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Doğum gününü giriniz: ");
        int doğumGünü = input.nextInt();
        System.out.print("Doğum ayını giriniz: ");
        int doğumAyı = input.nextInt();
        if (doğumAyı == 1) {
            if (doğumGünü < 20) {
                System.out.println("Oğlak burcu");
            } else {
                System.out.println("Kova burcu");
            }
        } else if (doğumAyı == 2) {
            if (doğumGünü < 19) {
                System.out.println("Balık burcu");
            } else {
                System.out.println("Kova burcu");
            }
        } else if (doğumAyı == 3) {
            if (doğumGünü < 21) {
                System.out.println("Balık burcu");
            } else {
                System.out.println("Koç burcu");
            }
        } else if (doğumAyı == 4) {
            if (doğumGünü < 21) {
                System.out.println("Koç burcu");
            } else {
                System.out.println("Boğa burcu");
            }
        } else if (doğumAyı == 5) {
            if (doğumGünü < 21) {
                System.out.println("Boğa burcu");
            } else {
                System.out.println("İkizler burcu");
            }
        } else if (doğumAyı == 6) {
            if (doğumGünü < 22) {
                System.out.println("İkizler burcu");
            } else {
                System.out.println("Yengeç burcu");
            }
        } else if (doğumAyı == 7) {
            if (doğumGünü < 23) {
                System.out.println("Yengeç burcu");
            } else {
                System.out.println("Aslan burcu");
            }
        } else if (doğumAyı == 8) {
            if (doğumGünü < 23) {
                System.out.println("Aslan burcu");
            } else {
                System.out.println("Başak burcu");
            }
        } else if (doğumAyı == 9) {
            if (doğumGünü < 23) {
                System.out.println("Başak burcu");
            } else {
                System.out.println("Terazi burcu");
            }
        } else if (doğumAyı == 10) {
            if (doğumGünü < 24) {
                System.out.println("Terazi burcu");
            } else {
                System.out.println("Akrep burcu");
            }
        } else if (doğumAyı == 11) {
            if (doğumGünü < 22) {
                System.out.println("Akrep burcu");
            } else {
                System.out.println("Yay burcu");
            }
        } else if (doğumAyı == 12) {
            if (doğumGünü < 22) {
                System.out.println("Yay burcu");
            } else {
                System.out.println("Oğlak burcu");
            }
        } else {
            System.out.println("Geçersiz girdi");
        }


    }
}
