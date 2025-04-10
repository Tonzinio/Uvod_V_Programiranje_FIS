public class naloga2_3 {
    public static void main(String[] args) {
        int a = 13; // Deklariramo poljubno celostevilsko spremenljivko
        String sodaLiha = a % 2 == 0 ? "Število je sodo." : "Število je liho."; // Ce je ostanek pri deljenju z 2 0 je število sodo, če ne pa liho
        System.out.println(a + ": " + sodaLiha); //Printamo za preverbo :)
    }
}