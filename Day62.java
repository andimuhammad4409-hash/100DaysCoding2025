import java.util.Scanner;
public class Day62 {
    public static void main(String[] args) {
        int total = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.print("");
        int n = input.nextInt();
        
        for (int i = 1;i <= n;i++) {
            System.out.print("");
            int angka = input.nextInt();
            
            System.out.println(angka);
            
            total += angka;
        }
        System.out.println("--------------------");
        System.out.println("total : "+ total);
    }
}