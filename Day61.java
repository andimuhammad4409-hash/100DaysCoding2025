import java.util.Scanner;
public class Day61 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukan angka m : ");
        int m = input.nextInt();
        
        System.out.print("masukan angka n : ");
        int n = input.nextInt();
        
        for (int i = 1;i <= n;i++) {
            if (i % m == 0) {
                System.out.println(i);
            }
        }
        
    }
}