package informal_tests;

import structure.Bag;

public class TestMyBag
{
    public static void main(String[] args)
    {
        Bag bagOfTreats = new Bag(5);

        System.out.println("Before adding...");
        System.out.println(bagOfTreats.size() + " / " + bagOfTreats.getCapacity());
        System.out.println(bagOfTreats.isEmpty());
        System.out.println(); //new line

        System.out.println(bagOfTreats.add("Donut"));
        System.out.println(bagOfTreats.add("Gummi Worms"));
        System.out.println(bagOfTreats.add("Reeses"));
        System.out.println(bagOfTreats.add("Snickers"));
//        System.out.println(bagOfTreats.add("Mike n Ike"));
//        System.out.println(bagOfTreats.add("Cookies"));

        System.out.println(bagOfTreats);
        System.out.println();

        System.out.println(bagOfTreats.size() + " / " + bagOfTreats.getCapacity());
        System.out.println(bagOfTreats.isEmpty());
        System.out.println(); //new line
    }
}
