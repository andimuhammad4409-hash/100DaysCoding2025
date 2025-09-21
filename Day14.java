
public class Day14 {
    public static void main(String[] args){
        // konversi tipe data string ke tipe data primitif
        
        String angka = "12345";
        
        System.out.println(angka);
        
        int konversi_angka = Integer.parseInt(angka);
        
        System.out.println(konversi_angka);
        
        String pecahan = "170.22";
        
        System.out.println(pecahan);
        
        double konversi_pecahan = Double.parseDouble(pecahan);
        
        System.out.println(konversi_pecahan);
    }
}