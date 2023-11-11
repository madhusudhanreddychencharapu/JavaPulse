package org.example.JavaConcepts.JavaConcepts;

public class MarkerInterface {
    public static void main(String[] args) {
        A obj = new A();
        if(obj instanceof P) {
            obj.show();
        }else{
            System.out.println("There is no permission");
        }
    }
}
class A implements P {
    void show(){
        System.out.println("I am in show");
    }
}
interface P{

}
