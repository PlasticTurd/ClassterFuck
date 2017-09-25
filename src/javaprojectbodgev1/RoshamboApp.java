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
        Player player2 = new Bart();
        
        Scanner scanner = new Scanner( System.in );
        System.out.println("Welcome to the game that has nothing to do with Roshambo!");
        System.out.println("Please state your name!");
        String PlayerName =  scanner.nextLine();
        Player Player1 =  new Player1(PlayerName);
        System.out.println("Greetings, " + Player1.name + ". Please selectt your opponent. ('BART' or 'LISA') ");
        String AIName = scanner.nextLine();
        switch (AIName) {
            case "BART":
                break;
            case "LISA":
                player2 = new Lisa(); //how to redefine
                break;
            default:
                System.out.println("ERROR: invalid input exception. press any key to terminate");
                scanner.next();       
        }
        System.out.println(Player1.name + " VS. " + player2.name);
        System.out.println(Player1.generateRoshambo());
        //add code to allow player to choose their move here
        System.out.println(player2.generateRoshambo());
        scanner.next();
    }
}


