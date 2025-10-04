import java.util.Scanner;
public class Day27 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("jumlah pulsa : ");
        int pulsa = input.nextInt();
        
        int total_harga = pulsa * 10000;
        
        int harga_akhir = total_harga + 2000;
        
        System.out.println("total harga pulsa anda : "+ harga_akhir);
    }
}