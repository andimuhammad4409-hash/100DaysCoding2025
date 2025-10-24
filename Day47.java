import java.util.Scanner;
public class Day47 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukan angaka (1-7) : ");
        int angka = input.nextInt();
        
        String NamaHari;
        
        switch(angka) {
            case 1:
            NamaHari = "senin";
            break;
            
            case 2:
            NamaHari = "selasa";
            break;
            
            case 3:
            NamaHari = "rabu";
            break;
            
            case 4:
            NamaHari = "kamis";
            break;
            
            case 5:
            NamaHari = "jum'at";
            break;
            
            
            case 6:
            NamaHari = "sabtu";
            break;
            
            case 7:
            NamaHari = "minggu";
            break;
            
            default:
            NamaHari = "tidak valid";
            break;
        }
        
        System.out.println("hari : "+ NamaHari);
    }
} 