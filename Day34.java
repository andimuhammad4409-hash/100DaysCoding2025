import java.util.Scanner;
public class Day34 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukan angka a : ");
        int a = input.nextInt();
        System.out.print("masukan angka b : ");
        int b = input.nextInt();
        
        System.out.println(a <= b && a >= b);
        System.out.println(a < b || a > b);
        
        
        a += b;
        b += a;
        
        System.out.println(a <= b);
    }
}