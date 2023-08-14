package info.sanaulla.costacoffee;

import info.sanaulla.coffeevendor.CoffeeVendor;

import java.util.Arrays;
import java.util.List;

public class CostaCoffee implements CoffeeVendor {

    public CostaCoffee(){
        System.out.println("Costa Coffee created");
    }
    @Override
    public String getName() {
        return "Costa Coffee";
    }

    @Override
    public List<String> getVariants() {

        return Arrays.asList("Latte", "Flat Black", "Cortado", "Espresso", "Mocha");
    }

}
