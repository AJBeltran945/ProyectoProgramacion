public class Player {
    private String name;
    private int health;
    private int armor;
    private Operator currentOperator;

    // Constructors (Overloaded)
    public Player(String name, int health, int armor) {
        this.name = name;
        this.health = health;
        this.armor = armor;
    }

    public Player(String name) {
        this(name, 100, 50); // Default health and armor values
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

    // Method to select an operator
    public void selectOperator(Operator operator) {
        this.currentOperator = operator;
    }

    // Method to perform some action (e.g., shoot)
    public void performAction() {
        // Implement action logic here
    }

    // Method to display player information
    @Override
    public String toString() {
        return "Player{name='" + name + "', health=" + health + ", armor=" + armor + ", currentOperator=" + currentOperator + "}";
    }
}