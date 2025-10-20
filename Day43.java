import java.util.Scanner;
public class Day43 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukan angka : ");
        int angka = input.nextInt();
        
        if (angka % 3 == 0) {
            System.out.println("kelipatan angka 3");
        } else if (angka % 5 == 0) {
            System.out.println("kelipatan angka 5");
        }
    }
}