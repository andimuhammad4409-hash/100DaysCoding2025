import java.util.Scanner;
public class Day91 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukan nama : ");
        String n = input.nextLine();
        
        System.out.print("masukan umur : ");
        int u = input.nextInt();
        
        System.out.print("masukan tinggi : ");
        double t = input.nextDouble();
        
        garis();
        
        biodata(n,u,t);
    }
    
    static void garis () {
        System.out.println("----------------------");
    }
    
    static void biodata (String nama , int umur, double tinggi) {
        System.out.println("nama : "+nama);
        System.out.println("umur : "+umur + " tahun");
        System.out.println("tinggi badan : "+tinggi+" cm");
    }
}