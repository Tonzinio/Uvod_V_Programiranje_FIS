public class naloga2_10 {
    public static int vecjeStevilo(int a, int b) {
        if(a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        System.out.println(vecjeStevilo(4, 6));
    }
}