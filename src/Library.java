class Library {
    private Item[] items = new Item[50];
    private int itemCount;
    private Member[] members = new Member[50];
    private int memberCount;

    public void addItem(Item item) {
        if (itemCount < items.length) {
            items[itemCount++] = item;
        } else {
            System.out.println("Kitabxana doludur!");
        }
    }

    public void addMember(Member member) {
        if (memberCount < members.length) {
            members[memberCount++] = member;
        } else {
            System.out.println("Uzv limiti dolub!");
        }
    }

    public Item findItem(int id) {
        for (int i = 0; i < itemCount; i++) {
            if (items[i].getId() == id) return items[i];
        }
        return null;
    }

    public Member findMember(int id) {
        for (int i = 0; i < memberCount; i++) {
            if (members[i].getId() == id) return members[i];
        }
        return null;
    }

    public void borrowItem(int memberId, int itemId) {
        Member m = findMember(memberId);
        Item it = findItem(itemId);
        if (m == null || it == null) {
            System.out.println("Uzv ve ya item tapilmadi!");
            return;
        }
        if (m.borrow(it)) {
            System.out.println(m.getName() + " -> \"" + it.getTitle()
                    + "\" goturdu (" + it.getLoanDays() + " gun)");
        } else {
            System.out.println(m.getName() + " daha artiq item gotura bilmez (limit 3)!");
        }
    }

    public void printItems() {
        System.out.println("=== Itemler (" + itemCount + ") ===");
        for (int i = 0; i < itemCount; i++) {
            System.out.println(items[i]); // polimorfizm
        }
    }

    public void printMembers() {
        System.out.println("=== Uzvler (" + memberCount + ") ===");
        for (int i = 0; i < memberCount; i++) {
            members[i].printBorrowed();
        }
    }
}