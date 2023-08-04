package com.monotonic.collections._4_maps.before;

import java.util.ArrayList;
import java.util.List;

public class NaiveProductLookupTable implements ProductLookupTable
{
    private final List<Product> products= new ArrayList<>();

    @Override
    public void addProduct(final Product productToAdd)
    {
        int prodId = productToAdd.getId();
        for(Product product:products){
            if(product.getId()==prodId)
            {
                throw new IllegalArgumentException(
                    "Unable to add duplicate product : product Id : "+product);
            }
        }
        products.add(productToAdd);
    }

    @Override
    public Product lookupById(final int id)
    {
        for (Product product : products) {
            if(product.getId() == id)
            return product;
        }
        return null;
    }

    @Override
    public void clear()
    {
        products.clear();
    }
}
