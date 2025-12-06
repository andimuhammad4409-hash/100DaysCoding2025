public class Day90 {
    public static void main(String[] args) {
        int luas1 = luasPersegi(2);
        System.out.println(luas1);
    }
    
    static int luasPersegi(int sisi) {
        int luas = sisi * sisi;
        return luas;
    }
}