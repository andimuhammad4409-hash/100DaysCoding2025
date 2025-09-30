import java.util.Scanner;
public class Day23 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukan panjang : ");
        int panjang = input.nextInt();
        
        System.out.print("masukan lebar : ");
        int lebar = input.nextInt();
        
        System.out.println("luas persegi panjang : "+ (panjang * lebar));
    }
}