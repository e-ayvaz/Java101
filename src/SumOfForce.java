import java.util.Scanner;

public class SumOfForce {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number ;
         number = input.nextInt();
        for (int i=1;i<= number;i *= 4){
            System.out.println("Numbers are multiplies of 4 : "+i);
        }
        System.out.println("----------");
        for (int j=1;j< number;j *= 5){
            System.out.println("Numbers are multiplies of 5 : "+j);
        }

        }
    }


