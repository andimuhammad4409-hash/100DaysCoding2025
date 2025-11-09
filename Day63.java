import java.util.Scanner;
public class Day63 {
    public static void main(String[] args) {
        int total = 1;
        Scanner input = new Scanner (System.in);
        
        System.out.print("masukan angka n : ");
        int n = input.nextInt();
        
        for (int i = 1;i <= n;i++) {
            System.out.println(i);
            total *= i;
        }
        System.out.println("-------------------");
        System.out.println(total);
        
        
    }
}