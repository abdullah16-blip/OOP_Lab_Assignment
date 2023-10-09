// Inheritance: Dog and Cat inherit from Pet
// Define a Dog class (subclass of Pet)
public class Dog extends Pet {
    private DogBreeds breed;

    public Dog(String name, int age, String color, double price, DogBreeds breed) {
        super(name, age, color, price);
        this.breed = breed;
    }

    public DogBreeds getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        return super.toString() + "\nBreed: " + breed;
    }
}
