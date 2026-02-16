public class Pet {
    private int age;
    private String name;
    private String type;

    public Pet() {
        this.name = "Pet Name";
        this.type = "Animal";
        this.age = 1;
    }

    public Pet(String newName, String newType, int newAge) {
        setName(newName);
        setType(newType);
        setAge(newAge);
    }

    public int getAge() { return age; }
    public String getName() { return name; }
    public String getType() { return type; }

    public void setAge(int newAge) { this.age = newAge; }
    public void setName(String newName) { this.name = newName; }
    public void setType(String newType) { this.type = newType; }

    public String speak() {
        if (type.equalsIgnoreCase("dog")) {
            return "Woof";
        } else if (type.equalsIgnoreCase("cat")) {
            return "Meow";
        } else {
            return "Yowl";
        }
    }

    public String toString() {
        String state = "Pet information:\n";
        state += "Type: " + type + "\n";
        state += "Name: " + name + "\n";
        state += "Sound: " + speak() + "\n";
        state += "Age:  " + age;
        return state;
    }
}