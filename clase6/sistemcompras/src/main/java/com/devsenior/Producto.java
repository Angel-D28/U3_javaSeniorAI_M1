package com.devsenior;

public class Producto {
    private String id;
    private String name;
    private double price;
    
    public Producto(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }
    
    @Override
    public boolean equals(Object o){
        if(this == o ) return true;
        if(!(o instanceof Producto)) return false;
        Producto producto = (Producto)o;
        return this.id.equals(producto.id);
    }
    
}
