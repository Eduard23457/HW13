public class Book {
    private String bookName;
    private Author author;
    private int bookAge;

    public Book(String bookName, Author author, int bookAge) {
        this.bookName = bookName;
        this.author = author;
        this.bookAge = bookAge;
    }

    public String getBookName() {
        return this.bookName;
    }

    public int getBookAge() {
        return this.bookAge;
    }

    public Author getAuthor() {
        return author;
    }

    public void setBookAge(int i) {
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookName.equals(book.bookName) && author.equals(book.author) && bookAge == book.bookAge;

    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(bookName);
    }

    public String getbookName() {
        return bookName;
    }

    public int getbookAge() {
        return bookAge;
    }

    public Author getauthor() {
        return author;
    }

    public void setbookAge(int bookAge) {
        this.bookAge = bookAge;
    }

    @Override
    public String toString() {
        return "Книга: " + this.getbookName() + ", автор: " + this.getauthor() + ", год:" + this.getbookAge();
    }

}

