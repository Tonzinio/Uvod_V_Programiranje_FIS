public class naloga15 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        // Uporaba bitnih operacij - XOR

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        /* Da bi uporabili XOR moramo poznati tudi pravilnostno tabelo zanj, primer delovanja:
         *     01 (1)      11(3)      11(3)
         * ⊕  10 (2)  ⊕  10(2)     ⊕01(1)
         * ----------   -------     --------    
         * a = 11 (3)  b = 01(1)  a = 10(2)
         * 
         * Pravilnostna tabela:
         * A | B | A ⊕ B
         * 0 | 0 |   0
         * 0 | 1 |   1 
         * 1 | 0 |   1
         * 1 | 1 |   0 
         * Vrstni red gre od navzgor proti navzdol, od leve proti desni
         */

         System.out.println(a + " " + b);
    }
}
