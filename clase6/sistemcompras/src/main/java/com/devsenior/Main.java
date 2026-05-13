package com.devsenior;

public class Main {
    public static void main(String[] args) {
        System.out.println("=========INICIO DEL SISTEMA DE COMPRAS==========");

        Usuario usuario1 = new Usuario("DanielaG@gmail.com", "12345");

        System.out.println("Intentando login con contraseña correcta");
        boolean loginExitoso = usuario1.login("12345");

        if (loginExitoso) {
            System.out.println("Usuario Autenticado correctamente");
        }else{
            System.out.println("Usuario fallido, login no auteneticado");
        }

        ProductoRepository db = new ProductoRepository();
        Producto producto1 = new Producto("PR001", "Arroz", 1500);
        Producto producto2 = new Producto("PR002", "Papa", 800);

        db.guardarProducto(producto2);
        db.guardarProducto(producto1);


        System.out.println("Buscando producto con id \"PR001\" ");
        Producto productoEncontrado = db.buscaProducto("PR001");
        System.out.println("Producto encontrado: " +
            (productoEncontrado != null ? productoEncontrado.getName() : " NO encontrado")
         );

         System.out.println("Agregando productos al carrito");
         Carrito carrito = new Carrito();
         carrito.agregarProducto(producto1);
         carrito.agregarProducto(producto2);

         System.out.println("Productos del carrito");
         for(Producto productoAux : carrito.getProductos()){
            System.out.println("-" + productoAux.getName() + " PRECIO : "+ productoAux.getPrice());
         }


         System.out.println("Realizando compra");
         CompraService compraService = new CompraService();
         try {
            compraService.comprar(carrito);
         } catch (Exception e) {
            System.out.println("Error al comprar "+ e.getMessage());
         }
    }
}