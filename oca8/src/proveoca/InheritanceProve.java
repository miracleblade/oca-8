/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proveoca;

/**
 *
 * @author cristian
 */
public class InheritanceProve {
    
    
    static class Something{}
    
    static interface Moveable{
    
        public void move();
    }
    
    static abstract class Animal extends Something{
        
        public void rest(){
            System.out.println("Animal Rest");
        }
        
        public void move(){
            System.out.println("Animal Move");
        }
        
    }
    
    static class Dog extends Animal{
        public void bark(){
            System.out.println("uof!!!");
        }
        
        @Override
        public void rest(){
            System.out.println("Dog Rest");
        }
        
        public void sleep(){
            super.rest();
            this.rest();
        }
        
        public void runDog(){
            this.move();
        }
        
    }
    
    
    public static void main(String[] args) {
        
        Dog a = new Dog();
        
       a.sleep();
       a.runDog();
        
        
    }
    
}
