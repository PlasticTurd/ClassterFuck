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
public class Bart extends Player{

    public Bart(String name, Roshambo Roshambo) {
        super(name, Roshambo);
    }

public Roshambo generateRoshambo(){
    return Roshambo.A; 
}

}
