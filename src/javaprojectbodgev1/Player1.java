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
    } //constructor.
    
    public Roshambo generateRoshambo(){
        Scanner scanner = new Scanner( System.in );
        System.out.println("Please select your move"); //specifications required that i implement it in this class, might as well give it a purpose
        String PlayerSelect = scanner.nextLine();
        switch (PlayerSelect){
            case "R":
                Roshambo = Roshambo.ROCK;
                break;
            case "P":
                Roshambo = Roshambo.PAPER;
                break;
            case "S":
                Roshambo = Roshambo.SCISSORS;
                break;
            case "QUIT":
                System.exit(0);
    }
        return Roshambo; 
}
}
