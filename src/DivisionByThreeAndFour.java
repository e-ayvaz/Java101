import java.util.Scanner;

public class DivisionByThreeAndFour {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        int total = 0;
        int average = 0;
        int count = 0;
        for(int i=0; i<number; i++){
            if(i%3==0 && i%4==0){
                System.out.println(i);
                total = total + i;
                count++;
                i++;
            }
            else {
                i++;
            }

        }
        average = total/count;
        System.out.println("The average is: " + average);
    }
}
