import java.util.Scanner;

public class Combination {
    public static int combination(int number, int group){
        int totalnum = 1,totalgroup = 1,total = 1;
        // n!
        for(int i=1; i<= number;i++){
            totalnum= totalnum * i;
        }
        // r!
        for(int i=1; i<= group;i++){
            totalgroup= totalgroup * i;
        }
        //(n-r)!
        for(int i=1; i<= number-group;i++){
            total= total * i;
        }

        return  totalnum / (totalgroup * total);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Number of Value: ");
        int number ;
        number = input.nextInt();
        System.out.println("Number of Group: ");
        int group ;
        group = input.nextInt();
        System.out.println(combination(number, group));
    }


    }
