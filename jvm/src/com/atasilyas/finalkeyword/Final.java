package com.atasilyas.finalkeyword;

import com.atasilyas.heap.heapandstackdifference.Customer;

// we can not change reference of the final object but we can change referred object itself (inside)
public class Final
{
    final static int age = 12;
    final static Customer cust = new Customer("ilyas") ;
    //we cant change value of object or variable defined as final keyword
    public static void main(String[] args)
    {
       // age = 11; get compiler error because final variable can not be changed
        System.out.println(age); //in the stach there is a value named age = 12;

        /*there will be a cust reference refer to the customer object and this object address can not be chaned not inside object object itself
        * because cust shoult refer to the same customer if customer not changed there is no problem but if inside customer name is change ther is no problem because this is the sme customer*/
        //cust = new Customer("atas");  // error because cust is refer to the different customer but cust is final

        cust.setName("ilyas");// its ok because cust is  still  refer to the same customer object

    }

}
