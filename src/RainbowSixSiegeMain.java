import java.util.Scanner;

public class RainbowSixSiegeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create players
        Player player1 = new Player("Austin", 100, 50);
        Player player2 = new Player("Bruna");

        // Create operators
        Operator operator1 = new Operator("Lion", "EE-ONE-D");
        Operator operator2 = new Operator("Nomad", "AirJab");

        // Display menu for choosing an operator
        System.out.println("Welcome to Rainbow Six Siege Lite!");
        System.out.println("Choose your operator:");
        System.out.println("1. Lion");
        System.out.println("2. Nomad");
        System.out.print("Enter the number of the operator you want to choose: ");

        // Read player's choice
        int operatorChoice = scanner.nextInt();

        // Create selected operator based on player's choice
        Operator selectedOperator = null;
        switch (operatorChoice) {
            case 1:
                selectedOperator = operator1;
                break;
            case 2:
                selectedOperator = operator2;
                break;
            default:
                System.out.println("Invalid choice. Default operator selected.");
                selectedOperator = new Operator("Recruit", "None");
        }

        // Assign selected operator to players
        player1.selectOperator(selectedOperator);
        player2.selectOperator(selectedOperator);

        // Display selected operator
        System.out.println("You have chosen: " + selectedOperator.getName());

        // Continue with the rest of your code...
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
        Playable[] entities = {player1, player2, operator1, operator2};
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
