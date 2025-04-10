public class naloga2_1 {
    public static void main(String[] args) {
        int a = -52; //Izberemo stevilo za izracun njene absolutne vrednosti
        int absA; //Deklariramo absolutno spremenljivko
        absA = a < 0 ? -a : a; //Na levi strani od znaka ? moramo imeti izraz, ki ima bool vrednost (true or false)
                               //Če je vrednost na levi == true, potem je vrednost absA -a, ce je false, je vrednost a
                            
        System.out.println(absA);
    }
}