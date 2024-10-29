package InlamningsUppgift;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextCountTest {

    @Test
    void testLineCounting() {
        TextCount counter = new TextCount();
        counter.addLine("Första raden");
        counter.addLine("Andra raden");
        assertEquals(2, counter.getNumberOfLines(), "Antalet rader ska vara 2");
    }

    @Test
    void testCharacterCounting() {
        TextCount counter = new TextCount();
        counter.addLine("Hejsan");
        counter.addLine("Svejsan");
        assertEquals(13, counter.getTotalCharacters(), "Antalet tecken ska vara 13");
    }

    @Test
    void testEmptyInput() {
        TextCount counter = new TextCount();
        assertEquals(0, counter.getNumberOfLines(), "Antalet rader ska vara 0 för tom input");
        assertEquals(0, counter.getTotalCharacters(), "Antalet tecken ska vara 0 för tom input");
    }
}
