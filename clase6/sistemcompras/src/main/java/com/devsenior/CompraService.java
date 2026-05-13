package com.devsenior;

public class CompraService {

    public ResultadoCompra comprar(Carrito carrito){
        if (carrito.estaVacio()) {
            throw new RuntimeException("El carrito esta vacío");
        }
        carrito.vaciar();
        return new CompraExitosa();
    }
}
