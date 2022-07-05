import java.util.Scanner;

public class havaDurumu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hava durumunu giriniz:");
        int havaDurumu = input.nextInt();
        if(havaDurumu<5){
            System.out.println("Kayak Yapabilirsin.");
        }
        else if(havaDurumu>=5 && havaDurumu<15){
            System.out.println("Sinemaya gidebilirsin.");
        }
        else if(havaDurumu>=15 && havaDurumu<25){
            System.out.println("Piknik yapabilirsin.");
        }
        else if(havaDurumu>=25 ){
            System.out.println("Yüzmeye gidebilirsin.");
        }
        else{
            System.out.println("Geçersiz hava durumu");
        }
    }
}
