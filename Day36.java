import java.util.Scanner;
public class Day36 {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
        System.out.print("inputkan nilai : ");
        int nilai = input.nextInt();
        
        if (nilai >= 70) {
            System.out.println("anda lulus");
            if (nilai >= 85) {
                System.out.println("nilai sangat baik");
            } else {
                System.out.println("nilai cukup baik");
            }
            
        } else {
            System.out.println("anda tidak lulus");
        }
        
    }
}