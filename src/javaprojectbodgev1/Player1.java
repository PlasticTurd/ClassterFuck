/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprojectbodgev1;
import java.io.InputStream;
import java.util.Scanner;
/**
 *
 * @author J
 */
public class Player1 extends Player{

    public Player1(String name) {
        super(name);
    }
    
    public Roshambo generateRoshambo(){
        Scanner scanner = new Scanner( System.in );
        
        Boolean ValidInputMoveSelect = false;
        do {
        System.out.println("Please select your move. for the time being, the only accepted inputs are R, P, and S, for Rock, Paper, and Scissors respectively. this will be changed but there are more fundamental issues to be fixed that are of a higher priority."); //specifications required that i implement it in this class, might as well give it a purpose
        String PlayerSelect = scanner.nextLine();
        switch (PlayerSelect){
            case "R":
                Roshambo = Roshambo.ROCK;
                ValidInputMoveSelect = true;
                break;
            case "P":
                Roshambo = Roshambo.PAPER;
                ValidInputMoveSelect = true;
                break;
            case "S":
                Roshambo = Roshambo.SCISSORS;
                ValidInputMoveSelect = true;
                break;
            case "QUIT":
                System.exit(0);
            default:
                System.out.println("invalid input, please try again");
                ValidInputMoveSelect = false;
    }
        } while (ValidInputMoveSelect == false);
        return Roshambo; 
}
}
