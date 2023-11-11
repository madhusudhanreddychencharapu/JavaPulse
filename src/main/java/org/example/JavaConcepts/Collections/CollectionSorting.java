package org.example.JavaConcepts.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionSorting {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        List<String> str = new ArrayList<>();
        str.add("madhu");
        str.add("yash");
        str.add("sparsha");
        str.add("shiva");
        str.add("sai");
        str.add("amin md");

        Comparator<String> comp = new Comparator<>() {
            public int compare(String str1, String str2){
                if(str1.length()>str2.length()){
                   return 1;
                }else{
                   return -1;
                }
            }
        };
        str.sort(comp);
       // Collections.sort(str);
        System.out.println(str);


      /*  Comparator<Integer> comp = new Comparator<>() {
           public int compare(Integer i , Integer j){
               if(i%10 > j%10){
                  return 1;
               }else{
                   return -1;
               }
           }
        };nums.add(25);
        nums.add(32);
        nums.add(32);
        nums.add(68);
        nums.add(19);


        nums.sort(comp);
       // Collections.sort(nums);
        System.out.println(nums);*/
    }
}
