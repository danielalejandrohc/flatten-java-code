/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daniel;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author daniel.hernandez01
 */
public class Main {
    
    public static void main(String[] args) {
        // A representation of the array it is: [1, 2, 3, [41, 42, 43, 44, 45], [], [1, 2, [1, 2, 3, 4, 5, [1, 2]]], 7, 8, 9, 10]
        List<Object> array = Arrays.asList(
                1,
                2,
                3,
                Arrays.asList(41, 42, 43, 44, 45), Arrays.asList(),
                Arrays.asList(1, 2, (Arrays.asList(1, 2, 3, 4, 5, Arrays.asList(1, 2)))),
                7,
                8,
                9, 
                10);
        
        System.out.println("Original array: " + array);
        
        // This class it will create a plain array list instead a multi-dimensional nested array
        Flatten x = new Flatten(array);
        x.compute();
        
        // Result after computing
        List<Object> ret = x.getRet();
        
        System.out.println("Flatten array: " + ret);
    }
    
    
}
