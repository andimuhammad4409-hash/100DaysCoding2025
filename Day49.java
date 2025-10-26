import java.util.Scanner;
public class Day49 {
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       
       System.out.print("masukan umur : ");
       int umur = input.nextInt();
       
       String status = (umur >= 18) ? "remaja" : "anak-anak";
       
       System.out.println(status);
   } 
}