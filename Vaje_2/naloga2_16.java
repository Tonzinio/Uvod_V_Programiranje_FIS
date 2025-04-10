public class naloga2_16 {
    public static boolean implikacija(boolean a, boolean b) {
        //| A  | B |A⇒B|
        // |---|---|----|
        // | 1 | 1 | 1  |
        // | 1 | 0 | 0  |
        // | 0 | 1 | 1  |
        // | 0 | 0 | 1  |
        // Ce smo se kaj naucili iz boolove algebre oz. diskretnih struktur vemo da je A implikacija B ekvivalentna izrazu A negirano ALI B

        return !a || b;
        
    }

    public static void main(String[] args) {
        System.out.println(implikacija(false, false));
    }
}