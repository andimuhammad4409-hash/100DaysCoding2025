import java.util.Scanner;
public class Day74 {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       do {
           System.out.println("1. penjumlahan");
           System.out.println("2. pengurangan");
           System.out.println("3. perkalian");
           System.out.println("4. pembagian");
           System.out.println("5. modulus");
           System.out.println("6. berhenti");
           
           System.out.print("pilih menu : ");
           int menu = input.nextInt();
           
           if (menu == 1) {
               System.out.print("masukan angka a : ");
               int a = input.nextInt();
               
               System.out.print("masukan angka b : ");
               int b = input.nextInt();
               
               System.out.println("hasil : "+(a + b));
           } else if (menu == 2) {
               System.out.print("masukan angka a : ");
               int a = input.nextInt();
               
               System.out.print("masukan angka b : ");
               int b = input.nextInt();
               
               System.out.println("hasil : "+(a - b));
           } else if (menu == 3) {
               System.out.print("masukan angka a : ");
               int a = input.nextInt();
               
               System.out.print("masukan angka b : ");
               int b = input.nextInt();
               
               System.out.println("hasil : "+(a * b));
           } else if (menu == 4) {
               System.out.print("masukan angka a : ");
               int a = input.nextInt();
               
               System.out.print("masukan angka b : ");
               int b = input.nextInt();
               
               if (a == 0 || b == 0) {
                   System.out.println("hasil : 0");
               } else {
                      System.out.println("hasil : "+(a / b));
               }
           } else if (menu == 5) {
               System.out.print("masukan angka a : ");
               int a = input.nextInt();
               
               System.out.print("masukan angka b : ");
               int b = input.nextInt();
               
               System.out.println("hasil : "+(a % b));
           }
           
           if (menu == 6) {
               break;
           }
           
           
           
       } while(true);
   }
}