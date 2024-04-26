/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.iteratorjava;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author kamau
 */
public class IteratorJava {

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        //using the iterator
        Iterator<String> iterator = cars.iterator();
        //print the first item
       // System.out.println(iterator.next());
        //print the list
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
