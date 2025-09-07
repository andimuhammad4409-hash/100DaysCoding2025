package operator;

import java.util.Scanner;
public class aritmatika {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        
        int a,b,hasil;
        
        System.out.print("masukan angka a : ");
        a = num.nextInt();
        
        System.out.print("masukan angka b : ");
        b = num.nextInt();
        
        System.out.println("hasil dari "+ a + " + "+ b + " = "+ (a + b));
    }
}