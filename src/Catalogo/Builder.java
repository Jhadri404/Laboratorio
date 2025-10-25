/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Catalogo;

/**
 *
 * @author danny
 */
public class Builder {

    public String codigo;
    public String nombre;
    public double precio;
    public int stock;
    public Categoria categoria;

    public Builder() {
    }

    public Builder codigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    public Builder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public Builder precio(double precio) {
        this.precio = precio;
        return this;
    }

    public Builder stock(int stock) {
        this.stock = stock;
        return this;
    }

    public Builder categoria(Categoria categoria) {
        this.categoria = categoria;
        return this;
    }

    public Producto build() {
// validaciones mínimas
        if (codigo == null || nombre == null) {
            throw new IllegalStateException("codigo y nombre son obligatorios");
        }
        return new Producto(this);
    }
    
     public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getStock() { return stock; }
    public Categoria getCategoria() { return categoria; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setPrecio(double precio) { this.precio = precio; }
    public void setStock(int stock) { this.stock = stock; }
    public void setCategoria(Categoria categoria) { this.categoria = categoria; }
}