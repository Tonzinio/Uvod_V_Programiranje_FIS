public class naloga10 {
    public static void main(String[] args) {
        double podanaVrednost = 2.5;

        double ploscinaKvadrata = Math.pow(podanaVrednost, 2); //Formula je a*a, ker navodila pravijo da uporabimo funkcije iz razreda Math, uporabimo Math.pow()
        double ploscinaKroga = Math.PI * Math.pow(podanaVrednost, 2); // Formula je pi * (r*r)

        //Zaokroževanje ↓

        ploscinaKvadrata = Math.round(ploscinaKvadrata * 100.0) / 100.0;
        ploscinaKroga = Math.round(ploscinaKroga * 100.0) / 100.0;
    }
}