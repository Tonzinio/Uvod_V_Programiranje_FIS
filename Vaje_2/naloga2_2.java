public class naloga2_2 {
    public static void main(String[] args) {
        int a = 10; //Deklariramo dve spremenjlivki
        int b = 25;
        int min, max; //Deklariramo spremenljivki za min in max
        min = a < b ? a : b; //Poiscemo min, primerjamo ce je a manjsi od b, ce je true, shranimo a za min, ce ne pa b
        max = a > b ? a : b; //Poiscemo max, ce je a vecji od b true, shranimo a za max, ce ne pa b
        System.out.println("Min je: " + min + ". Max je: " + max + "."); //Se sprintamo in pozenemo program za preverbo :)
    }
}