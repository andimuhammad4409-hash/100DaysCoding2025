import java.util.Scanner;
public class Day78 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukan kata : ");
        String kata = input.nextLine();
        
        int jumlah = kata.length();
        String hb = kata.toUpperCase();
        boolean pengecekan = kata.contains("hai");
        String ganti = kata.replace(kata, "dunia");
        
        System.out.println("jumlah huruf : "+ jumlah);
        System.out.println("di ubah ke huruf besar : "+hb);
        System.out.println("apakah kata "+kata+" ada di pengecekan : "+pengecekan);
        System.out.println("kata "+ kata+" di ganti jadi "+ ganti);
    }
} 