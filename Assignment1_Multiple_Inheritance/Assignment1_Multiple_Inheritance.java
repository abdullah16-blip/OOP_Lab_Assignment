// Define the first interface
interface Swimming {
    void swim();
}

// Define the second interface
interface Flying {
    void fly();
}

// Create a class that implements both interfaces
class Duck implements Swimming, Flying {
    @Override
    public void swim() {
        System.out.println("Duck is swimming.");
    }

    @Override
    public void fly() {
        System.out.println("Duck is flying.");
    }
}

public class Assignment1_Multiple_Inheritance {
    public static void main(String[] args) {
        // Create an instance of the Duck class
        Duck myDuck = new Duck();

        // Call methods from both interfaces
        myDuck.swim();
        myDuck.fly();
    }
}
