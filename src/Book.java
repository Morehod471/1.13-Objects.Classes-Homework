public class Book {
    private final String title;
    private Author Author;
    private int publishingYear;

    public Book(String title, Author author, int publishingYear) {
        this.title = title;
        this.Author = author;
        this.publishingYear = publishingYear;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return Author.getName() + " " + Author.getSurname();
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return "Название книги  " + this.title + " Автор книги " + Author + " Год издания " + publishingYear;
    }

    public boolean equals(Book other) {
        if (other != null) {
            if (this.getClass() != other.getClass()) {
                return false;
            }
        }
        Book book = (Book) other;
        return title.equals(other.title) && Author.equals(other.Author) && publishingYear == other.publishingYear;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(title, Author, publishingYear);
    }

}
