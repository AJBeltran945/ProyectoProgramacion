public class Pistols extends Weapon{
    private String name;
    private int damage;

    @Override
    void shoot() {
        System.out.println("shoots with "+name);
    }

    @Override
    void reload() {
        System.out.println("reloading...");
    }

    @Override
    public void performAction() {
        System.out.println("Takes out "+name);
    }

    // Constructors
    public Pistols(String name, int damage) {
        this.setName(name);
        this.setDamage(damage);
    }
    public Pistols(String name) {
        this.setName(name);
    }
    public Pistols() {
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
}
