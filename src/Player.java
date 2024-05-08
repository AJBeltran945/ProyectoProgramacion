public class Player implements Playable {
    private String name;
    private int health;
    private int armor;
    private Operator currentOperator;

    public Player(String name, int health, int armor) {
        this.name = name;
        this.health = health;
        this.armor = armor;
    }

    public Player(String name) {
        this(name, 100, 50); // Default health and armor values
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public Operator getCurrentOperator() {
        return currentOperator;
    }

    public void setCurrentOperator(Operator currentOperator) {
        this.currentOperator = currentOperator;
    }

    public void selectOperator(Operator operator) {
        this.currentOperator = operator;
    }

    @Override
    public void performAction() {
        System.out.println(name + " performs an action as a player.");
    }

    @Override
    public String toString() {
        return "Player{name='" + name + "', health=" + health + ", armor=" + armor + ", currentOperator=" + currentOperator + "}";
    }
}
