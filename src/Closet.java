public class Closet {
    private Shelf[] jovonlar = new Shelf[6];
    private String name;

    public Closet(String name) {
        this.name = name;
        for(int i = 0; i < 6; i++) {
            this.jovonlar[i] = new Shelf(i);
        }
    }

    public String getName() {
        return name;
    }

    public boolean add(Book book, int shelf) {
        Shelf s = this.jovonlar[shelf - 1];
        return s.add(book);
    }

    public boolean contains(Book book, int shelf) {
        Shelf s = this.jovonlar[shelf - 1];
        return s.contains(book);
    }

    public String getBooks() {
        String result = "";
        for (int i = 0; i < this.jovonlar.length; i++) {
            Shelf shelf = this.jovonlar[i];
            result += "Shelf " + (i + 1) + "\n";
            result += shelf.getBooks();
        }
        return result;
    }
}
