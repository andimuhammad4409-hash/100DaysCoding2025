import java.util.Scanner;
public class Day11{
  public static void main(String args){
    String nama;
    int semester;
    char kelas;
    Scanner input = new Scanner(System.in);

    System.out.print("inputkan nama anda : ");
    nama = input.nextLine();

    System.out.print("inputkan semester anda : ");
    semester = input.nextInt();

    System.out.print("inputkan kelas anda : ");
    kelas = input.next().charAt(0);

    //hasil input

    System.out.println("nama anda : "+ nama);
    System.out.println("semester : "+ semester);
    System.out.println("kelas : "+ kelas);
  
  }
}
