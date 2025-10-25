import java.util.Scanner;
public class Day48 {
    public static void main(String[] args){
        int hasil = 0;
        int a = 0,  b = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.print("pilih operator aritmatika (+,-,*,/,%) : ");
        char operator = input.next().charAt(0);
        
        switch(operator) {
            case '+':
            System.out.print("masukan angka a : ");
             a = input.nextInt();
        
            System.out.print("masukan angka b : ");
             b = input.nextInt();
            hasil = a + b;
            
            System.out.println(a + " " + operator+ " "+ b +" = "+ hasil);
            break;
            case '-':
            System.out.print("masukan angka a : ");
             a = input.nextInt();
        
            System.out.print("masukan angka b : ");
             b = input.nextInt();
            
            hasil = a - b;
            
            System.out.println(a + " " + operator+ " "+ b +" = "+ hasil);
            
            break;
            case '*':
            System.out.print("masukan angka a : ");
             a = input.nextInt();
        
            System.out.print("masukan angka b : ");
             b = input.nextInt();
            hasil = a * b;
            System.out.println(a + " " + operator+ " "+ b +" = "+ hasil);
            break;
            case '/':
            System.out.print("masukan angka a : ");
             a = input.nextInt();
        
            System.out.print("masukan angka b : ");
             b = input.nextInt();
            if (a == 0 || b == 0) {
                hasil = 0;
                System.out.println(a + " " + operator+ " "+ b +" = "+ hasil);
            } else {
                hasil = a / b;
                System.out.println(a + " " + operator+ " "+ b +" = "+ hasil);
            }
            break;
            case '%':
            System.out.print("masukan angka a : ");
             a = input.nextInt();
        
            System.out.print("masukan angka b : ");
             b = input.nextInt();
            hasil = a % b;
              System.out.println(a + " " + operator+ " "+ b +" = "+ hasil);
            break;
            
            default:
            System.out.println("operator tidak valid");
            
        }
        
    }
}