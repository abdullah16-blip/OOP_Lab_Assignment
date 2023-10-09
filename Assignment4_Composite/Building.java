package Assignment4_Composite;
import java.util.ArrayList;
import java.util.List;

public class Building implements StructureComponent {
    private String name;
    private List<StructureComponent> components = new ArrayList<>();

    public Building(String name) {
        this.name = name;
    }

    public void addComponent(StructureComponent component) {
        components.add(component);
    }

    public void display() {
        System.out.println("Building: " + name);
        System.out.println("Contains floors:");

        for (StructureComponent component : components) {
            component.display();
        }
    }
}
