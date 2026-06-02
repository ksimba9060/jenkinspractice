
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class StudentManagerTest {

    static StudentManager manager;

    @BeforeAll
    static void setUpAll() {
        manager = new StudentManager();

    }

    // 학생 추가 테스트
    @Test
    void testAddStudent() {
        manager.addStudent("Kim");
        assertTrue(manager.hasStudent("Kim"));
    }

    // 학생 제거 테스트
    @Test
    void testRemoveStudent() {
        manager.addStudent("Lee");
        manager.removeStudent("Lee");
        assertFalse(manager.hasStudent("Lee"));
    }

    // 중복 추가 예외 처리 테스트
    @Test
    void testDuplicateStudentException() {
        manager.addStudent("Park");

        assertThrows(IllegalArgumentException.class, () -> {
            manager.addStudent("Park");
        });
    }

    // 존재하지 않는 학생 제거 예외 처리 테스트
    @Test
    void testRemoveNonExistingStudentException() {
        assertThrows(IllegalArgumentException.class, () -> {
            manager.removeStudent("Choi");
        });
    }
}
