public class naloga13 {
    public static void main(String[] args) {
        int a = 10;
        double b = 3.14;
        long c = 125214;

        a = b;
        c = a;
        
        System.out.println(a + " " + b);

        /* Program se ne izvede:
         * naloga13.java:7: error: incompatible types: possible lossy conversion from double to int
            a = b;
            ^
           1 error
         */
    }
}