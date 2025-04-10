public class naloga2_15 {
    public static boolean obstojTrikotnika(double a, double b, double c) {
        if(a + b > c && a + c > b && b + c > a) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(obstojTrikotnika(1.4, 1.6, 10.8));
    }
}