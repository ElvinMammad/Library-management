//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
     public static void main(String[] args) {
          Library library = new Library();

          // Obyektler adli deyisenlerle yaradilir
          Item book1 = new Book(1, "Ali ve Nino", "Qurban Said");
          Item book2 = new Book(2, "Clean Code", "Robert Martin");
          Item dvd1 = new DVD(3, "Inception", 148);
          Item dvd2 = new DVD(4, "Interstellar", 169);
          Item book3 = new Book(5, "Java Core", "Cay Horstmann");

          Member aysel = new Member(101, "Aysel");
          Member elvin = new Member(102, "Elvin");

          // Kitabxanaya elave edirik
          library.addItem(book1);
          library.addItem(book2);
          library.addItem(dvd1);
          library.addItem(dvd2);
          library.addItem(book3);

          library.addMember(aysel);
          library.addMember(elvin);

          // Output
          library.printItems();
          System.out.println();

          // ID ile goturme
          library.borrowItem(101, 1);
          library.borrowItem(101, 3);
          library.borrowItem(101, 2);
          library.borrowItem(101, 4); // limit dolub
          library.borrowItem(102, 5);
          System.out.println();

          library.printMembers();

          // Deyisen oldugu ucun obyektlere birbasa da muraciet etmek olur
          System.out.println();
          System.out.println("dvd1 muddeti: " + dvd1.getLoanDays() + " gun");
          System.out.println("book1 muddeti: " + book1.getLoanDays() + " gun");
          System.out.println("aysel-in item sayi: " + aysel.getBorrowCount());
     }
}