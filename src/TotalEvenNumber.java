import java.util.Scanner;

public class TotalEvenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number ;
        int total = 0;

        do {
            number = input.nextInt();
                if (number%4 == 0) {
                    total += number;
            }
        }
        while (number % 2 ==0);
        System.out.println("The total is: " + total);
        }
    }
