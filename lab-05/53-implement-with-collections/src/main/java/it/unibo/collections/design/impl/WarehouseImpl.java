package it.unibo.collections.design.impl;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import it.unibo.collections.design.api.Product;
import it.unibo.collections.design.api.Warehouse;

public class WarehouseImpl implements Warehouse {
    private Collection<Product> coll = new LinkedHashSet<>();

    @Override
    public void addProduct(final Product p) {
        coll.add(p);
    }

    @Override()
    public Set<String> allNames() {
        final Set<String> newSet = new HashSet<>();
        for(final var e: coll) {
            newSet.add(e.getName());
        }
        return newSet;
    }

    @Override
    public Set<Product> allProducts() {
        return new LinkedHashSet<Product>(coll);
    }

    @Override
    public boolean containsProduct(final Product p) {
        return coll.contains(p);
    }

    @Override
    public double getQuantity(final String name) {
        for (final var product: coll) {
            if (product.getName().equals(name)) {
                return product.getQuantity();
            }
        }
        return -1;
    }

    protected void setCollection(Collection<Product> coll) {
        this.coll = coll;
    }
}
