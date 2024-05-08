public class Operator implements Playable{
    private String name;
    private String specialAbility;

    // Constructors
    public Operator(String name, String specialAbility) {
        this.name = name;
        this.specialAbility = specialAbility;
    }

    // Getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialAbility() {
        return specialAbility;
    }
    public void setSpecialAbility(String specialAbility) {
        this.specialAbility = specialAbility;
    }

    // Method to use the operator's special ability
    public void useSpecialAbility() {
        System.out.println(name + " uses ability");
    }

    @Override
    public void performAction() {
        // Implement operator action logic here
        System.out.println(name + " uses an ability");
    }

    // Method to display operator information
    @Override
    public String toString() {
        return "Operator{name='" + name + "', specialAbility='" + specialAbility + "'}";
    }
}