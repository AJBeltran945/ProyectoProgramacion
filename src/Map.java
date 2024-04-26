public class Map {
    private String name;

    // Constructors
    public Map(String name) {
        this.name = name;
    }

    // Getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Method to display the map
    public void display() {
        // Implement map display logic here
    }

    // Method to override toString for map information
    @Override
    public String toString() {
        return "Map{name='" + name + "'}";
    }
}