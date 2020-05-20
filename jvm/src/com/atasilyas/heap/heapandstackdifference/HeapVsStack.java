package com.atasilyas.heap.heapandstackdifference;

public class HeapVsStack
{ // pass value by value n the stack passing by value
    public static void main(String[] args)
    {
        int localValue = 5; // this is a primitive type and it will created in the stack as  localValue = 5
        calculate(localValue); // in the method there is a primitive type of int and in the  top of the stack there willl be a value named calcValue = 5 this is a copy of  localValue
        System.out.println(localValue); // now at the top of the stack there only one value is localValue = 5 this noe effected from calcValue  print it as 5
    } // and remove from stack the localValue

    private static void calculate(int calcValue)
    {
        calcValue = calcValue * 100; // calcValue is changed but this is a primitive type also localValue is a prirmitive type because of that localValue wont be changed
        //only calcValue valuee will be changed  in the stack
        System.out.println(calcValue); // 500
    }// remove calcValue from the stack
}

// value localValue is passed to calcValue not reference of localValue because of that localValue dint effected from calcValue operations.
