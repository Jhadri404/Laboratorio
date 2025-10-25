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
public class FacturaIterator implements Iterator {

    private final List<Factura> facturas;
    private int posicion = 0;

    public FacturaIterator(List facturas) {
        this.facturas = facturas;
    }

    @Override
    public boolean hasNext() {
        return posicion < facturas.size();
    }

    @Override
    public Object next() {
        return facturas.get(posicion++);
    }

}
