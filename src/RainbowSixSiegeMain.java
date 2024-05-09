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
        // sleep
        try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}


        // Ask player for his name
        System.out.print("Please input your name: ");
        String name = scanner.nextLine();
        player1.setName(name);
        System.out.println("------------------------------------------");

        // sleep
        try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}

        // Display menu for choosing a map
        System.out.println("Choosing random map from:");
        // sleep
        try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
        System.out.println("Oregon");
        // sleep
        try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
        System.out.println("Skyscraper");
        // sleep
        try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
        System.out.println("Loading....");
        // sleep
        try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}

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

        // sleep
        try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}

        // Display menu for choosing an operator
        System.out.println("Choose your operator:");
        // sleep
        try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
        System.out.println("1. Lion");
        // sleep
        try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
        System.out.println("2. Nomad");
        // sleep
        try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
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

        // sleep
        try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}

        // Display selected operator
        System.out.println("You have chosen: " + selectedOperator.getName());
        System.out.println("------------------------------------------");

        // sleep
        try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}

        // Ask player if they want to use the operator's ability
        System.out.print("Do you want to use the operator's ability? (yes/no): ");
        String choice1 = scanner.next();

        if (choice1.equalsIgnoreCase("yes")) {
            // sleep
            try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
            selectedOperator.useSpecialAbility();
            // sleep
            try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
            System.out.println("You have killed the enemy...");
            // sleep
            try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
            System.out.println("YOU WON");
            // sleep
            try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
        } else {
            // sleep
            try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
            System.out.println("Operator's ability not used.");
            // sleep
            try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
            // Perform actions
            Playable[] entities = {weapon1,weapon3,weapon2,weapon4};
            for (int i = 0; i < entities.length; i++) {
                if (operatorChoice == 1){
                    Random random = new Random();
                    int randomNumber = random.nextInt(2);
                    entities[randomNumber].performAction();
                    // sleep
                    try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
                    // Ask player if he wants to shoot
                    System.out.print("Do you want to use your weapon? (yes/no): ");
                    String choice2 = scanner.next();

                    if (choice2.equalsIgnoreCase("yes")) {
                        if (randomNumber == 0){
                            // sleep
                            try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
                            weapon1.shoot();
                            // sleep
                            try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
                            weapon1.reload();
                            // sleep
                            try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
                            weapon1.shoot();
                            // sleep
                            try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
                            System.out.print("..headshot..");
                            // sleep
                            try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
                            System.out.print("You WIN");
                        }else{
                            // sleep
                            try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
                            weapon3.shoot();
                            // sleep
                            try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
                            weapon3.reload();
                            // sleep
                            try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
                            weapon3.shoot();
                            // sleep
                            try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
                            System.out.print("..headshot..");
                            // sleep
                            try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
                            System.out.print("You WIN");
                        }
                    }else{
                        // sleep
                        try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
                        System.out.println("...You got headshoted...");
                        // sleep
                        try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
                        System.out.println("YOU LOSE...");
                        // sleep
                        try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
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
                            // sleep
                            try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
                            weapon2.shoot();
                            // sleep
                            try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
                            weapon2.reload();
                            // sleep
                            try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
                            weapon2.shoot();
                            // sleep
                            try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
                            System.out.print("..headshot..");
                            // sleep
                            try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
                            System.out.print("You WIN");
                        }else{
                            // sleep
                            try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
                            weapon4.shoot();
                            // sleep
                            try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
                            weapon4.reload();
                            // sleep
                            try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
                            weapon4.shoot();
                            // sleep
                            try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
                            System.out.print("..headshot..");
                            // sleep
                            try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
                            System.out.print("You WIN");
                        }
                    }else{
                        // sleep
                        try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
                        System.out.println("...You got headshoted...");
                        // sleep
                        try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
                        System.out.println("YOU LOSE...");
                        // sleep
                        try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
                    }
                    break;
                }
            }
        }

        System.out.println("------------------------------------------");
        // Dynamic polymorphism
        Player[] players = {player1};
        for (Player player : players) {
            System.out.println("Game Information: " + player);
        }
    }
}
