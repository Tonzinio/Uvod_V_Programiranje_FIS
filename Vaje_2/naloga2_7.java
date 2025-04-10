public class naloga2_7 {

    public static String danTedna(int a) {
        switch(a) {
            case 1:
                return "Ponedeljek";
            case 2:
                return "Torek";
            case 3:
                return "Sreda";
            case 4:
                return "Četrtek";
            case 5:
                return "Petek";
            case 6:
                return "Sobota";
            case 7:
                return "Nedelja";
            default:
                return "To ni veljaven dan, vnesi številko od 1 do 7";
        }
    }

    public static void main(String[] args) {
        System.out.println(danTedna(16));
    }
}