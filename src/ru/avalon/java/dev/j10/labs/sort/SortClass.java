/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs.sort;

import java.util.Comparator;
import ru.avalon.java.dev.j10.labs.Sort;


/**
 *
 * @author sera
 */
public class SortClass implements Sort {

    @Override
    public void sort(Object[] array) {
    }

    @Override
    public void sort(Comparable[] array) {
        for (int i=0; i<array.length-1; i++) {
            for (int j=0; j<array.length-1; j++) {
                if (array[j].compareTo(array[j+1])>0) {
                    Comparable memory = array[j];
                    array[j] = array[j+1];
                    array[j+1] = memory;
                }
            }
        }
    }

    @Override
    public void sort(Object[] array, Comparator comparator) {
        for (int i=0; i<array.length-1; i++) {
            for (int j=0; j<array.length-1; j++) {
                if (comparator.compare(array[j], array[j+1])<0) {
                    Object memory = array[j];
                    array[j] = array[j+1];
                    array[j+1] = memory;
                }
            }
        }
    }
    
    
}