import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        PrintRoadChoices pathChoice = new PrintRoadChoices();

        System.out.println("Welcome to this simple game of Labyrinth!");
        System.out.println("Press 1 to start the game: ");
        System.out.println("Press 2 to exit: ");

        Scanner usersMenuChoice = new Scanner(System.in);
        Scanner one = new Scanner(System.in);

        int menuChoice = usersMenuChoice.nextInt();

        if (menuChoice == 1) {
            System.out.println("Let´s play!");

        }

        else if (menuChoice == 2) {
            System.out.println("We hope you have the courage to face the Labyrinth next time");
            System.exit(0);
        }

        //First choice of path

        System.out.println("Choice of path 1: ");
        PrintRoadChoices.printStraight();
        PrintRoadChoices.printRight();
        PrintRoadChoices.printLeft();

       int menuChoice2 = usersMenuChoice.nextInt();

        if (menuChoice2 == 1) {
            System.out.println("You encounter a dragon! The dragon ate you. We hope it enjoyed its lunch. " +
                               "Rest in peace.");
            System.exit(0);
        }

        if (menuChoice2 == 2) {
            System.out.println("You face a sword and shield wielding skeleton. The skeleton chopped of your head. " +
                               "Rest in peace. ");
            System.exit(0);
        }

        if (menuChoice2 == 3) {
            System.out.println("You found a safe path. Press 1 to continue!");
            one.nextInt();
        }

        // Second path of choice

        System.out.println("Choice of path 2: ");
        PrintRoadChoices.printStraight();
        PrintRoadChoices.printRight();
        PrintRoadChoices.printLeft();

        int menuChoice3 = usersMenuChoice.nextInt();

        if (menuChoice3 == 1) {
            System.out.println("You found a safe path. Press 1 to continue!");
            one.nextInt();
        }

        if (menuChoice3 == 2) {
            System.out.println("You encounter a bandit. The bandit robbed you. Without supplies you cant continue.");
            System.exit(0);
        }

        if (menuChoice3 == 3) {
            System.out.println("You fell into a dark hole. Rest in peace.");
            System.exit(0);
        }

        // Third path of choice

        System.out.println("Choice of path 3: ");
        PrintRoadChoices.printStraight();
        PrintRoadChoices.printRight();
        PrintRoadChoices.printLeft();

        int menuChoice4 = usersMenuChoice.nextInt();

        if (menuChoice4 == 1) {
            System.out.println("You encounter a vampire. The vampire drained you from all your blood. Rest in peace.");
            System.exit(0);
        }

        if (menuChoice4 == 2) {
            System.out.println("You encounter a demon. The demon possessed you. Rest in peace. ");
            System.exit(0);
        }

        if (menuChoice4 == 3) {
            System.out.println("You found a safe path. Press 1 to continue!");
            one.nextInt();

        }

        //Fourth path of choice

        System.out.println("Choice of path 4");
        PrintRoadChoices.printStraight();
        PrintRoadChoices.printRight();
        PrintRoadChoices.printLeft();

        int menuChoice5 = usersMenuChoice.nextInt();

        if (menuChoice5 == 1) {
            System.out.println("You found a safe path. Press 1 to continue!");
            one.nextInt();
        }

        if (menuChoice5 == 2) {
            System.out.println("You face an evil wizard. The wizard transformed you into a toad. We hope you will " +
                    "enjoy life in your new form!");
            System.exit(0);
        }

        if (menuChoice5 == 3) {
            System.out.println("You encounter a fairy. The fairy thinks this place is to dangerous for you and " +
                    "teleports you back to the beginning.");
            System.exit(0);
        }

        //Fifth path of choice

        System.out.println("Choice of path 5: ");
        PrintRoadChoices.printStraight();
        PrintRoadChoices.printRight();
        PrintRoadChoices.printLeft();

        int menuChoice6 = usersMenuChoice.nextInt();

        if (menuChoice6 == 1) {
            System.out.println("You face a knight wearing dark armour. The knight chopped of your legs. We hope " +
                    "your death comes quickly!");
            System.exit(0);
        }

        if (menuChoice6 == 2) {
            System.out.println("You found a safe path. Press 1 to continue!");
            one.nextInt();
        }

        if (menuChoice6 == 3) {
            System.out.println("You encounter a werewolf. The werewolf bit you and turned you into one of them. " +
                    "You are having a very bad day.");
            System.exit(0);
        }

        // Sixth path of choice

        System.out.println("Choice of path 6: ");
        PrintRoadChoices.printStraight();
        PrintRoadChoices.printRight();
        PrintRoadChoices.printLeft();

        int menuChoice7 = usersMenuChoice.nextInt();

        if (menuChoice7 == 1) {
            System.out.println("You found a safe path. Press 1 to continue!");
            one.nextInt();
        }

        if (menuChoice7 == 2) {
            System.out.println("You encounter a cave-troll. The troll bashes your skull in. Rest in peace.");
            System.exit(0);
        }

        if (menuChoice7 == 3) {
            System.out.println("You face a witch. The witch casts a spell on you and uses you as an ingredient in her" +
                    " potion. Rest in peace.");
        }

        // Seventh path of choice

        System.out.println("Choice of path 7: ");
        PrintRoadChoices.printStraight();
        PrintRoadChoices.printRight();
        PrintRoadChoices.printLeft();

        int menuChoice8 = usersMenuChoice.nextInt();

        if (menuChoice8 == 1) {
            System.out.println("You ran straight into the wall. How stupid can you be. Start over and try again.");
            System.exit(0);
        }

        if (menuChoice8 == 2) {
            System.out.println("You encounter Gollum. He thinks you have the ring and kills you. Rest in peace.");
            System.exit(0);
        }

        if (menuChoice8 == 3) {
            System.out.println("You found a safe path. Press 1 to continue!");
            one.nextInt();
        }

        //Eighth path of choice

        System.out.println("Choice of path 8: ");
        PrintRoadChoices.printStraight();
        PrintRoadChoices.printRight();
        PrintRoadChoices.printLeft();

        int menuChoice9 = usersMenuChoice.nextInt();

        if (menuChoice9 == 1) {
            System.out.println("You found a safe path. Press 1 to continue!");
            one.nextInt();
        }

        if (menuChoice9 == 2) {
            System.out.println("You face Voldemort. AVADA KEDVARA! Rest in peace.");
            System.exit(0);
        }

        if (menuChoice9 == 3) {
            System.out.println("You encounter a centaur. The centaur pierces you with his spear. Rest in peace.");
            System.exit(0);
        }

        //Ninth path of choice

        System.out.println("Choice of path 9: ");
        PrintRoadChoices.printStraight();
        PrintRoadChoices.printRight();
        PrintRoadChoices.printLeft();

        int menuChoice10 = usersMenuChoice.nextInt();

        if (menuChoice10 == 1) {
            System.out.println("You encounter a zombie. The zombie ate your brain. Rest in peace.");
            System.exit(0);
        }

        if (menuChoice10 == 2) {
            System.out.println("You found a safe path. Press 1 to continue!");
            one.nextInt();
        }

        if (menuChoice10 == 3) {
            System.out.println("You encounter LenaSenap! LenaSnap is angry because you used the wrong Java-syntax and" +
                    " crushes your skull with her MacBook. Rest in peace.");
            System.exit(0);
        }

        //Tenth path of choice

        System.out.println("Choice of path 10: ");
        PrintRoadChoices.printStraight();
        PrintRoadChoices.printRight();
        PrintRoadChoices.printLeft();

        int menuChoice11 = usersMenuChoice.nextInt();

        if (menuChoice11 == 1) {
            System.out.println("You encounter a unicorn. The unicorn spears you with his horn. Rest in peace.");
            System.exit(0);
        }

        if (menuChoice11 == 2) {
            System.out.println("Congratulation! You made your way out of the Labyrinth!");
        }

        if (menuChoice11 == 3) {
            System.out.println("You stumbled over your own feet. Talk about tripping on the finish line.");
            System.exit(0);
        }











    }
}
