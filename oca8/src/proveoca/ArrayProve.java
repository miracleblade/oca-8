/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proveoca;

import java.util.Arrays;

/**
 *
 * @author cristian
 */
public class ArrayProve {
    
    
    public static void main(String[] args) {
        
        int a [] = {};
        System.out.println(a.length);
        try{
            System.out.println(a[0]);
        }catch(Exception e){
            e.printStackTrace();
        }
        int b[];
        b = new int[]{};
        //b={}; <-- //errore
        
        
        
        String[] s1 = {"uno","due","tre"};
        
        String s2[] = new String[2];
        
        
        System.arraycopy(s1, 1, s2, 0, 2);
        
        Object obj[] = {new Object[1]};
        
        Arrays.asList(s2).stream().forEach(v -> System.out.println(v));
        
        
        
        
    }
}
