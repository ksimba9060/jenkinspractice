import java.util.HashSet;
import java.util.Set;

public class LibraryManager {

    private Set<String> books = new HashSet<>();

    // 책 추가
    public void addBook(String title) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("책 제목은 비어 있을 수 없습니다.");
        }

        if (books.contains(title)) {
            throw new IllegalArgumentException("이미 존재하는 책입니다: " + title);
        }

        books.add(title);
    }

    // 책 제거
    public void removeBook(String title) {
        if (!books.contains(title)) {
            throw new IllegalArgumentException("존재하지 않는 책입니다: " + title);
        }

        books.remove(title);
    }

    // 책 존재 여부 확인
    public boolean hasBook(String title) {
        return books.contains(title);
    }

    // 전체 책 개수 반환
    public int getBookCount() {
        return books.size();
    }
}