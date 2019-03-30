/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs;
import java.util.Comparator;
/**
 *
 * @author sera
 */
public abstract class MyComparator implements Comparator{
    
    public static class Sorting implements Comparator<String>{

        @Override
        public int compare(String a, String b) {
            return -a.compareTo(b);
        }
        
    }
    
    public static class Reverse implements Comparator<String>{

        @Override
        public int compare(String a, String b) {
            return a.compareTo(b);
        }
        
    }
    
}
