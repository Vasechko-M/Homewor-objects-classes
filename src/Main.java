public class Main {
    public static void main(String[] args) {

        Author lermontov = new Author("Михаил ", "Лермонтов");

        Book mtsiri = new Book("\"Мцыри\"", lermontov, 2021);

        System.out.println("Книга 1 - " + mtsiri + " " + lermontov);
        mtsiri.setPublisherYear(1839);
        System.out.println("Дата публикации исправлено - " + mtsiri.getPublisherYear());

        //System.out.println("Автор - " + lermontov.getNameAuthor() + " "
        //        + lermontov.getSurnameAuthor());

        Author gorkii = new Author("Максим ", "Горький");

        Book naDne = new Book("\"На дне\"", gorkii, 1902);
        System.out.println("Книга 2 - " + naDne + " " + gorkii);

        //System.out.println("Автор - " + gorkii.getNameAuthor() + " "
        //        + gorkii.getSurnameAuthor());
        Author gorkii1 = new Author("Максим ", "Горький");

        Book naDne1 = new Book("\"На днеttt\"", gorkii1, 1902);
        System.out.println("Книга 2 - " + naDne1 + " " + gorkii1);
        System.out.println(gorkii.equals(gorkii1));
        System.out.println(naDne.equals(naDne1));


    }
}