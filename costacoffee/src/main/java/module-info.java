module costacoffee {
    requires coffee.vendor;
    provides info.sanaulla.coffeevendor.CoffeeVendor
            with info.sanaulla.costacoffee.CostaCoffee;
}