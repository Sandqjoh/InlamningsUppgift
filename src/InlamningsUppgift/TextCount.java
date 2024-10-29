package InlamningsUppgift;

public class TextCount {
    private int numberOfLines;      // Håller koll på antalet rader
    private int totalCharacters;     // Håller koll på det totala antalet tecken

    // Konstruktor för TextCount
    public TextCount() {
        numberOfLines = 0;           // Tilldelar värdet 0
        totalCharacters = 0;         // Tilldelar värdet 0
    }

    // Metod för att lägga till en rad
    public void addLine(String line) {
        if (line != null && !line.equalsIgnoreCase("stop")) { // Kontrollerar att raden inte är null och inte "stop"
            numberOfLines++;                // Ökar antalet rader med 1
            totalCharacters += line.length(); // Lägger till antalet tecken i raden till den totala summan
        }
    }

    // Metod för att få antalet rader
    public int getNumberOfLines() {
        return numberOfLines;             // Returnerar antalet rader
    }

    // Metod för att få det totala antalet tecken
    public int getTotalCharacters() {
        return totalCharacters;            // Returnerar det totala antalet tecken
    }
}
