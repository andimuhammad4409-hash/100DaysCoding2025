import java.util.Scanner;
public class Day41 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukan total belanja : ");
        double total_belanja = input.nextDouble();
        
        int total_belanja1 = (int) total_belanja;
        
        System.out.println("total belanja (double) : "+ total_belanja);
        System.out.println("setelah konversi (int) : "+ total_belanja1);
        System.out.println("total pembayaran dalam teks : "+ total_belanja1+ " Rupiah");
        
    }
}