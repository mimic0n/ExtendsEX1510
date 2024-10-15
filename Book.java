public class Book extends LibraryItem {
    private String author;
    private int isbn ;
    public Book(String title, int yearPublished, String author, int isbn) {
        super(title, yearPublished);
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getIsbn() {
        return isbn;
    }
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    public void getDetails() {
        System.out.println( " INFORMATION OF BOOK : ");
        System.out.println("Title: " + getTitle());
        System.out.println("Year Published: " + getYearPublished());
        System.out.println("Author: " + getAuthor());
        System.out.println("Isbn: " + getIsbn());
    }
}
