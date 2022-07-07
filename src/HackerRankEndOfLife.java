import java.util.Scanner;

public class HackerRankEndOfLife {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for(int i = 0;  in.hasNext()== true; i++) {
            System.out.println((i+1) +" "+in.nextLine());
        }
        in.close();
    }


}
