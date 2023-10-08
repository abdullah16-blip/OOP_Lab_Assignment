import java.util.ArrayList;
import java.util.List;

// Define a Pet class (base class)
class Pet {
    private String name;
    private int age;
    private String color;
    private double price;

    // Constructor to initialize pet attributes
    public Pet(String name, int age, String color, double price) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.price = price;
    }

    // Getter methods for accessing private attributes
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                "\nAge: " + age +
                "\nColor: " + color +
                "\nPrice: $" + price;
    }
}

// Define DogBreeds enum for dog breeds
enum DogBreeds {
    LABRADOR, GOLDEN_RETRIEVER, GERMAN_SHEPHERD, BEAGLE, BULLDOG
}

// Define CatBreeds enum for cat breeds
enum CatBreeds {
    SIAMESE, PERSIAN, MAINE_COON, RAGDOLL, BENGAL
}

// Inheritance: Dog and Cat inherit from Pet
// Define a Dog class (subclass of Pet)
class Dog extends Pet {
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

// Define a Cat class (subclass of Pet)
class Cat extends Pet {
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

// PetShop class to manage pets in the shop
class PetShop {
    private List<Pet> pets;

    public PetShop() {
        pets = new ArrayList<>();
    }

    public void addPet(Pet pet) {
        pets.add(pet);
    }

    public void displayAllPets() {
        for (Pet pet : pets) {
            System.out.println("Type: " + pet.getClass().getSimpleName());
            System.out.println(pet);
            System.out.println();
        }
    }
}

public class Assignment_2_Pet_Management_System {
    public static void main(String[] args) {
        // Create instances of pets and add them to this main class
        PetShop petShop = new PetShop();
        petShop.addPet(new Dog("Buddy", 3, "Golden", 500.0, DogBreeds.GOLDEN_RETRIEVER));
        petShop.addPet(new Cat("Whiskers", 2, "Gray", 300.0, CatBreeds.PERSIAN));
        petShop.addPet(new Dog("Max", 4, "Brown", 600.0, DogBreeds.LABRADOR));
        petShop.addPet(new Cat("Fluffy", 1, "White", 350.0, CatBreeds.SIAMESE));
        petShop.addPet(new Dog("Daisy", 2, "Black", 550.0, DogBreeds.GERMAN_SHEPHERD));
        petShop.addPet(new Cat("Leo", 3, "Spotted", 400.0, CatBreeds.BENGAL));

        // Display details of all pets in the pet shop
        petShop.displayAllPets();
    }
}
