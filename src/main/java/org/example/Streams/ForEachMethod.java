package org.example.Streams;

import org.example.Exception.MyOwnException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachMethod {
    public static void main(String[] args) {
//        List<Integer> nums = Arrays.asList(5,6,7,8);
//        nums.forEach(n-> {
//            System.out.println(n);
//            System.out.println("I am here executing");
 //       });
        String str1 = "madhu";
        String str2 = str1.intern();
        System.out.println(str1==str2);

    }
}
