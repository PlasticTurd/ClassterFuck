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
        
        Boolean ValidInput = false;
        
        System.out.println("Welcome to the game that has nothing to do with Roshambo!");
        System.out.println("Please state your name!");
        String PlayerName =  scanner.nextLine(); //gets player input
        Player Player1 =  new Player1(PlayerName); /*sets the "name" value of the palyer1 class
        to the string input by the user
        */
        
        do {
        ValidInput = false;
        System.out.println("Greetings, " + Player1.name + ". Please selectt your opponent. ('BART' or 'LISA') ");
        String AIName = scanner.nextLine();
        switch (AIName) {
            case "BART":
                
                System.out.println("BART selected, ValidInput True");
                player2 = new Bart();
                ValidInput = true;
                break;
            
            case "LISA":
                System.out.println("LISA selected, ValidInput True");
                player2 = new Lisa();
                ValidInput = true;
                break;
                
            default:
                player2.name = "ERROR";
                System.out.println("NEITHER selected, ValidInput False");
                ValidInput = false;
        }
        } while (ValidInput == false);
        while (true){
//        System.out.println(Player1.name + " VS. " + player2.name);
//        System.out.println("PLAYER1 VALUE " + Player1.generateRoshambo()); //debugging Player1 class's implimentation
//        System.out.println("PLAYER2 VALUE " + player2.generateRoshambo()); //debugging Player2 class's implimentation
//        System.out.println("PLAYER1 STRING " + Player1.Roshambo.val());
//        System.out.println("PLAYER2 STRING " + player2.Roshambo.val());
          Player1.generateRoshambo();
          player2.generateRoshambo();
          //each enum constant assigned a number
          //rock = 1, paper = 2, scissors = 3;
          //player1.number - player2.number
          //0 = tie
          //1 = win
          //2 = loss
          //disregard positive vs negative
    }
    }
}


