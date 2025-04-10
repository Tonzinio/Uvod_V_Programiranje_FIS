public class naloga2_12 {
    public static String deljivost(int a, int b, int c) {
            if(a % b == 0 && a % c == 0) {
                return "Prvo število je deljivo z drugim in tretjim";
            } else if (a % b == 0) {
                return "Prvo število je deljivo samo z drugim";
            } else if (a % c == 0) {
                return "Prvo število je deljivo samo s tretjim";
            } else {
                return "Prvo število ni deljivo z drugim in tretjim";
            }
    }

    public static void main(String[] args) {
        System.out.println(deljivost(15, 5, 6));
    }
}