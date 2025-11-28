import java.util.Scanner;
public class Day82 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[] buah = new String[3];
        
        for (int i = 0;i < buah.length;i++) {
            System.out.print("masukan buah : ");
            buah[i] = input.nextLine();
        }
        System.out.println("----------------------");
        for (int i = 0;i < buah.length;i++) {
            System.out.println(buah[i]);
        }
    }
}