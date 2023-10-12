public class Floor {
    private Closet[] shkaflar = new Closet[30];

    public Floor() {
        for(int i = 0; i < 30; i++) {
            this.shkaflar[i] = new Closet("C" + (i + 1));
        }
    }

    public boolean add(Book book, String closet, int shelf) {
        Closet c = this.getCloset(closet);
        if (c != null) {
           return c.add(book, shelf);
        }
        return false;
    }

    private Closet getCloset(String name) {
        for(int i=0; i < this.shkaflar.length; i++) {
            Closet s = this.shkaflar[i];
            if (name.equals(s.getName())) {
                return s;
            }
        }
        return null;
    }

    public boolean contains(String closet, int shelf, Book book) {
        Closet c = this.getCloset(closet);
        if(c != null) {
            return c.contains(book, shelf);
        }
        return false;
    }

    public String getBooks(String closet) {
        Closet c = this.getCloset(closet);
        if(c != null) {
            return c.getBooks();
        }
        return null;
    }
}
