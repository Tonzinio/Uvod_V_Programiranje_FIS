public class naloga2_4 {

    public static boolean glasovanjeNaVolitvah(int starost) {
        switch (starost) { //Ker moramo uporabiti switch stavek nastejemo vse primere od 0 do 17, ostalo naj bo default za bolj berljivo kodo
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                return false;
            default:
                return true;
        }
    }

    public static void main(String[] args) { //Preverba
        System.out.println(glasovanjeNaVolitvah(10));
        System.out.println(glasovanjeNaVolitvah(19));
        System.out.println(glasovanjeNaVolitvah(102));
    }

}