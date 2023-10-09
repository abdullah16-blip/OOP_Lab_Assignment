// Define a Cat class (subclass of Pet)
public class Cat extends Pet {
    private CatBreeds breed;

    public Cat(String name, int age, String color, double price, CatBreeds breed) {
        super(name, age, color, price);
        this.breed = breed;
    }

    public CatBreeds getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        return super.toString() + "\nBreed: " + breed;
    }
}
