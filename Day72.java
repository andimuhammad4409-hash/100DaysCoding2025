import java.util.Scanner;
public class Day72 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukan tinggi : ");
        int n = input.nextInt();
        
        for (int i = 1;i <= n;i++) {
            for (int j = i;j <= n;j++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
}