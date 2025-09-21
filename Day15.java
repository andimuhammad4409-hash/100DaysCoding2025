
import java.util.Scanner;
public class Day15 {
    public static void main(String[] args){
        //operator aritmatika + dan -
        int a,b;
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukan nilai a : ");
        a = input.nextInt();
        
        System.out.print("masukan nilai b : ");
        b = input.nextInt();
        
        System.out.println("------------------");
        
        System.out.println("hasil dari "+ a + " + "+ b + " = "+ (a+b));
        System.out.println("hasil dari "+ a + " - "+ b + " = "+ (a-b));
    }
}