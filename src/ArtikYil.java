import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Yılını giriniz: ");
        int yil = input.nextInt();
        if (yil % 4 == 0 && yil % 100 != 0 || yil % 400 == 0){
            System.out.println("Artık yılıdır");
        }
        else {
            System.out.println("Artık yıl değildir");
        }
    }
    
}
