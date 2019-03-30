
package ru.avalon.java.dev.j10.labs.randomizers;

/**
 *
 * @author sera
 */
public class RandomString {
  
     public static String getStr() 
    { 
  
        String Symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"+ "0123456789"; 

        StringBuilder sb = new StringBuilder(); 
  
        for (int i = 0; i < 5; i++) { 
            int index = (int)(Symbols.length()* Math.random()); 
            sb.append(Symbols.charAt(index)); 
        } 
  
        return sb.toString(); 
    } 
  
        public static void dispRandString(String[] strings){
        for (String array: strings){
        System.out.print(array+", ");
        }
            System.out.println("\n");
        }
           
        
        
}
