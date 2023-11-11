package org.example.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamBasic {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(31,85,6,103,25,98,46);
        System.out.println("odd num doubling and sum using streams");

        int lowNum,highestNum;
        Optional<Integer> num = nums.stream().sorted().findFirst();
        if(num.isPresent()){
            System.out.println(num);
        }else {

        }
        System.out.println(num);

//        Stream<Integer> s1 = nums.stream().sorted();
//        s1.forEach(n -> System.out.print(n+" "));

        /*int res = nums.stream().
                filter(n->n%2 != 0).
                map(n->n*2).
                reduce(0,(c,e)->c+e);
        System.out.println(res);*/
        /*
        System.out.println("even num doubling using loops");
        for(int i = 0;i<nums.size();i++){
            if(nums.get(i)%2 == 0){
                System.out.println(nums.get(i)*2);
            }
        }*/
    }
}
