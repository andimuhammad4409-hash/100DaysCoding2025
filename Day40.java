import java.util.Scanner;
public class Day40 {
   public static void main(String[] args){
       
       int hasil = 0;
       Scanner input = new Scanner(System.in);
       
       System.out.print("inputkan operator (+,-,*,/,%) : ");
       String operator = input.nextLine();
       
       
       if (operator.equals("+")){
           System.out.print("masukan angka a : ");
           int a = input.nextInt();
           System.out.print("masukan angka b : ");
           int b = input.nextInt();
            hasil = a + b;
           System.out.println(a + operator + b +" = "+ hasil);
       } else if (operator.equals("-")) {
           System.out.print("masukan angka a : ");
           int a = input.nextInt();
           System.out.print("masukan angka b : ");
           int b = input.nextInt();
            hasil = a - b;
           System.out.println(a + operator + b +" = "+ hasil);
       } else if (operator.equals("*")) {
           System.out.print("masukan angka a : ");
           int a = input.nextInt();
           System.out.print("masukan angka b : ");
           int b = input.nextInt();
            hasil = a * b;
           System.out.println(a + operator + b +" = "+ hasil);
       } else if (operator.equals("/")) {
           System.out.print("masukan angka a : ");
           int a = input.nextInt();
           System.out.print("masukan angka b : ");
           int b = input.nextInt();
            hasil = a / b;
           System.out.println(a + operator + b +" = "+ hasil);
       } else if (operator.equals("%")) {
           System.out.print("masukan angka a : ");
           int a = input.nextInt();
           System.out.print("masukan angka b : ");
           int b = input.nextInt();
            hasil = a % b;
            System.out.println(a + operator + b +" = "+ hasil);
       } else {
           System.out.println("tidak tersedia");
       }
       
   } 
}