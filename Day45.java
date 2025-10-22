import java.util.Scanner;
public class Day45 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int urutan = 0;
        
        System.out.print("masukan urutan : ");
        int angka = input.nextInt();
        
        switch(angka) {
            case 1:
            
            urutan = 1;
            break;
            
            case 2:
            
            urutan = 2;
            break;
            
            case 3:
            
            urutan = 3;
            break;
            
            default:
            System.out.println("urutan tidak valid");
            break;
            
        }
        
        System.out.println("urutan ke-"+ urutan);
    }
}