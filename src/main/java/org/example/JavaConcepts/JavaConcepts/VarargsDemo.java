package org.example.JavaConcepts.JavaConcepts;

/*
* Here the concept is like if we have variable no of arguments of similar data type
* we use the concept of the varargs
* If we put three dots infront of variable it changed to the array data type the
* variable no of arguments stored in an array */
class Abc{
    public int sum(int ...a){
        int sum = 0;
        for(int i : a){
            sum = sum + i;
        }
        return sum;
    }
}
public class VarargsDemo {
    public static void main(String[] args) {
        Abc obj = new Abc();
        System.out.println(obj.sum(3,4,5,6,7,7));
    }
}
