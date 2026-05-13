package com.devsenior;

import java.util.HashMap;
import java.util.Map;

public class ProductoRepository {
    private Map<String , Producto> productos = new HashMap<>();

    public void guardarProducto(Producto producto){
        productos.put(producto.getId(), producto);
    }

    public Producto buscaProducto(String id){
        return productos.get(id);
    }
    
}
