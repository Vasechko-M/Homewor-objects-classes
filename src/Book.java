public class Book {
    private final String name;
    private final Author author;
    private int publisherYear;
    public Book(String name, Author author, int publisherYear) {


        this.name = name;
        this.author = author;
        this.publisherYear = publisherYear;
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