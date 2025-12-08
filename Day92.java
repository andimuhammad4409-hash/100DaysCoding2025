import java.util.Scanner;
public class Day92 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukan angka a : ");
        int angka1 = input.nextInt();
        
        System.out.print("masukan angka b : ");
        int angka2 = input.nextInt();
        
        int hasil = jumlah(angka1, angka2);
        
        System.out.println(angka1 + " + "+ angka2 + " = "+ hasil);
    }
    
    static int jumlah (int a, int b) {
        int c = a + b;
        
        return c;
    }
}