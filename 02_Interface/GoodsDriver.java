public class GoodsDriver {
    public static void main(String[] args) {
        Food food = new Food("Roti", 10000, 250);
        Toy toy = new Toy("Robot", 150000, 8);
        Book book = new Book("Belajar Java", 100000, "Budi");

        System.out.println("=== FOOD ===");
        food.display();

        System.out.println("\n=== TOY ===");
        toy.display();

        System.out.println("\n=== BOOK ===");
        book.display();
    }
}
