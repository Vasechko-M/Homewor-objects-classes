public class Main {
    public static void main(String[] args) {

        Author lermontov = new Author("Михаил", "Лермонтов");

        Book mtsiri = new Book("\"Мцыри\"", lermontov, 2021);

        System.out.println("Книга 1 - " + mtsiri.getName() + " "
                + mtsiri.getAuthor().getSurnameAuthor() + " " + mtsiri.getPublisherYear());
        mtsiri.setPublisherYear(1839);
        System.out.println("Дата публикации исправлено - " + mtsiri.getPublisherYear());

        System.out.println("Автор - " + lermontov.getNameAuthor() + " "
                + lermontov.getSurnameAuthor());

        Author gorkii = new Author("Максим", "Горький");

        Book naDne = new Book("\"На дне\"", gorkii, 1902);
        System.out.println("Книга 2 - " + naDne.getName() + " "
                + naDne.getAuthor().getSurnameAuthor() + " " + naDne.getPublisherYear());

        System.out.println("Автор - " + gorkii.getNameAuthor() + " "
                + gorkii.getSurnameAuthor());


    }
}