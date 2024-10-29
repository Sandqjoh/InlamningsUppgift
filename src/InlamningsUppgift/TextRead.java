package InlamningsUppgift;

import java.util.Scanner;

public class TextRead {
    private TextCount textCount;  // Detta skapar ett objekt av klassen TextCount, som används för att räkna antalet rader och tecken.

    // Konstruktorn för TextRead
    public TextRead() {
        textCount = new TextCount();
    }

    // Metod för att läsa in text
    public void readText() {
        Scanner scanner = new Scanner(System.in); // Skapar en Scanner för att läsa in från kommandoraden
        System.out.println("Skriv in text (skriv 'stop' för att avsluta):");

        while (true) {
            String line = scanner.nextLine(); // Läs in en rad
            if (line.equalsIgnoreCase("stop")) { // Kontrollerar om "stop" skrivs ut
                break; // Avslutar loopen
            }
            textCount.addLine(line); // Lägg till raden i textCount
        }

        // Skriv ut resultatet
        System.out.println("Antal rader: " + textCount.getNumberOfLines());
        System.out.println("Antal tecken: " + textCount.getTotalCharacters());
    }

    // Huvudmetod för att starta programmet
    public static void main(String[] args) {
        TextRead textReader = new TextRead(); // Skapar en metod av TextRead
        textReader.readText(); // Anropar metoden för att läsa in text
    }
}
