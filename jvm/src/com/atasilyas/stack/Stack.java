package com.atasilyas.stack;

public class Stack
{
    public static void main(String[] args)
    {
        int value = 7; // first in stack value = 7 initialized top of the stack
        value = calculate(value); // in the stack there will be new parameter and it will be a copy of value named **data =7 top of the stack
        System.out.println(value);// last value of the  will be 20

    }//remove all variable(parameter in stack) now stack is emty because all scope is closed

    //stack lifecycle is short

    private static int calculate(int data)
    {
        int tempValue = data + 3;  // there will be a new parameter with name with top of the stack
        int newValue = tempValue * 2; // there will be a new parameter with name with
        return newValue; // when newValue return this methos scope will be ended and after this all this parameter in method will be removed from stack
    }//remove all variable in method in stack
}

/***all theread has its own stack  but all thread use same heap they can access
 * Stack : int double long vs all primitive type and also reference of object
 * Heap  : it store object itself also String Double String eg..
 * */
