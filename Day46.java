import java.util.Scanner;
public class Day46 {
    public static void main(String[] args){
        
        String nama_menu = null;
        int harga = 0;
        Scanner input = new Scanner(System.in);
        
        //pemilihan menu
        System.out.println("==== daftar menu ====");
        System.out.println("1. mie ayam    : Rp. 12000 ");
        System.out.println("2. bakso       : Rp. 13000");
        System.out.println("3. nasi goreng : Rp. 12000");
        
        //input menu dan jumlah
        System.out.print("pilih menu sesuai nomor urut : ");
        int menu = input.nextInt();
        
        System.out.print("jumlah porsi : ");
        int porsi = input.nextInt();
        
        switch (menu) {
            case 1:
            nama_menu = "mie ayam";
            harga = 12000;
            break;
            
            case 2:
            nama_menu = "bakso";
            harga = 13000;
            break;
            
            case 3:
            nama_menu = "nasi goreng";
            harga = 12000;
            break;
            
            default:
            System.out.println("menu tidak tersedia");
        }
        
        //pembayaran
        int total = porsi * harga;
        
        System.out.println("total : "+ total);
        System.out.print("bayar sesuai total : ");
        int bayar = input.nextInt();
        
        int kembalian = bayar - total;
        
        
        System.out.println("========== nota belanja ==========");
        System.out.println("menu            : "+nama_menu);
        System.out.println("jumlah porsi    : "+porsi);
        System.out.println("harga per porsi : "+harga);
        System.out.println("total           : "+total);
        System.out.println("jumlah bayar    : "+bayar);
        System.out.println("kembalian       : "+kembalian);
        
        System.out.println("========= terimah kasih :) ==========");
        
        
    }
}