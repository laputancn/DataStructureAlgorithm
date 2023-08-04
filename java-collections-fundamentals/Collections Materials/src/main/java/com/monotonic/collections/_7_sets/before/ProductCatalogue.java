package com.monotonic.collections._7_sets.before;

import com.monotonic.collections.common.Product;
import com.monotonic.collections.common.Supplier;

import java.util.*;

public class ProductCatalogue implements Iterable<Product>
{
    //private final List<Product> products = new ArrayList<>();
    private final Set<Product> products = new HashSet<>();
    public void addSupplier(final Supplier supplier)
    {
        products.addAll(supplier.getProducts());
        //products.addAll(supplier.getProducts());
/*        List<Product> supplierProducts = supplier.getProducts();
        supplierProducts.forEach(product -> 
        {
            if(!products.contains(product)){
                products.add(product);
            }
        });
 */
    }

    @Override
    public Iterator<Product> iterator()
    {
        return products.iterator();
    }
}
