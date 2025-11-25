import java.util.Scanner;
public class Day79 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("==========LOGIN==========");
        System.out.print("username : ");
        String username = input.nextLine();
        
        System.out.print("password : ");
        String password = input.nextLine();
        System.out.println("====================");
        
        while (true) {
            
            System.out.print("masukan username : ");
            String user = input.nextLine();
            
            System.out.print("masukan password : ");
            String pass = input.nextLine();
            
            if (user.equals(username) && pass.equals(password)) {
                break;
            }
        }
    }
}