import java.util.Scanner;
public class Day98 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int fn,fn1,fn2;
        
        System.out.print("masukan jumlah deret : ");
        int n = input.nextInt();
        
        fn1 = 0;
        fn2 = 1;
        fn = 0;
        
        for (int i = 1;i <= n;i++) {
            System.out.print(fn1);
            fn = fn1 + fn2;
            fn1 = fn2;
            fn2 = fn;
        }
        
    }
    
}