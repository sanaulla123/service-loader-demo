package info.sanaulla.client;

import info.sanaulla.coffeevendor.CoffeeVendor;
import java.util.ServiceLoader;

public class Client {

    public static void main(String[] args) {
        ServiceLoader<CoffeeVendor> coffeeVendors = ServiceLoader.load(CoffeeVendor.class);
        System.out.println("Found the following coffee vendors");
        for(CoffeeVendor coffeeVendor : coffeeVendors){
            System.out.println(coffeeVendor.getName() + ". Variants: " + coffeeVendor.getVariants());
        }
    }
}
