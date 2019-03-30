
package ru.avalon.java.dev.j10.labs;

import java.util.Date;
import ru.avalon.java.dev.j10.labs.Person;


/**
 *
 * @author sera
 */
public class Persona implements Person{
    
    private final String name;
    private final Date birthDate;

    public Persona(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
  
    @Override
    public String getName() {
      return name;
    }

    @Override
    public Date getBirthDate() {
        return birthDate;
    }

    @Override
    public int compareTo(Object o) {
        Persona persona = (Persona)o;
        if (this.name.compareTo(persona.name) > 0) {
            return 1;
        } else if (this.name.compareTo(persona.name) < 0) {
            return -1;
        } else if (this.birthDate.compareTo(persona.birthDate) > 0) {
            return 1;
        } else if (this.birthDate.compareTo(persona.birthDate) < 0) {
            return -1;
        } else {
            return 0;
    }
        
       
    }   
}
