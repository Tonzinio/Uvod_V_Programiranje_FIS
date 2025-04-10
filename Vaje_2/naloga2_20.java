public class naloga2_20 {
    public static int steviloDni(int a) {
        if(a == 1) {
            return 31;
        } else if (a == 2) {
            return 28;
        } else if (a == 3) {
            return 31;
        } else if (a == 4) {
            return 30;
        } else if (a == 5) {
            return 31;
        } else if (a == 6) {
            return 31;
        } else if (a == 7) {
            return 30;
        } else if (a == 8) {
            return 31;
        } else if (a == 9) {
            return 30;
        } else if (a == 10) {
            return 31;
        } else if (a == 11) {
            return 30;
        } else if (a == 12) {
            return 31;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(steviloDni(5));
    }
}