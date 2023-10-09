import java.util.ArrayList;
import java.util.List;

// PetShop class to manage pets in the shop
public class PetShop {
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
