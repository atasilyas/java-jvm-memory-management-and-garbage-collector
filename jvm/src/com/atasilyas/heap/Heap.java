package com.atasilyas.heap;

import java.util.ArrayList;
import java.util.List;

public class Heap
{
    public static void main(String[] args)
    {
        List<String> myList = new ArrayList<>(); // in the stack there will be a reference of list as name ***myList and in the heap there will be a List object in Heap as List Object
        myList.add("one");  /* in the heap "one" is  a String and also its a object because String is a object and in the heap Jvm
         will create a object of String and value will be One also for the other string will create seperate object and 0 index of List will refer to One and the other
         */
        myList.add("two"); // same
        myList.add("three"); // same
        printList(myList); // From here there will be a new Clone of reference myList as name:  data and it will refer to ** same List object
        /*now myList has 4 values and it will be printed */
    } // stack is empty now scope is ended

    private static void printList(List<String> data)
    {
        String value = data.get(1); // there will be a reference which named value anf it will refer to tho(secont) strig of the list if i change this value myList also will effect.
        data.add("Four"); // add to List new String Object it will ad to Lİst and myLİst also refer to same List object and myLİst also effect from that
        System.out.println(value); // value will be prinnted
    } // scope is ended and all variable and reference in the stack will be deleted n this scope (value, data) only there will be a reference namded myList
}