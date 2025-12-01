public class Day85 {
    public static void main(String[] args) {
        int[] angka = {34,7,52,6,12};
        int max = angka[0];
        
        for (int i = 0;i < angka.length;i++) {
            if (angka[i] > max) {
                max = angka[i];
            
            }
        }
        
        System.out.println(max);
    }
}