import java.util.Scanner;
public class Day50 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukan angka : ");
        int angka = input.nextInt();
        
        String bilangan = (angka % 2 == 0) ? "genap":"ganjil";
        
        System.out.println("angka "+angka+" adalah bilangan "+bilangan);
    }
}