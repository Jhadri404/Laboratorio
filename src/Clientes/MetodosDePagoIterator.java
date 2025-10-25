/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clientes;

import Utilidades.Iterator;
import java.util.List;

/**
 *
 * @author Jorge
 */
public class MetodosDePagoIterator implements Iterator {

    private final List<MetodoPago> metodos;
    private int posicion = 0;

    public MetodosDePagoIterator(List<MetodoPago> metodos) {
        this.metodos = metodos;
    }

    @Override
    public boolean hasNext() {
        return posicion < metodos.size();
    }

    @Override
    public Object next() {
        return metodos.get(posicion++);
    }

}
