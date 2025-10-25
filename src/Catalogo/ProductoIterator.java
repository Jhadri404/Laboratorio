/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Catalogo;

import Utilidades.Iterator;
import java.util.List;

/**
 *
 * @author Jorge
 */
public class ProductoIterator implements Iterator<Producto> {

    private final List<Producto> productos;
    private int position = 0;

    public ProductoIterator(List<Producto> productos) {
        this.productos = productos;
    }
    
    @Override
    public boolean hasNext() {
        return position < productos.size();
    }

    @Override
    public Producto next() {
        return productos.get(position++);
    }

}
