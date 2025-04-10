public class naloga2_8 {

    public static double kalkulator(double a, double b, char operand) {
        switch(operand) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a/b;
            case '%':
                return a%b;
            default:
                System.out.println("Nepodprt operand");
                return 0.0;

        }
    }

    public static void main(String[] args) {
        System.out.println(kalkulator(14, 7,'c'));
    }
}