
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        BirdDatabase database = new BirdDatabase();

        while (true) {
            System.out.println("Command?");
            String command = scan.nextLine();

            if (command.equals("Quit")) {
                break;
            }

            if (command.equals("Add")) {
                addBirdToDatabase(database, newBird(scan));
            }

            if (command.equals("Observation")) {
                addObservation(scan, database);
            }

            if (command.equals("All")) {
                getAll(database);
            }

            if (command.equals("One")) {
                getOne(database);
            }

        }

    }

    public static Bird newBird(Scanner scan) {
        System.out.println("Name:");
        String name = scan.nextLine();
        System.out.println("Name in Latin:");
        String latinName = scan.nextLine();

        Bird bird = new Bird(name, latinName);

        return bird;
    }

    public static void addBirdToDatabase(BirdDatabase database, Bird bird) {
        database.addBird(bird);
    }

    public static void addObservation(Scanner scanner, BirdDatabase database) {
        System.out.println("Bird?");
        String searchFor = scanner.nextLine();

        ArrayList<Bird> birds = new ArrayList<>(database.all());

        for (Bird bird : birds) {
            if (bird.getName().contains(searchFor)) {
                database.addObservation(bird);
            } else {
                System.out.println("Not a bird!");
            }
        }
    }

    public static void printBird(Bird bird) {
        System.out.println(bird.getName() + " (" + bird.getLatinname() + "): " + bird.getObservationCount() + " observations");
    }

    public static void getAll(BirdDatabase database) {
        for (Bird bird : database.all()) {
            printBird(bird);
        }
    }

    public static void getOne(BirdDatabase database) {
        if (!database.all().isEmpty()) {
            printBird(database.all().get(0));
        }
    }

}
