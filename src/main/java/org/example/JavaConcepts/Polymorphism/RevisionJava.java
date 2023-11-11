package org.example.JavaConcepts.Polymorphism;

public class RevisionJava {
    public static void main(String[] args) {




    }

}
class Cat {
    private String name;
    private int age;
    private int numberOfLegs;
    private String sound;

    // Default constructor
    public Cat() {
        name = "Unknown";
        age = 0;
        numberOfLegs = 4; // By default, a cat has 4 legs
        sound = "Meow";
    }

    // Overloaded constructor
    public Cat(String name, int age, int numberOfLegs, String sound) {
        this.name = name;
        this.age = age;
        if (numberOfLegs >= 0) {
            this.numberOfLegs = numberOfLegs;
        } else {
            this.numberOfLegs = 4; // Set to 4 if an invalid value is provided
        }
        this.sound = sound;
    }

    // Getter and setter methods for the fields
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        if (numberOfLegs >= 0) {
            this.numberOfLegs = numberOfLegs;
        } else {
            this.numberOfLegs = 4; // Set to 4 if an invalid value is provided
        }
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    // Method to make the cat perform its action
    public void makeSound() {
        System.out.println(name + " says: " + sound);
    }

    // Overloaded toString() method to display information about the cat
    @Override
    public String toString() {
        return "Cat: [Name: " + name + ", Age: " + age + ", Number of Legs: " + numberOfLegs + ", Sound: " + sound + "]";
    }

    public static void main(String[] args) {
        // Creating cat instances using default and overloaded constructors
        Cat cat1 = new Cat();
        Cat cat2 = new Cat("Whiskers", 3, 3, "Purr");

        // Printing information about the cats using the toString() method
        System.out.println(cat1);
        System.out.println(cat2);

        // Making the cats perform their actions
        cat1.makeSound();
        cat2.makeSound();

        Object obj;
    }
}
