public class Author {
    private final String nameAuthor;
    private final String surnameAuthor;

    public Author(String nameAuthor, String surnameAuthor) {

        this.nameAuthor = nameAuthor;
        this.surnameAuthor = surnameAuthor;

    }

    @Override
    public String toString() {
        return "Автор: " + nameAuthor + surnameAuthor;
    }

    public String getNameAuthor() {
        return this.nameAuthor;
    }
    public String getSurnameAuthor() {
        return this.surnameAuthor;
    }
}
