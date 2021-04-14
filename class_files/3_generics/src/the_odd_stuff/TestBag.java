package the_odd_stuff;

import gardens.Flower;
import gardens.Plant;
import storage_classes.DataStorage;

public class TestBag
{
    public static void main(String[] args)
    {
        Bag bag = new Bag();
        System.out.println(bag);

        DataStorage<? super Plant> storage = new DataStorage<>(new Flower("red"));
        System.out.println(storage.getData());
    }
}
