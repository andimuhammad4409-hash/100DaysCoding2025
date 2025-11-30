import java.util.Scanner;
public class Day84 {
    public static void main(String[] args) {
        int total = 0;
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        
        for (int i = 1;i <= n;i++) {
            if (i % 3 == 0) {
                total += i;
            }
        }
        
        System.out.println(total);
    }
}