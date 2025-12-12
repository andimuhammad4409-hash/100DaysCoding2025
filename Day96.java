import java.util.Scanner;
public class Day96 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukan angka a : ");
        int angka1 = input.nextInt();
        
        System.out.print("masukan angka b : ");
        int angka2 = input.nextInt();
        
        System.out.println("========================");
        
        System.out.println(angka1 +" + "+ angka2 + " = "+ penjumlahan(angka1, angka2));
        System.out.println(angka1 +" - "+ angka2 + " = "+ pengurangan(angka1, angka2));
        System.out.println(angka1 +" x "+ angka2 + " = "+ perkalian(angka1, angka2));
        System.out.println(angka1 +" / "+ angka2 + " = "+ pembagian(angka1, angka2));
        
    }
    
    static int penjumlahan (int a, int b) {
        int hasil = a + b;
        return hasil;
    }
    
    static int pengurangan (int a, int b ) {
        int hasil = a - b;
        return hasil;
    }
    
    static int perkalian (int a, int b ) {
        int hasil = a * b;
        return hasil;
    }
    
    static int pembagian (int a, int b ) {
        int hasil;
        if (a == 0 || b == 0) {
             hasil = 0;
        } else {
             hasil = a / b;
        }
        
        return hasil;
    }
}