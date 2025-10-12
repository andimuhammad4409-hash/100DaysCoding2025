import java.util.Scanner;
public class Day35 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukan angka : ");
        int angka = input.nextInt();
        
        if (angka > 5) {
            System.out.println("hai");
        } else {
            System.out.println("saya");
        }
    }
}