public class Player {
    private String name;
    private int health;
    private int armor;
    private Operator currentOperator;
    private Map currentMap;

    // Constructors
    public Player(String name, int health, int armor) {
        this.setName(name);
        this.setHealth(health);
        this.setArmor(armor);
    }
    public Player(String name, int health) {
        this.setName(name);
        this.setHealth(health);
    }
    public Player(String name) {
        this.setName(name);
    }
    public Player() {
    }

    // Getters and setters
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

    public void setCurrentOMap(Map currentMap) {
        this.currentMap = currentMap;
    }

    // Method to select aa map
    public void selectMap(Map map) {
        this.currentMap = map;
    }

    // Method to select an operator
    public void selectOperator(Operator operator) {
        this.currentOperator = operator;
    }

    // ToString method
    @Override
    public String toString() {
        return "Player{name='" + name + "', health=" + health + ", armor=" + armor + ", currentOperator=" + currentOperator + "}";
    }
}
