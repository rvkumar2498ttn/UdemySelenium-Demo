package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJava2 {
    public static void main(String[] args){
        int[] arr2 = {10,20,30,40,50,60,70,7,8};

        for (int i=0;i<arr2.length;i++) {
            if (arr2[i] % 2 == 0) {
                System.out.println(arr2[i] + " is multiple of 2");
                break;
            } else {
                System.out.println(arr2[i] + " is not multiple of 2");
            }
        }

            ArrayList<String> a = new ArrayList<String>();
            a.add("Ravi");
            a.add("Kumar");
            a.add("Gupta");
           System.out.println(a.get(1));

           for(int i=0;i<a.size();i++)
           {
               System.out.println(a.get(i));
           }
        System.out.println("******");
           for(String val :a)
           {
               System.out.println(val);
           }

           //item present in arraylist
        System.out.println(a.contains("Gupta"));
           String[] name = {"ravi", "Kumar", "Gupta"};
           List<String> nameArrayList = Arrays.asList(name);
           nameArrayList.contains("Gupta");

          //Create object of the class = object.method

    }
}
