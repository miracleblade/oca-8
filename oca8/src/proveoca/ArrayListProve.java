/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proveoca;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cristian
 */
public class ArrayListProve {
    
    
    public static void main(String[] args) {
        
        List<Integer> integers = new ArrayList<>();
        
        integers.add(1);//0
        integers.add(Integer.valueOf(1));//1

        
        try{
            integers.add(10,10);
        }catch(java.lang.IndexOutOfBoundsException e){
            e.printStackTrace();
        }

        integers.add(2,2);//2
        integers.add(2,3);//2 e shifta il 2 di prima
        
        integers.forEach(v -> System.out.println(v));
        
        
    }
    
}
