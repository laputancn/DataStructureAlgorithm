package com.monotonic.collections._6_operations.before;

import com.monotonic.collections.common.Product;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionOperations
{
    public static Product door = new Product("Wooden Door", 35);
    public static Product floorPanel = new Product("Floor Panel", 25);
    public static Product window = new Product("Glass Window", 10);

    public static void main(String[] args)
    {
        //var products = new ArrayList<Product>();
        var products = List.of(door,floorPanel,window);
        Product minProd = Collections.min(products, Product.BY_WEIGHT);
        Product maxProd = Collections.max(products, Product.BY_WEIGHT);
        System.out.println(minProd);
        System.out.println(maxProd);

        var productsList = new ArrayList<Product>();
        Collections.addAll(productsList, door,floorPanel,window);
        System.out.println(productsList);
        productsList.add(new Product("Glass Door", 15));
        System.out.println(productsList);
    }
}
