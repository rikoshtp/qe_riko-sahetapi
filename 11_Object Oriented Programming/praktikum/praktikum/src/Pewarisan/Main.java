package Pewarisan;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();

        Herbivora herbivora = new Herbivora("tumbuhan","tumpul");
        Carnivora Carnivora = new Herbivora("Daging","Tajam");
        Herbivora Omnivora = new Herbivora("Semua","tumpul");

        System.out.println("Hi I'm Herbivora, My name is Kambing, my food is" herbivora.identify() "I have" "teeth");
        System.out.println("Hi I'm Carnivora, My name is Singa, my food is" "I have" "teeth");
        System.out.println("Hi I'm Omnivora, My name is Ayam, my food is" "I have" "teeth");

    }
}
