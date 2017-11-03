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
        
        Boolean ValidInput = false;
        
        System.out.println("Welcome to the game that has nothing to do with Roshambo! you can exit the application at any time by typing 'QUIT' ");
        System.out.println("Please state your name!");
        String PlayerName =  scanner.nextLine(); //gets player input
        if (PlayerName == "QUIT") {
            System.exit(0);
        }
        Player Player1 =  new Player1(PlayerName); /*sets the "name" value of the palyer1 class
        to the string input by the user
        */
        
        do {
        ValidInput = false;
        System.out.println("Greetings, " + Player1.name + ". Please selectt your opponent. ('BART' or 'LISA') ");
        String AIName = scanner.nextLine();
        
        switch (AIName.toUpperCase()) {
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
            case "QUIT":
                System.exit(0);
            default:
                player2.name = "ERROR";
                System.out.println("NEITHER selected, ValidInput False");
                ValidInput = false;
        }
        } while (ValidInput == false);
        while (true){
          String _player1Move = ("" + Player1.generateRoshambo());
          String _player2Move = ("" + player2.generateRoshambo());
          int _total = (Player1.Roshambo.val() - player2.Roshambo.val());
          String _resultWinner = ("");
          String _resultLoser = ("");
          String _resultSummary = ("");
          switch (_total) {
              case -2:
                  _resultWinner = (Player1.name);
                  _resultLoser = (player2.name);
                  break;
              case -1:
                  _resultWinner = (player2.name);
                  _resultLoser = (Player1.name);
                  break;
              case 0:
                  _resultWinner = ("Draw! No one");
                  _resultLoser = ("anyone.");
                  break;
              case 1:
                  _resultWinner = (Player1.name);
                  _resultLoser = (player2.name);
                  break;
              case 2:
                  _resultWinner = (player2.name);
                  _resultLoser = (Player1.name);
                  break;
              default:
                  System.out.println("Unknown error determining winner, result out of logical bounds");
              
          }
          _resultSummary = (_resultWinner + " won against " + _resultLoser + ". SUMMARY: " + Player1.name + ": " + _player1Move + " | " + player2.name + ": " + _player2Move);
          System.out.println(_resultSummary);
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


