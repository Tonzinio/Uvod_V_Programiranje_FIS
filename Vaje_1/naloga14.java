public class naloga14 {
    public static void main(String[] args) {
        // Check if the correct number of arguments is provided
        if (args.length < 5) {
            System.out.println("Zaženi program tako da v terminal zapišeš: java naloga14 int double boolean char String");
            return;
        }

        int vrednost1 = Integer.parseInt(args[0]);
        double vrednost2 = Double.parseDouble(args[1]);
        boolean vrednost3 = Boolean.parseBoolean(args[2]);
        char vrednost4 = args[3].charAt(0);
        String vrednost5 = args[4];                   

        System.out.println("int: " + vrednost1);
        System.out.println("double: " + vrednost2);
        System.out.println("boolean: " + vrednost3);
        System.out.println("char: " + vrednost4);
        System.out.println("String: " + vrednost5);
    }
}