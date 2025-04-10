public class naloga2_13 {
    public static int absolutno(int a) {
        if(a > 0) {
            return a;
        } else if (a < 0) {
            return -a;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(absolutno(-15));
    }
}