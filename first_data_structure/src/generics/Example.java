package generics;

import java.util.ArrayList;

public class Example
{
    public static void main(String[] args)
    {
        //upcasting...
        Object name = "Josh";

        String nameAsString = (String) name;

        ArrayList listOfWords = new ArrayList();

        int number = 10;
        Integer numberAsObject = new Integer(10);

        Integer anotherObject = 10;
        int anotherNumber = new Integer(10).intValue();
    }
}
