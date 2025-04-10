public class naloga2_17 {
    public static boolean samoglasnik(char a) {
        char univerzalnaCrka = Character.toLowerCase(a);
        if(univerzalnaCrka == 'a' || univerzalnaCrka == 'e' || univerzalnaCrka == 'i' || univerzalnaCrka == 'o' || univerzalnaCrka == 'u') {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(samoglasnik('c'));
        System.out.println(samoglasnik('i'));
    }
}