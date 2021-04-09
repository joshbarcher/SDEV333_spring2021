package storage_classes;

import java.awt.*;

public class TestStorage
{
    public static void main(String[] args)
    {
        Color color = new Color(10, 2, 3);
        String name = "Josh";
        int age = 33;

        ObjectStorage storage = new ObjectStorage(name);

        //print name in uppercase
        String value = (String)storage.getData();
        System.out.println(value.toUpperCase());

        DataStorage<String> storeStrings = new DataStorage<String>(name);
        System.out.println(storeStrings.getData().toUpperCase());

        DataStorage<Integer> storeNumbers = new DataStorage<Integer>(age);
        double ageAsDouble = storeNumbers.getData().doubleValue();
    }
}
