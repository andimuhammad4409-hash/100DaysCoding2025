
public class Day76 {
    public static void main(String[] args) {
        String nama1 = "fulan";
        String nama2 = "Fulan";
        String nama3 = "";
        String nama4 = "kelas online";
        
        boolean pengecekan = nama1.equals(nama2);
        boolean pengecekan1 = nama1.equalsIgnoreCase(nama2);
        boolean pengecekan2 = nama3.isEmpty();
        boolean pengecekan3 = nama4.contains("online");
        
        System.out.println(pengecekan);
        System.out.println(pengecekan1);
        System.out.println(pengecekan2);
        System.out.println(pengecekan3);
    }
}