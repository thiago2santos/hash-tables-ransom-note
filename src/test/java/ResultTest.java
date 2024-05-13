import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ResultTest {

    @Test
    public void teste() {
        Result result = new Result();
        List<String> note = new ArrayList<>();
        List<String> magazine = new ArrayList<>();
        String resultado = result.checkMagazine(magazine, note);
        assertEquals("funfando", resultado);
    }
}