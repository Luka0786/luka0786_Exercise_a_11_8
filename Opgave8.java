package Kap11Exercise8;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Opgave8
{
    /*
    Write a method minLength that accepts a set of strings as a parameter
    and that returns the length of the shortest string in the list.
    If your method is passed an empty set, it should return 0.
    */

    public static void main(String[] args)
    {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Jeg er");
        stringSet.add("Jeg er lang");
        stringSet.add("Jeg er længere");
        stringSet.add("Jeg er længest");
        stringSet.add("Jeg er støst af jer");
        stringSet.add("Jeg er den aller største");
        stringSet.add("Jeg er den største af alt og alle");
        stringSet.add("23123");

        Set<String> emptyString = new HashSet<>();
        emptyString.add("");

        System.out.println(minLength(stringSet));
    }

    public static int minLength(Set<String> stringSet)
    {
        int min = 100;
        for (String test : stringSet)
        {
            if (test.length() < min)
            {
                min = test.length();
            }
        }
        return min;
    }
}
