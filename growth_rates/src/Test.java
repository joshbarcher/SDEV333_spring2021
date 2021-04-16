import java.util.ArrayList;
import java.util.LinkedList;

public class Test
{
    public static void main(String[] args)
    {
        LinkedList<Integer> listOfInts = new LinkedList<>();

        //add 1,000,000 numbers to the list
        System.out.println("Started adding");
        for (int i = 1; i <= 1000000; i++)
        {
            listOfInts.add(i);
        }
        System.out.println("Ended adding");

        System.out.println("Accessing each element");
        for (int i = 0; i < listOfInts.size(); i++)
        {
            int element = listOfInts.get(i);
            /*System.out.println(element);*/
        }
        System.out.println("Done accessing elements");
    }
}
