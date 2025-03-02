public class naloga11 {
    public static void main(String[] args) {
        int a = 412;
        int b = 132;
        int c = -142;

        System.out.println(a >= b || a != c);
        System.out.println(a + b > c || b == c);

        /* 1. Prvo se izvedejo vse aritmetične operacije (*, /, %, -, +). Prednost ima množenje, deljenje, modulo
         * 2. Nato se izvedejo primerjalne (>, <, ==, !=)
         * 3. Na koncu se izvedejo logične  (&&, ||). Prednost ima in
         */
    }
}