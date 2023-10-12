public class Libary {
    private Floor[] qavatlar;
    public Libary() {
        this.qavatlar = new Floor[3];
        for(int i =0; i<3; i++) {
            this.qavatlar[i] = new Floor();
        }
    }

    public boolean add(Book book, int floor, String closet, int shelf) {
        Floor f = this.qavatlar[floor - 1];
        return f.add(book,closet,shelf);
    }

    public boolean contains(int floor, String closet, int shelf, Book book){
        Floor f = this.qavatlar[floor - 1];
        return f.contains(closet,shelf,book);
    }

    public String getBooks(int floor, String closet) {
        Floor f = this.qavatlar[floor - 1];
        return f.getBooks(closet);
    }
}
