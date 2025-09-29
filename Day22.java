import java.util.Scanner;
public class Day22 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukan sisi persegi : ");
        int sisi = input.nextInt();
        
        System.out.println("luas persegi adalah : "+ (sisi * sisi));
    }
}