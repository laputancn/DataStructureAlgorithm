package com.monotonic.collections._3_lists.before;

import com.monotonic.collections.common.Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Shipment implements Iterable<Product>
{
    private static final int MISSING_PRODUCT = -1;

    private static final int LIGHT_VAN_MAX_WEIGHT = 20;

    private List<Product> lightVanProducts;
    private List<Product> havyVanProducts;

    private final List<Product> products = new ArrayList<>();
    public void add(Product product)
    {
        products.add(product);
    }

    public boolean replace(Product oldProduct, Product newProduct)
    {
        int position = products.indexOf(oldProduct);
        if(position == MISSING_PRODUCT)
        {
            return false;
        }
        else{
            products.set(position, newProduct);
            return true;
        }
    }

    public void prepare()
    {
        // sort the product list
        products.sort(Product.BY_WEIGHT);

        // find the split point
        int splitPoint = findSplitPoint();

        // create two subview of product list
        lightVanProducts = products.subList(0, splitPoint);
        havyVanProducts = products.subList(splitPoint, products.size());
    }

    private int findSplitPoint() {
        for(int i=0;i<products.size();i++){
            if(products.get(i).getWeight()>LIGHT_VAN_MAX_WEIGHT)
            {
                return i;
            }
        }
        return 0;
    }

    public List<Product> getHeavyVanProducts()
    {
        return havyVanProducts;
    }

    public List<Product> getLightVanProducts()
    {
        return lightVanProducts;
    }

    public Iterator<Product> iterator()
    {
        return products.iterator();
    }
}
