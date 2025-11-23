
public class Day77 {
    public static void main(String[] args) {
        String kata = "Hello World";
        
        String ambil = kata.substring(5);
        String ganti = kata.replace("World", "java");
        
        String kata1 = " Halo Dunia ";
        
        String jarak = kata1.trim();
        
        System.out.println(ambil);
        System.out.println(ganti);
        System.out.println(jarak);
    }
}