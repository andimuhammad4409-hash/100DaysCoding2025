import java.util.Scanner;
public class Day42 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukan gaji pokok : ");
        int gaji_pokok = input.nextInt();
        
        System.out.print("masukan tunjangan : ");
        int tunjangan = input.nextInt();
        
        int total = gaji_pokok + tunjangan;
        
        int pajak = total * 5/100;
        int gaji_bersih = total - pajak;
        
        System.out.println("total          : "+ total);
        System.out.println("potongan pajak : "+ pajak);
        System.out.println("gaji bersih    : "+ gaji_bersih);
    }
}