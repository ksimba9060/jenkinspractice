import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LibraryManagerTest {

    private LibraryManager manager;

    @BeforeEach
    void setUp() {
        manager = new LibraryManager();
    }

    // 책 추가 테스트
    @Test
    void testAddBook() {
        manager.addBook("Clean Code");

        assertTrue(manager.hasBook("Clean Code"));
        assertEquals(1, manager.getBookCount());
    }

    // 책 제거 테스트
    @Test
    void testRemoveBook() {
        manager.addBook("Effective Java");
        manager.removeBook("Effective Java");

        assertFalse(manager.hasBook("Effective Java"));
        assertEquals(0, manager.getBookCount());
    }

    // 중복 책 추가 예외 테스트
    @Test
    void testDuplicateBookException() {
        manager.addBook("Refactoring");

        assertThrows(IllegalArgumentException.class, () -> {
            manager.addBook("Refactoring");
        });
    }

    // 존재하지 않는 책 제거 예외 테스트
    @Test
    void testRemoveNonExistingBookException() {
        assertThrows(IllegalArgumentException.class, () -> {
            manager.removeBook("Unknown Book");
        });
    }

    // 빈 제목 추가 예외 테스트
    @Test
    void testBlankTitleException() {
        assertThrows(IllegalArgumentException.class, () -> {
            manager.addBook("");
        });
    }
}