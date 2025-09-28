
public class Day21 {
    public static void main(String[] args){
        int a = 5;
        int b = 6;
        
        //sebelum nilai di tukar
        
        System.out.println("a : "+ a);
        System.out.println("b : "+ b);
        
        //setelah nilai di tukar
        
        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.println("---------------");
        System.out.println("a : "+ a);
        System.out.println("b : "+ b);
    }
}