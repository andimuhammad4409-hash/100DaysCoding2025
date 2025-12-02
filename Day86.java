public class Day86 {
    public static void main(String[] args) {
        int[] angka = {34,7,52,6,12};
        int min = angka[0];
        
        for (int i = 0;i < angka.length;i++) {
            if (angka[i] < min) {
                min = angka[i];
            
            }
        }
        
        System.out.println(min);
    }
}