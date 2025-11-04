import java.util.Scanner;
public class Day59 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("genap : ");
        for (int i = 1;i <= 10;i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            } 
            
        }
        
        System.out.println("ganjil : ");
        for (int i = 1;i <= 10;i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
        
    }
}