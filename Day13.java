import java.util.Scanner;

public class Day13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("inputkan nama : ");
        String nama = input.nextLine();
        
        System.out.print("inputkan nim : ");
        final String nim = input.nextLine();
        
        System.out.print("inputkan umur : ");
        int umur = input.nextInt();
        
        System.out.print("inputkan tinggi : ");
        double tinggi = input.nextDouble();
        
        System.out.print("inputkan jenis kelamin : ");
        char j_kelamin = input.next().charAt(0);
        
        System.out.println("nama anda : "+ nama);
        System.out.println("nim : "+ nim);
        System.out.println("umur : "+ umur + " tahun");
        System.out.println("tinggi : "+ tinggi + " cm");
        System.out.println("jenis kelamin : "+ j_kelamin);
    }
}