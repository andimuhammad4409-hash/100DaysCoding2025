import java.util.Scanner;
public class Day95 {
   public static void main (String[] args) {
       Scanner input = new Scanner(System.in);
       
       System.out.print("masukan angka : ");
       int angka = input.nextInt();
       
       pengecekan(angka);
       
   }
    
    static void pengecekan(int a) {
        if (a % 2 == 0) {
            System.out.println(a + " adalah bilangan genap");
        } else {
             System.out.println(a + " adalah bilangan ganjil");
        }
    }
}