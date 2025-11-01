import java.util.Scanner;
public class Day55 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("batas atas : ");
        int atas = input.nextInt();
        
        System.out.print("batas bawah : ");
        int bawah = input.nextInt();
        
        System.out.print("angka : ");
        int angka = input.nextInt();
        
        if (angka >= atas && angka <= bawah) {
            System.out.println("dalam batas");
        } else {
            System.out.println("di luar batas");
        }
        
        
    }
}