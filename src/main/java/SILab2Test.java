import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SILab2Test {

    List<String> list;
    List<String> resultantna;
    List<String> exception;

    @Before
    public void init() {
        list = new ArrayList<>();
        resultantna = new ArrayList<>();
        exception = new ArrayList<>();

        list.add("1");
        list.add("2");
        list.add("#");
        list.add("#");
        list.add("#");
        list.add("3");
        list.add("#");
        list.add("3");
        list.add("#");

        resultantna.add("0");
        resultantna.add("0");
        resultantna.add("#");
        resultantna.add("#");
        resultantna.add("#");
        resultantna.add("0");
        resultantna.add("#");
        resultantna.add("0");
        resultantna.add("#");

        exception.add("0");
        exception.add("#");
        exception.add("0");

    }

    @Test
    public void everyStatementTest() {
        assertEquals(list, SILab2.function(resultantna));
    }

    @Test
    public void everyBranchTest() {
        assertEquals(list, SILab2.function(resultantna));
    }

    @Test
    public void test1() {
        assertThrows(IllegalArgumentException.class, () -> {
            SILab2.function(exception);
        });
    }
}
