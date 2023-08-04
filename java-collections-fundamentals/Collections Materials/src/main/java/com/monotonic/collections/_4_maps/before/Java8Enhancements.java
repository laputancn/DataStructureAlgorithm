package com.monotonic.collections._4_maps.before;

import java.util.HashMap;
import java.util.Map;

public class Java8Enhancements
{
    public static void main(String[] args)
    {
        Product defaultProd = new Product(
            -1, "Whatever the customer wants", 100);

        Map<Integer, Product> idToProduct = new HashMap<>();
        idToProduct.put(1, ProductFixtures.door);
        idToProduct.put(2, ProductFixtures.floorPanel);
        idToProduct.put(3, ProductFixtures.window);

        System.out.println("before replace ------>"+idToProduct);
        idToProduct.replaceAll((id,prod)->(
            new Product(id, prod.getName(), prod.getWeight()+20)
        ));
        System.out.println("after replace ------>"+idToProduct);

        idToProduct.computeIfAbsent(3, 
            id -> new Product(3, "Door Handle", 5));
        System.out.println("after computerIfAbsent with key=3 ------>"+idToProduct);

        idToProduct.computeIfAbsent(4, 
            id -> new Product(4, "Door Handle", 5));
        System.out.println("after computerIfAbsent with key=4 ------>"+idToProduct);

        idToProduct.forEach((id,prod)->
        {
            System.out.println(prod.getName()+" has id of "+id);
        });
        
        Product product = idToProduct.getOrDefault(5,defaultProd);
        System.out.println(product);
        System.out.println(idToProduct.get(5));

        idToProduct.replace(1, new Product(1, "Big Door", 50));
        System.out.println(idToProduct.get(1));
    }
}
