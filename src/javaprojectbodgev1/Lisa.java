/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprojectbodgev1;
import java.util.Random;
/**
 *
 * @author J
 */
public class Lisa extends Player {

    public Lisa() {
        super("Lisa");
    }
    
    public Roshambo generateRoshambo(){
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(3);
        switch (randomInt) {
            case 0:
                Roshambo = Roshambo.ROCK;
                break;
            case 1:
                Roshambo = Roshambo.PAPER;
                break;
            case 2:
                Roshambo = Roshambo.SCISSORS;
                break;
        }
    return Roshambo;
    }
}
