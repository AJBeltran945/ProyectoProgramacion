// Map class
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

    // ToString method
    @Override
    public String toString() {
        return "Map{name='" + name + "'}";
    }
}
