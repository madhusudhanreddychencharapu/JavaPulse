package org.example.Interfaces;

class A{
    public void printInt(int num){
        System.out.println(num);
    }
   public void eat(){
       System.out.println("I am eating in class A");
   }
   public void sleep(){
       System.out.println("I am sleeping in class A ");
   }
}
//class B extends A{
//    public void eat(){
//        System.out.println("I am eating in the class B");
//    }
//}
public class AnonymousClass {
    public static void main(String[] args) {
//        B obj = new B();
//        obj.eat();
        A obj = new A(){
            public void eat(){
                System.out.println("I am eating in anonymous inner class");
            }
            public void sleep(){
                System.out.println("I am sleeping in anonymous inner class");
            }
            public void printInt(int num){
                System.out.println(num*num);
            }
        };
        obj.eat();
        obj.sleep();
        obj.printInt(5);
    }
}
