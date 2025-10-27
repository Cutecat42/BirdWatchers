
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cat
 */
public class BirdDatabase {
    private ArrayList<Bird> birds;
    
    public BirdDatabase() {
        this.birds = new ArrayList<>();
    }
    
    public void addBird(Bird bird) {
        birds.add(bird);
    }
    
    public ArrayList<Bird> all() {
        
        return this.birds;
    }
    
    public void addObservation(Bird bird) {
        bird.addObservation();
    }
    
    @Override
    public String toString() {
        return birds.toString();
    }
}
