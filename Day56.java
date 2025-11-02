import java.util.Scanner;
public class Day56 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        do {
            System.out.print("masukan sandi : ");
            int sandi = input.nextInt();
            
            if (sandi == 123) {
                System.out.println("selamat datang");
                break;
            } else {
                System.out.println("sandi salah, coba lagi");
            }
        } while(true);
    }
}