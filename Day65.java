import java.util.Scanner;
public class Day65 {
    public static void main(String[] args){
        int total = 1;
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukan angka faktorial : ");
        int n = input.nextInt();
        for (int i = n;i >= 1 ;i--) {
            System.out.println(i);
            
            total *= i;
        }
        System.out.println("--------------");
        System.out.println("faktorial angka "+n+ " = "+total);
    }
}