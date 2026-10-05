class Book extends Item {
    private String author;

    public Book(int id, String title, String author) {
        super(id, title);
        this.author = author;
    }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    @Override
    public int getLoanDays() { return 14; }

    @Override
    public String toString() {
        return "Kitab " + super.toString() + " | Muellif: " + author;
    }
}
