public class Asault_Rifles extends Weapon {
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
        System.out.println("takes out "+name);
    }

    // Constructors
    public Asault_Rifles(String name, int damage) {
        this.setName(name);
        this.setDamage(damage);
    }
    public Asault_Rifles(String name) {
        this.setName(name);
    }
    public Asault_Rifles() {
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
