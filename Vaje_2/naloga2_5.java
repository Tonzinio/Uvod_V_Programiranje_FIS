public class naloga2_5 {
    public static boolean jeSamoglasnik(char crka) {
    switch (crka) {
        case 'a', 'e', 'i', 'o', 'u': // Ker je hitreje za case zapisemo samoglasniki, ce je crka samoglasnik izpisemo true, ce ne je false
            return true;
        default:
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(jeSamoglasnik('c')); //Preverba delovanja programa
    }
}