import java.util.Scanner;
public class Day24 {
    public static void main(String[] args){
        
        double PI = 3.14;
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukan jari - jari lingkaran : ");
        int jari_jari = input.nextInt();
        
        double luas = PI * jari_jari * jari_jari;
        
        System.out.println("luas lingkaran adalah : "+ luas);
    }
}