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
public abstract class Player {
    public enum Roshambo {
        ROCK("rock"), 
        PAPER("paper"), 
        SCISSORS("scissors");
        
        private String val;
        Roshambo(String val) {
            this.val = val;
        }
        
        public String val() {
            return val;
        }
    };
    
    public String name;
    public Roshambo Roshambo;
    public abstract Roshambo generateRoshambo();
    public Player(String name) {
        this.name = name;
        this.Roshambo = Roshambo.PAPER; //sets a default value for Roshambo because otherwise java throws a hissyfit
    }
}
