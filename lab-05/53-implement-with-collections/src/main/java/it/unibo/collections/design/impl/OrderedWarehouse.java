package it.unibo.collections.design.impl;

import java.util.TreeSet;

import it.unibo.collections.design.api.Product;

public class OrderedWarehouse extends WarehouseImpl {
    
    public OrderedWarehouse() {
        super();
        this.setCollection(new TreeSet<Product>());
    }
}
