import java.util.Scanner;
public class Day97 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukan sisi : ");
        int n = input.nextInt();
        
        System.out.println("luas persegi adalah : "+ luasPersegi(n));
    }
    
    static int luasPersegi(int sisi) {
        int luas = sisi * sisi;
        return luas;
    }
}