import java.util.Scanner;
import java.util.Random;

public class RainbowSixSiegeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create default stats
        Player player1 = new Player(null,100, 50);

        // Create operators
        Operator operator1 = new Operator("Lion", "EE-ONE-D");
        Operator operator2 = new Operator("Nomad", "AirJab");

        // Create weapons
        Asault_Rifles weapon1 = new Asault_Rifles("V308", 50);
        Asault_Rifles weapon2 = new Asault_Rifles("AK-74M", 40);
        Pistols weapon3 = new Pistols("P9", 45);
        Pistols weapon4 = new Pistols("PRB92", 42);

        // Create map
        Map map1 = new Map("Oregon");
        Map map2 = new Map("Skyscraper");

        // Display Intro
        System.out.println("----Welcome to Rainbow Six Siege Lite!----");
        sleep1000();


        // Ask player for his name
        System.out.print("Please input your name: ");
        String name = scanner.nextLine();
        player1.setName(name);
        System.out.println("------------------------------------------");

        sleep1000();

        // Display menu for choosing gamemode
        System.out.println("Chose Gamewmode to play: ");
        sleep500();
        System.out.println("1. BOMB");
        sleep500();
        System.out.println("2. HOSTAGE");
        sleep500();
        System.out.println("3. SECURE_AREA");
        sleep500();
        System.out.print("Enter the number of the gamemode you want to play: ");
        sleep2000();

        // Get the players choice
        int gmChoice = scanner.nextInt();

        // Create selected gm based on player's choice
        GameMode selectedGM = switch (gmChoice) {
            case 1 -> selectedGM = GameMode.BOMB;
            case 2 -> selectedGM = GameMode.HOSTAGE;
            case 3 -> selectedGM = GameMode.SECURE_AREA;
            default -> null;
        };
        // Display selected gm
        System.out.println("Selected Gamemode: "+ selectedGM);
        System.out.println("------------------------------------------");

        sleep1000();

        // Display menu for choosing a map
        System.out.println("Choosing random map from:");
        sleep500();
        System.out.println("Oregon");
        sleep500();
        System.out.println("Skyscraper");
        sleep500();
        System.out.println("Loading....");
        sleep2000();

        // Get a random number between 1 and 2
        int defaultChoice = (int)Math.floor(Math.random() * (2 - 1 + 1) + 1);

        // Create selected map based on player's choice
        Map selectedMap = switch (defaultChoice) {
            case 1 -> map1;
            case 2 -> map2;
            default -> null;
        };

        // Assign selected operator to players
        player1.selectMap(selectedMap);

        // Display selected map
        System.out.println("Map Information: " + selectedMap.getName());
        System.out.println("------------------------------------------");

        sleep1000();

        // Display menu for choosing an operator
        System.out.println("Choose your operator:");
        sleep500();
        System.out.println("1. Lion");
        sleep500();
        System.out.println("2. Nomad");
        sleep500();
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

        sleep500();

        // Display selected operator
        System.out.println("You have chosen: " + selectedOperator.getName());
        System.out.println("------------------------------------------");

        sleep1000();

        // Ask player if they want to use the operator's ability
        System.out.print("Do you want to use the operator's ability? (yes/no): ");
        String choice1 = scanner.next();

        if (choice1.equalsIgnoreCase("yes")) {
            sleep1000();
            selectedOperator.useSpecialAbility();
            sleep1000();
            System.out.println("You have killed the enemy...");
            sleep2000();
            System.out.println("YOU WON");
            sleep1000();
        } else {
            sleep1000();
            System.out.println("Operator's ability not used.");
            sleep1000();
            // Perform actions
            Playable[] entities = {weapon1,weapon3,weapon2,weapon4};
            for (int i = 0; i < entities.length; i++) {
                if (operatorChoice == 1){
                    Random random = new Random();
                    int randomNumber = random.nextInt(2);
                    entities[randomNumber].performAction();
                    sleep1000();
                    // Ask player if he wants to shoot
                    System.out.print("Do you want to use your weapon? (yes/no): ");
                    String choice2 = scanner.next();

                    if (choice2.equalsIgnoreCase("yes")) {
                        if (randomNumber == 0){
                            sleep500();
                            weapon1.shoot();
                            sleep1000();
                            weapon1.reload();
                            sleep2000();
                            weapon1.shoot();
                            sleep1000();
                            System.out.println("..headshot..");
                            sleep1000();
                            System.out.println("You WIN");
                        }else{
                            sleep500();
                            weapon3.shoot();
                            sleep1000();
                            weapon3.reload();
                            // sleep
                            try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
                            weapon3.shoot();
                            sleep1000();
                            System.out.println("..headshot..");
                            sleep1000();
                            System.out.println("You WIN");
                        }
                    }else{
                        sleep1000();
                        System.out.println("...You got headshoted...");
                        player1.setHealth(0);
                        player1.setArmor(0);
                        sleep500();
                        System.out.println("YOU LOSE...");
                        sleep2000();
                    }
                    break;
                } else {
                    Random random = new Random();
                    int randomNumber = random.nextInt(2)+2;
                    entities[randomNumber].performAction();
                    // Ask player if he wants to shoot
                    System.out.print("Do you want to use your weapon? (yes/no): ");
                    String choice2 = scanner.next();

                    if (choice2.equalsIgnoreCase("yes")) {
                        if (randomNumber == 2){
                            sleep500();
                            weapon2.shoot();
                            sleep1000();
                            weapon2.reload();
                            sleep2000();
                            weapon2.shoot();
                            sleep1000();
                            System.out.println("..headshot..");
                            sleep1000();
                            System.out.println("You WIN");
                        }else{
                            sleep500();
                            weapon4.shoot();
                            sleep1000();
                            weapon4.reload();
                            sleep2000();
                            weapon4.shoot();
                            sleep1000();
                            System.out.println("..headshot..");
                            sleep1000();
                            System.out.println("You WIN");
                        }
                    }else{
                        sleep1000();
                        System.out.println("...You got headshoted...");
                        player1.setHealth(0);
                        player1.setArmor(0);
                        sleep500();
                        System.out.println("YOU LOSE...");
                        sleep2000();
                    }
                    break;
                }
            }
        }

        System.out.println("------------------------------------------");
        // Dynamic polymorphism
        Player[] players = {player1};
        for (Player player : players) {
            System.out.println("----Game Information----");
            System.out.println(player);
            System.out.println("GameMode{"+selectedGM+"}");
        }
    }

    public static void sleep500(){
        try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
    }
    public static void sleep1000(){
        try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
    }
    public static void sleep2000(){
        try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
    }
}
