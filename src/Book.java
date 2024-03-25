import java.util.Objects;

public class Book {
    private final String name;
    private final Author author;
    private int publisherYear;

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book c2 = (Book) other;
        return name.equals(c2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, publisherYear);
    }

    public Book(String name, Author author, int publisherYear) {


        this.name = name;
        this.author = author;
        this.publisherYear = publisherYear;
    }

    @Override
    public String toString() {
        return "Наименование книги " + name + " Дата публикации " + publisherYear;
    }

    public String getName() {
        return this.name;
    }
    public Author getAuthor() {
        return this.author;
    }
    public int getPublisherYear() {
        return this.publisherYear;
    }

    public void setPublisherYear(int publisherYear) {
        this.publisherYear = publisherYear;
    }


}