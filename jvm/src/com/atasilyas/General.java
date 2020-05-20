package com.atasilyas;



// drow diagram for this later.
public class General
{
    public static void main(String[] args)
    {
        General general = new General();
        general.start();
    }

    private void start()
    {
        String last ="Z";
        Container container = new Container();
        container.setInitial("C");
        another(container, last);
        System.out.println(container.getInitial());
    }

    private void another(Container initialHolder, String newInitial)
    {
        newInitial.toLowerCase(); // not creating a new String object only at the runtime
        initialHolder.setInitial("B");
        Container initial2 = new Container();
        initialHolder = initial2;
        System.out.println(initialHolder.getInitial());
        System.out.println(newInitial);
    }
}
