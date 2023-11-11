package org.example.JavaConcepts.Polymorphism;

public class DynamicBinding {
    public static void main(String[] args) {
        Animal obj = new Dog();
        Dog.eat();
        obj.makeSound();
    }
}
class Animal{
    static void eat(){
        System.out.println("I am eating in animal class !! static method ");
    }
    public void makeSound(){
        System.out.println("Animal Sounds");
    }
}
class Dog extends Animal{
    static void eat(){
        System.out.println("I am eating in Dog class !! static method ");
    }
    public void makeSound(){
        System.out.println("Boww Boww !!");
    }
    public void myMethod(){
        System.out.println("I am in MyMethod but not in Animal");
    }
}

