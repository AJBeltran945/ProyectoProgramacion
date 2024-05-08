public class Map {
    private String name;

    public Map(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        // Implement map display logic here
    }

    @Override
    public String toString() {
        return "Map{name='" + name + "'}";
    }
}
