public class Book {
    private final String name;
    private final String author;
    private int publisherYear;
    public Book(String name, String author, int publisherYear) {
        this.name = name;
        this.author = author;
        this.publisherYear = publisherYear;
    }
    public String getName() {
        return this.name;
    }
    public String getAuthor() {
        return this.author;
    }
    public int getPublisherYear() {
        return this.publisherYear;
    }

    public void setPublisherYear(int publisherYear) {
        this.publisherYear = publisherYear;
    }


}