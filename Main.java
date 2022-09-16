public class Main{
  public static void main(String[] a){
    Book b1 = new Book();
    Book b2 = new Book("Merriam-Webster Dictionary");
    Book b3 = new Book("Ender's Game", "Card, Orson Scott", 352);
    Book b4 = new Book("Bakemonogatari", "Isin, Nisio", 240);
    
    System.out.println(b1);
    System.out.println(b2);
    System.out.println(b3);
    System.out.println(b4);
      
  }
}