// Define a Pet class (base class)
public class Pet {
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
