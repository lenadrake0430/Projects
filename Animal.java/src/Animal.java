public class Animal {
    // Private data field
    private String species;

    // Default Constructor
    public Animal() {
        this.species = "";
    }

    // Custom Constructor for species
    public Animal(String newSpecies) {
        this.species = newSpecies;
    }

    // Method to update the species
    public void setSpecies(String newSpecies) {
        this.species = newSpecies;
    }

    // Method to retrieve the species
    public String getSpecies() {
        return this.species;
    }

    // Returns a user-friendly string of the object state
    @Override
    public String toString() {
        return "Species: " + this.species;
    }
}
