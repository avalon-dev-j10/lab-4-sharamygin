/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs.randomizers;

import java.time.LocalDate;
import java.util.Date;
import java.util.Random;
import ru.avalon.java.dev.j10.labs.Person;
import ru.avalon.java.dev.j10.labs.Persona;

/**
 *
 * @author sera
 */
public class RandomPersona {  
    
    String[] characters = new String[] {"Neo", "Trinity", "Morpheus", 
        "Agent Smith", "Spoon Boy", "Twin", "Sponge Bob", "Patrick", 
        "Squidward", "Mr. Crabs", "Sandy", "Plankton", "Gary", "Mrs. Puff", 
        "Larry the Lobster"};

    public Persona getPersona() {

    String randName = characters[new Random().nextInt(characters.length)]; 
    Date randDate = new Date(RandomDate.createRandomDate(60, 119));
    return new Persona (randName, randDate);

}
  
    public static void dispRandPersona(Person[] personas){
    for(int j=0; j<personas.length; j++){
    System.out.println(personas[j].getName() + ", Дата рождения: " + personas[j].getBirthDate() + ";");
    }
    System.out.println("\n");
    }
    
    }

