import java.util.Scanner;
public class Day99 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukan banyak bangka : ");
        int n = input.nextInt();
        
        int hitung = 0;
        
        for (int i = 2;hitung < n;i++) {
            boolean prima = true;
            for (int j = 2;j < i;j++) {
                if (i % j == 0) {
                    prima = false;
                    break;
                }
            }
            
            if (prima) {
            System.out.println(i);
            hitung++;
           }
        }
        
        
    }
}