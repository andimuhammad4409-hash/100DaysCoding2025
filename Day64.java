import java.util.Scanner;
public class Day64 {
    public static void main(String[] args) {
        int total = 1;
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukan angka m : ");
        int m = input.nextInt();
        
        System.out.print("masukan pangkat : ");
        int pangkat = input.nextInt();
        
        
        if (pangkat == 0) {
            total = 1;
        } else {
            for (int i = 1;i <= pangkat ;i++) {
            System.out.print(m);
            
            total *= m;
            }
        }
        
        System.out.println(total);
        
        
        
        
    }
}
