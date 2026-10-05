public class Member {
    private int id;
    private String name;
    private Item[] borrowedItems = new Item[3];
    private int borrowCount;

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getBorrowCount() { return borrowCount; }

    public boolean borrow(Item item) {
        if (borrowCount >= borrowedItems.length) {
            return false; // limit dolub
        }
        borrowedItems[borrowCount++] = item;
        return true;
    }

    public void printBorrowed() {
        System.out.println(name + " goturdukleri (" + borrowCount + "/3):");
        if (borrowCount == 0) {
            System.out.println("   - yoxdur");
        }
        for (int i = 0; i < borrowCount; i++) {
            System.out.println("   - " + borrowedItems[i]);
        }
    }
}