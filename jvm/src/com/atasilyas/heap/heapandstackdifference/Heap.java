package com.atasilyas.heap.heapandstackdifference;

//passing by reference
public class Heap
{
    public static void main(String[] args)
    {
        Customer c =  new Customer("ilyas"); /*in the stack there will be a reference of customer which named as **c and this c
          int the Heap there will be a Customer object and this object contains a String and also heap wilil contains a String which value is = ilyas
          this customer contains String ilyas*/
        renameCustomer(c); /*after that in the top of the  stack thre will be a new reference named  **cust it will be a copy of **c
        and it will refer to the same object */

        System.out.println(c.getName()); // out : atas

    }// remove c reference from stack. stack is emty now

    private static void renameCustomer(Customer cust)
    {
        cust.setName("Atas"); // here we are changing customer object in the heap which is referred from **cust reference but here c is also refer
        // to same object customer because of that c is effected from operations on cust in the heap also create a object of string value = atas
        // there are two string in the heap.  previous string ilyas is over htere  but the reference of customer are not vontains this string they contains atas string

        System.out.println(cust.getName()); /// out: atas
    } // cust reference removed from stack
}
