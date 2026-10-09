public class AnimalDriver {
    public static void main(String[] args) {
        Animal[] animals = {
            new Dog("Agus", "Amerika", 4),
            new Chicken("Joy", "Indonesia", 2),
            new Lion("Simba", "Afrika", 4)
        };

        for (Animal animal : animals) {
            System.out.println("Nama        : " + animal.getNama());
            System.out.println("Asal        : " + animal.getAsal());
            System.out.println("Jumlah kaki : " + animal.getJumlahKaki());

            System.out.print("Suara       : ");
            animal.toShout();

            System.out.print("Makan       : ");
            animal.toEat();

            System.out.println();
        }
    }
}
