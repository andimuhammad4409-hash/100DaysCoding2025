import java.util.Scanner;
public class Day12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String nama,alamat,prodi;
        int usia,semester;
        double tinggi_badan, berat_badan;
        char kelas;
        
        //proses input
        System.out.println("#### penginputan data diri ####");
        System.out.print("inputkan nama anda : ");
        nama = input.nextLine();
        
        System.out.print("inputkan alamat anda : ");
        alamat = input.nextLine();
        
        System.out.print("inputkan usia anda : ");
        usia = input.nextInt();
        
        System.out.print("inputkan semester anda : ");
        semester = input.nextInt();
        
        System.out.print("inputkan tinggi badan anda : ");
        tinggi_badan = input.nextDouble();
        
        System.out.print("inputkan berat badan anda : ");
        berat_badan = input.nextDouble();
        
        System.out.print("inputkan kelas anda : ");
        kelas = input.next().charAt(0);
        
        //output 
        
        System.out.println("#### data diri anda ####");
        System.out.println("nama anda : "+ nama);
        System.out.println("alamat anda : "+ alamat);
        System.out.println("usia anda : "+ usia + " tahun");
        System.out.println("semester : "+ semester);
        System.out.println("tinggi badan : "+ tinggi_badan + " cm");
        System.out.println("berat badan : "+ berat_badan + " kg");
        System.out.println("kelas : "+ kelas);
        
    }
}