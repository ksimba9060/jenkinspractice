import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BookCounterTest {

    @Test
    void testAddBook() {
        BookCounter counter = new BookCounter();

        counter.addBook();

        assertEquals(1, counter.getCount());
    }
    //주석을 달아봤습니다..히빈
} //주석 달기