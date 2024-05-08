public class Operator implements Playable {
    private String name;
    private String specialAbility;

    public Operator(String name, String specialAbility) {
        this.name = name;
        this.specialAbility = specialAbility;
    }

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

    public void useSpecialAbility() {
        System.out.println(name + " uses ability");
    }

    @Override
    public void performAction() {
        System.out.println(name + " uses an ability");
    }

    @Override
    public String toString() {
        return "Operator{name='" + name + "', specialAbility='" + specialAbility + "'}";
    }
}
