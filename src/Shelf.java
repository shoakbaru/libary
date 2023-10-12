public class Shelf {
    private Book[] kitoblar = new Book[10];
    private  int number;

    private int currentIndex = 0;
    public Shelf(Integer number) {
        this.number = number;
    }

    public boolean add(Book book) {
        if (this.currentIndex < 10) {
        this.kitoblar[this.currentIndex] = book;
        this.currentIndex++;
        book.setJovon(this);
        return true;
        }
        return false;
    }

    public boolean contains(Book book) {
        for (int i =0; i < this.kitoblar.length; i++ ) {
            Book b = this.kitoblar[i];
            if (b != null) {
                return b.equals(book);
            }
        }
        return false;
    }

    public String getBooks() {
        String result = "";
        for (int i = 0; i < this.kitoblar.length; i++) {
            Book b = this.kitoblar[i];
            if (b != null) {
                result += b.toString() + "\n";
            }
        }
        return result;
    }
}
