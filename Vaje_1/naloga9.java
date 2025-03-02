public class naloga9 {
    public static void main(String[] args) {
        int a = 513; // Poljubno trimestno število
        int enice = a % 10; // S pomočjo modula 10 izluščimo 3, 51|3
        int desetice = (a / 10) % 10; // Prvo delimo poljubno trimestno število z 10, da se znebimo enic, nato iz kvocienta s pomočjo modula 10 izluščimo desetico, v tem primeru 1. 51|3| → 5|1
        int stotice = a / 100; // Da izluščimo stotico a delimo s 100 in dobimo, v tem primeru, 5

        System.out.println("Poljubno obrnjeno trimestno število: " + enice + desetice + stotice); //Prvi način zapisa
        int obrnjenoStevilo = enice * 100 + desetice * 10 + stotice; // Drugi način z uporabo nove spremenljivke
        System.out.println("Poljubno obrnjeno trimestno število z uporabo matematičnih operacij: " + obrnjenoStevilo);
    }
}