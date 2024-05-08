public class Weapon {
    private String name;
    private int damage;

    // Constructors
    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    // Getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }

    // Method to shoot the weapon
    public void shoot() {
        System.out.println(name + " uses an ability");
    }

    // Method to display weapon information
    @Override
    public String toString() {
        return "Weapon{name='" + name + "', damage=" + damage + "}";
    }
}