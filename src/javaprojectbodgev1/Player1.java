/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprojectbodgev1;

/**
 *
 * @author J
 */
public class Player1 extends Player{

    public Player1(String name) {
        super(name);
    }
    
    public Roshambo generateRoshambo(){
        System.out.println("Please select your move");
        String PlayerSelect = "test";
        switch (PlayerSelect){
            case "test":
                Roshambo = Roshambo.SCISSORS;
                break;
            default:
                System.out.println("how did this even happen? this is a locked debug statement.");
                break;
    }
        return Roshambo; 
}
}
