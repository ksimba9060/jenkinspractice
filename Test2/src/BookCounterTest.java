import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BookCounterTest {

    @Test
    void testAddBook() {
        BookCounter counter = new BookCounter();

        counter.addBook();

        assertEquals(1, counter.getCount());
    }

} // 왜 안 되냐...제발...