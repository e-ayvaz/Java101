import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Taksi metrenizi giriniz: ");
        double taksiMetre = input.nextDouble();
        double acilis = 10.0;
        double taksiUcret = taksiMetre * 2.20+acilis;
        if(taksiUcret < 20){
            taksiUcret=20;
        }
        System.out.println("Taksi metreniz: " + taksiMetre);
        System.out.println("Taksi ücretiniz: " + taksiUcret);
    }
}
