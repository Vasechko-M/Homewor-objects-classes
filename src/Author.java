import java.util.Objects;

public class Author {
    private final String nameAuthor;
    private final String surnameAuthor;

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author c2 = (Author) other;
        return nameAuthor.equals(c2.nameAuthor);


    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAuthor, surnameAuthor);
    }

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
