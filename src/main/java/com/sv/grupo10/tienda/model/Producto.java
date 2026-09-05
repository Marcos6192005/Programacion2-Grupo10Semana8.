package com.sv.grupo10.tienda.model;

/**
 * Modelo de producto. Solo datos.
 * ID: String formato P### (ej. P001).
 */
public class Producto {

    private final String id;
    private String nombre;
    private Categoria categoria;
    private double precio;
    private int stock;

    public Producto(String id, String nombre, Categoria categoria, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        setPrecio(precio);
        setStock(stock);
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setPrecio(double precio) {
        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }

        this.precio = precio;
    }

    public void setStock(int stock) {
        if (stock < 0) {
            throw new IllegalArgumentException("El stock no puede ser negativo");
        }

        this.stock = stock;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                " | Nombre: " + nombre +
                " | Categoria: " + categoria +
                " | Precio: $" + precio +
                " | Stock: " + stock;
    }
}