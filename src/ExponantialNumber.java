import java.util.Scanner;

public class ExponantialNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number ;
        number = input.nextInt();
        System.out.println("Enter a power: ");
        int power ;
        power = input.nextInt();
        int result =1;
        for (int i=1;i<=power;i++){
            result = result * number;
        }
        System.out.println(result);


    }
}
