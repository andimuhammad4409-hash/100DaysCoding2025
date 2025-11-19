import java.util.Scanner;
public class Day73 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        while (true) {
            System.out.print("masukan angka : ");
            int angka = input.nextInt();
            
            if (angka < 0) {
                break;
            }
            
            total += angka;
        }
        
        System.out.println(total);
    }
}