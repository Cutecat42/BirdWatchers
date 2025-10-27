
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

}
