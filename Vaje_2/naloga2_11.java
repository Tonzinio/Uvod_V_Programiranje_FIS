public class naloga2_11 {
    public static String vrednostStevila(double a) {
        if(a > 0) {
            return "Število je pozitivno";
        } else if (a < 0) {
            return "Število je negativno";
        } else {
            return "Število je enako 0";
        }
    }

    public static void main(String[] args) {
        System.out.println(vrednostStevila(-1.5));
    }
}