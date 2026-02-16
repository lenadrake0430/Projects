public class Pet {
    // Private data field
    private String name;

    // Default Constructor
    public Pet() {
        // Initializing name as "Pet Name" for the default state
        this.name = "Pet Name";
    }

    // Accessor (Getter)
    public String getName() {
        return name;
    }

    // Mutator (Setter)
    public void setName(String newName) {
        this.name = newName;
    }

    // toString method to return object state
    public String toString() {
        String state = "Pet information:\n";
        state += "Name: " + name;
        return state;
    }

    // Main method for testing
    public static void main(String[] args) {
        //first Pet object using default constructor
        Pet p1 = new Pet();
        System.out.println(p1.toString());

        //second Pet object and use set method
        Pet p2 = new Pet();
        p2.setName("Buster");
        System.out.println(p2.toString());
    }
}





