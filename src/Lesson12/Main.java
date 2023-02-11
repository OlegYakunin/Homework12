package Lesson12;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Alex", "Pushkin");
        Book book1 = new Book("Mednui Vsadnik", author1, 1837);
        System.out.printf("%s под авторством %s %s,%d%n",
                book1.getTitle(),
                book1.getAuthor().getFirstName(),
                book1.getAuthor().getLastName(),
                book1.getYear());
        book1.setYear(2000);
        System.out.printf("%s под авторством %s %s,%d%n",
                book1.getTitle(),
                book1.getAuthor().getFirstName(),
                book1.getAuthor().getLastName(),
                book1.getYear());


        Author author2 = new Author("Fedor", "Dostoevskui");
        Book book2 = new Book("Igrok", author2, 1866);
        System.out.printf("%s под авторством %s %s,%d%n",
                book2.getTitle(),
                book2.getAuthor().getFirstName(),
                book2.getAuthor().getLastName(),
                book2.getYear());

    }


}
