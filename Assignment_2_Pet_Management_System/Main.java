public class Main {
    public static void main(String[] args) {
        // Create a pet shop
        PetShop petShop = new PetShop();

        // Add pets to the pet shop
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