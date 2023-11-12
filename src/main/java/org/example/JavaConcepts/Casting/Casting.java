package org.example.JavaConcepts.Casting;

public class Casting {
    public static void main(String[] args) {
        //UpCasting
//        Animal animal = new Dog();
//        animal.makeNoise();

//        //DownCasting
//        Dog dog = (Dog)new Animal();
        Animal animal = new Dog();
        Dog dog =(Dog)animal;
        dog.showCharacter();
//        Dog dog = new Dog();
//        Cat cat = new Cat();
//        doANimalStuff(cat);
//        dog.makeNoise();
//        dog.showCharacter();
    }
    public static void doANimalStuff(Animal animal){
        animal.makeNoise();
        if(animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.showCharacter();
        }
    }

}
class Animal{
    public void makeNoise(){
        System.out.println("Animal makes random noises");
    }
}
class Dog extends Animal{
    @Override
    public void makeNoise(){
        System.out.println("Boww Boww !!");
    }
    public void showCharacter(){
        System.out.println("Most Faithfully to the Owner");
    }
}
class Cat extends Animal{
    @Override
    public void makeNoise(){
        System.out.println("Meow Meow !!");
    }
    public void showAttitude(){
        System.out.println("It doesn't have neatness");
    }
}
