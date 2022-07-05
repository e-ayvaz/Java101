import java.util.Scanner;

public class daireAlan {
    public static void main(String[] args) {
        double pi = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.println("Dairenin yarıçapını giriniz: ");
        double yaricap = input.nextDouble();
        System.out.println("Dairenin merkez açısının ölçüsünü giriniz: ");
        double merkezAci = input.nextDouble();
        double alan = pi * yaricap * yaricap *merkezAci/360;
        System.out.println("Alan: " + alan);
    }
}
