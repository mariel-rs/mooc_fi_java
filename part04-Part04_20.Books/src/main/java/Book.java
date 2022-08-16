public class Book {
    
    private String bookTitle;
    private int bookPages;
    private int bookPublishYear;

    public Book(String name, int pages, int publishYear) {
        
        this.bookTitle = name;
        this.bookPages = pages;
        this.bookPublishYear = publishYear;

    }

    public String toString() {
        
        return this.bookTitle + ", " + this.bookPages + " pages, " + 
        this.bookPublishYear;
    }

    public String getBookTitle() {
        return this.bookTitle;
    }
}
