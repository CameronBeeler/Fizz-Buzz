package com.cameronbeeler;

import java.util.ArrayList;
import java.util.List;

public class Main
{

    public static void main(String[] args)
    {
        List<Integer> three = new ArrayList<>();
        List<Integer> five = new ArrayList<>();
        List<Integer> threeAndFive = new ArrayList<>();

        for(int i=1;i<=100;i++)
        {
            if((i%3==0)&&(i%5==0))
            {
                System.out.println("FizzBuzz");
                threeAndFive.add(i);
                three.add(i);
                five.add(i);
            }else if (i%5==0)
            {
                System.out.println("Buzz");
                five.add(i);
            }else if (i % 3 == 0)
            {
                System.out.println("Fizz");
                three.add(i);
            }else
            {
                System.out.println(i);
            }
        }
        printArrays(three, "Three");
        printArrays(five, "Five");
        printArrays(threeAndFive, "Three and Five");

    }

    static void printArrays(List<Integer> number, String name)
    {
        int index = 0;
        System.out.println("Number =>" + name);
        for (Integer n : number)
        {
            if(index == 0)
            {
                System.out.print(n);
                index++;
            }else
            {
                System.out.print(", " + n);
            }
        }
        System.out.println("===========================================");
    }
}

