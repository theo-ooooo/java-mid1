package nested.test.ex1;

public class Library {
    private final Book[] books;
    private int bookCount;

    public Library(int size) {
        books = new Book[size];
        this.bookCount = 0;
    }

    public void addBook(String title, String author) {
        if (bookCount < books.length) {
            books[bookCount++] = new Book(title, author);
        } else {
            System.out.println("도서 저장공간이 꽉 찼습니다.");
        }
    }

    public void showBooks() {
        System.out.println("==도서 목록==");
        for (int i = 0; i < bookCount; i++) {
            System.out.println("도서 이름 : " + books[i].title + "도서 작가 : " + books[i].author);
        }
    }

    private static class Book {
        private final String title;
        private final String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

    }
}
