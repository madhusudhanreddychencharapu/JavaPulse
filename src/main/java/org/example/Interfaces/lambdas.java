package org.example.Interfaces;

interface  Alambda{
    public int squareNum(int n);
}

public class lambdas {
    public static void main(String[] args) {
//        Alambda obj = new Alambda() {
//            @Override
//            public void sleep() {
//                System.out.println("I am sleeping in anonymous");
//            }
//        };
//        obj.sleep();

        Alambda obj = (int n)-> {
            System.out.println(n * n);
            return -1;
        };
        int num = obj.squareNum(8);
        System.out.println(num);
    }
}
