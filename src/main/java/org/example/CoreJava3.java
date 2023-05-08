package org.example;

public class CoreJava3 {
    public static void  main(String[] args)
    {
        //String is an object   //String Literal

        String s1 = "Ravi Kumar Gupta";
        String s5 = "Hello";

        //new
        String s2 = new String("Welcome");
        String s3 = new String("Welcome");

        String s = "Ravi Kumar Gupta";
        String[] splittedString = s.split("Kumar");
        System.out.println(splittedString[0]);
        System.out.println(splittedString[1]);
        //System.out.println(splittedString[2]);
        System.out.println(splittedString[1].trim());
        for(int i = 0;i <s.length(); i++)
        {
            System.out.println(s.charAt(i));
        }


        for(int i =s.length()-1;i >=0; i--)
        {
            System.out.println(s.charAt(i));
        }



    }
}
