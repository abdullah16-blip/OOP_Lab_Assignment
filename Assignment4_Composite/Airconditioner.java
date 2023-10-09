package Assignment4_Composite;
public class Airconditioner implements StructureComponent {
    private String name;

    public Airconditioner(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Airconditioner: " + name);
    }
}