public class RainbowSixSiegeMain {
    public static void main(String[] args) {
        // Create an array of Playable objects
        Playable[] entities = new Playable[2];
        entities[0] = new Player("Arthur", 100, 50);
        entities[1] = new Operator("Flores", "Special Ability1");

        // Create players
        Player player1 = new Player("Austin", 100, 50);
        Player player2 = new Player("Bruna");

        // Create operators
        Operator operator1 = new Operator("Lion", "EE-ONE-D");
        Operator operator2 = new Operator("Nomand", "AirJab");

        // Assign operators to players
        player1.selectOperator(operator1);
        player2.selectOperator(operator2);

        // Create weapons
        Weapon weapon1 = new Weapon("V308 ASSAULT RIFLE", 50);
        Weapon weapon2 = new Weapon("AK-74M ASSAULT RIFLE", 40);

        // Create map
        Map map = new Map("Oregon");

        // Display map information
        System.out.println("Map Information: " + map);

        // Player actions
        player1.performAction();
        player2.performAction();

        // Using operator's special ability
        operator1.useSpecialAbility();
        operator2.useSpecialAbility();

        // Perform actions for each entity
        for (Playable entity : entities) {
            entity.performAction();
        }

        // Dynamic polymorphism
        Player[] players = {player1, player2};
        for (Player player : players) {
            System.out.println("Player Information: " + player);
        }
    }
}
