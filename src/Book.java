public class Book {
    private String author;
    private String title;

    private String jovon;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getTitle() {
        return this.title;
    }

    public String getJovon() {
        return jovon;
    }

    public void setJovon(Shelf jovon) {
//         this.jovon = jovon;
    }

//    public int getShelf() {
//        return this.jovon.getNumber()  + 1;
//    }

    @Override
    public String toString() {
        return this.author + ", " + this.title;
    }

    @Override
    public boolean equals(Object obj) {
        Book book = (Book) obj;
        if (this.author.equals(book.author) && this.title.equals(book.title)) {
            return true;
        }
        return false;
    }

    public boolean getShelf() {
        return false;
    }
}
