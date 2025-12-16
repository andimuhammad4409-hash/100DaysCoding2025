import java.util.Scanner;
public class Day100 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukan kata : ");
        String kata = input.nextLine();
        
        int hasil = 0;
        
        for (int i = 0;i < kata.length();i++) {
            char c = kata.charAt(i);
            
            if (hasil == 0 && c == 'I') {
                hasil = 1;
            } 
            
            if (hasil == 1 && c == 'S') {
                hasil = 2;
            } 
            
            if (hasil == 2 && c == 'C') {
                hasil = 3;
                break;
            }
        }
        
        if (hasil == 3) {
            System.out.println("CANTIK");
        } else {
            System.out.println("TIDAK CANTIK");
        }
    }
}