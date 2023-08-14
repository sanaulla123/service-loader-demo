module starbucks {
    requires coffee.vendor;
    provides info.sanaulla.coffeevendor.CoffeeVendor
            with info.sanaulla.starbucks.Starbucks;
}