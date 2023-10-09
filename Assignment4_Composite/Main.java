package Assignment4_Composite;
public class Main {
    public static void main(String[] args) {
        // Create rooms and walls
        StructureComponent room1 = new Room("Master Bedroom");
        StructureComponent room2 = new Room("Living Room");
        StructureComponent wall1 = new Airconditioner("Central AC");
        StructureComponent wall2 = new Airconditioner("Window AC");

        // Create a floor and add rooms and walls
        StructureComponent floor1 = new Floor("First Floor");
        ((Floor) floor1).addComponent(room1);
        ((Floor) floor1).addComponent(room2);
        ((Floor) floor1).addComponent(wall1);
        ((Floor) floor1).addComponent(wall2);

        // Create a building and add floors
        StructureComponent building = new Building("My House");
        ((Building) building).addComponent(floor1);

        // Display the building structure
        building.display();
    }
}
