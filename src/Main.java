public class Main {
    public static void main(String[] args) {
        Book mtsiri = new Book("*Мцыри*", "Лермонтов", 2021);
        System.out.println("Книга 1 - " + mtsiri.getName() + " "
                + mtsiri.getAuthor() + " " + mtsiri.getPublisherYear());
        mtsiri.setPublisherYear(1839);
        System.out.println("Дата публикации исправлено - " + mtsiri.getPublisherYear());

        Author lermontov = new Author("Михаил", "Лермонтов");
        System.out.println("Автор - " + lermontov.getNameAuthor() + " "
                + lermontov.getSurnameAuthor());

        Book naDne = new Book("*На дне*", "Горький", 1902);
        System.out.println("Книга 2 - " + naDne.getName() + " "
                + naDne.getAuthor() + " " + naDne.getPublisherYear());

        Author gorkii = new Author("Максим", "Горький");
        System.out.println("Автор - " + gorkii.getNameAuthor() + " "
                + gorkii.getSurnameAuthor());


    }
}