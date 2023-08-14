package info.sanaulla.starbucks;

import info.sanaulla.coffeevendor.CoffeeVendor;

import java.util.Arrays;
import java.util.List;

public class Starbucks implements CoffeeVendor {
    public Starbucks(){
        System.out.println("Starbucks created");
    }
    @Override
    public String getName() {
        return "Starbucks";
    }

    @Override
    public List<String> getVariants() {
        return Arrays.asList("Latte", "Espresso", "Cappuccino",
                "Caffe Americano", "Flat White" );
    }

}
