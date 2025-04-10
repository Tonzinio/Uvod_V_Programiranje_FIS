public class naloga2_14 {
    public static int najvecje(int a, int b, int c) {
        if(a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else if (c >= a && c >= b) {
            return c;
        } else {
            return a;
        }
    }

    public static void main(String[] args) {
        System.out.println(najvecje(5, 163, 143));
    }
}