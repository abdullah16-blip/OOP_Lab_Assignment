package Assignment4_Composite;
public class Room implements StructureComponent {
    private String name;

    public Room(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Room: " + name);
    }
}
