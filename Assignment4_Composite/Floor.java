package Assignment4_Composite;
import java.util.ArrayList;
import java.util.List;

public class Floor implements StructureComponent {
    private String name;
    private List<StructureComponent> components = new ArrayList<>();

    public Floor(String name) {
        this.name = name;
    }

    public void addComponent(StructureComponent component) {
        components.add(component);
    }

    public void display() {
        System.out.println("Floor: " + name);
        System.out.println("Contains:");

        for (StructureComponent component : components) {
            component.display();
        }
    }
}
