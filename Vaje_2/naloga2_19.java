public class naloga2_19 {
    public static boolean prestopnoLeto(int a) {
        if((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(prestopnoLeto(2028));
    }
}