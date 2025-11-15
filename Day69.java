import java.util.Scanner;
public class Day69 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("jam mulai pengerjaan : ");
        int mulai = input.nextInt();
        
        System.out.print("lama waktu pengerjaan : ");
        int lama = input.nextInt();
        
        int selesai = (mulai + lama) % 24;
        
        System.out.println(selesai);
    }
}