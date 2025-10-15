import java.util.Scanner;
public class Day38 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukan angka : ");
        int angka = input.nextInt();
        
        if (angka == 0) {
            System.out.println("angka nol");
        } else if (angka > 0) {
            System.out.println("angka positif");
        } else {
            System.out.println("angka negatif");
        }
    }
}