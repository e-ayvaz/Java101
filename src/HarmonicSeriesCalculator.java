import java.util.Scanner;

public class HarmonicSeriesCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number ;
        number = input.nextInt();
        double sum = 0;
        for (int i=1;i<=number;i++){
            sum += 1.0/i;
        }
        System.out.println("The sum is: " + sum);
    }
}
