package org.example.JavaConcepts.Annotation;

@VeryImportant
public class Cat {
    String name;
    int age;
    public Cat(String name){
        this.name = name;
    }
    public void meow(){
        System.out.println("Meow !!");
    }
    public void eat(){
        System.out.println("Eating biscuits");
    }
}
