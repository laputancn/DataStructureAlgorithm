package com.monotonic.collections._2_what_are_collections.before;

import com.monotonic.collections.common.Product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionConcepts
{
    public static void main(String[] args)
    {
        Product door = new Product("Wooden Door", 35);
        Product floorPanel = new Product("Floor Panel", 25);
        Product window = new Product("Glass Window", 10);

        Collection<Product> produects = new ArrayList<>();
        produects.add(door);
        produects.add(floorPanel);
        produects.add(window);

        //System.out.println(produects);

        for (Product product : produects) {
            System.out.println(product);
        }
        
        Iterator<Product> iterator = produects.iterator();
        while(iterator.hasNext()){
            Product product = iterator.next();
            if(product.getWeight()<20)
            {
                iterator.remove();
            }
        }
        System.out.println(produects);

        System.out.println(produects.size());
        System.out.println(produects.isEmpty());
        System.out.println(produects.contains(door));

        //System.out.println(produects.remove(door));
        //System.out.println(produects.contains(door));
        System.out.println(produects);
        
        Collection<Product> toRemove = new ArrayList<>();
        toRemove.add(window);
        toRemove.add(door);

        produects.removeAll(toRemove);

        System.out.println(produects);
    }
}
