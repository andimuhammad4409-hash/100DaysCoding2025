import java.util.Scanner;
public class Day87 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[] nama = {"yudha","danil","asril"};
        
        System.out.print("cari nama : ");
        String cari = input.nextLine();
        
        for (int i = 0;i < nama.length;i++) {
            if (cari.equals(nama[i])) {
                System.out.println(nama[i]+" berada pada index ke-"+i);
            }
        }
    }
}