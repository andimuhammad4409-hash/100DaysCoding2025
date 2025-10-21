import java.util.Scanner;
public class Day44 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("inputkan nilai : ");
        int nilai = input.nextInt();
        
        if (nilai >= 90 && nilai <= 100) {
            System.out.println("nilai A");
        } else if (nilai >= 80 && nilai <= 89) {
            System.out.println("nilai B");
        } else if (nilai >= 70 && nilai <= 79) {
            System.out.println("nilai C");
        } else if (nilai >= 60 && nilai <= 69) {
            System.out.println("nilai D");
        } else {
            System.out.println("nilai E");
        }
    }
}