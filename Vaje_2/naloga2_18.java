public class naloga2_18 {
    public static String mesec(int a) {
        if(a == 1) {
            return "Januar";
        } else if (a == 2) {
            return "Februar";
        } else if (a == 3) {
            return "Marec";
        } else if (a == 4) {
            return "April";
        } else if (a == 5) {
            return "Maj";
        } else if (a == 6) {
            return "Junij";
        } else if (a == 7) {
            return "Julij";
        } else if (a == 8) {
            return "Avgust";
        } else if (a == 9) {
            return "September";
        } else if (a == 10) {
            return "Oktober";
        } else if (a == 11) {
            return "November";
        } else if (a == 12) {
            return "December";
        } else {
            return "Nepravilno vnešena številka";
        }

    }

    public static void main(String[] args) {
        System.out.println(mesec(4));
    }
}