import java.util.Scanner;
public class Day39 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("========== makanan =========");
        System.out.println("1. bakso");
        System.out.println("2. pangsit");
        System.out.println("3. nasi goreng");
        
        System.out.print("menu makanan : ");
        String menu_makanan = input.nextLine();
        
        System.out.print("jumlah porsi : ");
        int porsi = input.nextInt();
        
        System.out.println("========== pesanan =========");
        if (menu_makanan.equals("bakso")) {
            System.out.println("menu makanan : "+ menu_makanan);
            System.out.println("jumlah porsi : "+ porsi);
        } else if (menu_makanan.equals("pangsit")){
            System.out.println("menu makanan : "+ menu_makanan);
            System.out.println("jumlah porsi : "+ porsi);
        } else if (menu_makanan.equals("nasi goreng")) {
            System.out.println("menu makanan : "+ menu_makanan);
            System.out.println("jumlah porsi : "+ porsi);
        } else {
            System.out.println("menu tidak tersedia");
        }
    }
}