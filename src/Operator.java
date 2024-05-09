public class Operator {
    private String name;
    private String specialAbility;

    // Constructors
    public Operator(String name, String specialAbility) {
        this.setName(name);
        this.setSpecialAbility(specialAbility);
    }
    public Operator(String name) {
        this.setName(name);
    }
    public Operator() {
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
        System.out.println(name + " uses ability: "+ getSpecialAbility());
    }

    // ToString method
    @Override
    public String toString() {
        return "Operator{name='" + name + "', specialAbility='" + specialAbility + "'}";
    }
}
