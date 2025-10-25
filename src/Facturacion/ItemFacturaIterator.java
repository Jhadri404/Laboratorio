/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facturacion;

import Utilidades.Iterator;
import java.util.List;

/**
 *
 * @author Jorge
 */
public class ItemFacturaIterator implements Iterator {

    private final List<ItemFactura> items;
    private int posicion = 0;

    public ItemFacturaIterator(List items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return posicion < items.size();
    }

    @Override
    public Object next() {
        return items.get(posicion++);
    }

}
