public class naloga2_6 {
    public static int vecjeStevilo(int a, int b) {
        switch (Integer.compare(a, b)) { //Metoda integer.compare vrne -1 ce je b vecji, 0 ce sta enaki, 1 ce je a vecji
            case -1:
                return b;
            case 1:
                return a;
            default:
                return a;
        }
    }


    public static void main(String[] args) {
        System.out.println(vecjeStevilo(477, 6)); //testiramo
    }
}