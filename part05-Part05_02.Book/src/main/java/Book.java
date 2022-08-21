public class Book {
    
    private String bookAuthor;
    private String bookName;
    private int bookPages;

    public Book(String author, String name, int pages) {
        
        this.bookAuthor = author;
        this.bookName = name;
        this.bookPages = pages;
    }

    public String getAuthor() {
        
        return this.bookAuthor;
    }

    public String getName() {
        
        return this.bookName;
    }

    public int getPages() {
        
        return this.bookPages;
    }

    public String toString() {
        
        return this.bookAuthor + ", " + this.bookName + ", " + this.bookPages + 
        " pages";
    }
}