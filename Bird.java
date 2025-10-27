
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cat
 */
public class Bird {
    private String name;
    private String latinName;
    private int observationCount;
    
    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observationCount = 0;
    }
    
    public void addObservation() {
        this.observationCount += 1;
    }
    
    public int getObservationCount() {
        return this.observationCount;
    }
}
