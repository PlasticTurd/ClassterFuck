/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprojectbodgev1;
import java.io.InputStream;
import java.util.Scanner;
import javaprojectbodgev1.Player;

/**
 *
 * @author J
 */
public class RoshamboApp {
    
    
    
    
    public static void main(String [] args)
    {
        Player player2 = new Bart(); //i don't know why this has to be here but it does
        
        Scanner scanner = new Scanner( System.in );
        System.out.println("Welcome to the game that has nothing to do with Roshambo!");
        System.out.println("Please state your name!");
        String PlayerName =  scanner.nextLine(); //gets player input
        Player Player1 =  new Player1(PlayerName); /*sets the "name" value of the palyer1 class
        to the string input by the user
        */
        System.out.println("Greetings, " + Player1.name + ". Please selectt your opponent. ('BART' or 'LISA') ");
        String AIName = scanner.nextLine();
        switch (AIName) {
            case "BART":
                break;
            case "LISA":
                player2 = new Lisa();
                break;
            default:
                System.out.println("ERROR: invalid input exception. press any key to terminate"); //placeholder to prevent crashing until this is given its own method with loops 'n shit
                scanner.next();       
        }
        System.out.println(Player1.name + " VS. " + player2.name);
        System.out.println("PLAYER1 VALUE " + Player1.generateRoshambo()); //debugging Player1 class's implimentation
        System.out.println("PLAYER2 VALUE " + player2.generateRoshambo()); //debugging Player2 class's implimentation
        System.out.println("PLAYER1 STRING " + Player1.Roshambo.val());
        System.out.println("PLAYER2 STRING " + player2.Roshambo.val());
        scanner.next(); //keeps the program running long enough to read output because i haven't implemented a loop yet
    }
}


