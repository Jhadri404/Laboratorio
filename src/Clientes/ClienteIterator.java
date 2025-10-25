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
public class ClienteIterator implements Iterator<Cliente>{

    private final List<Cliente> cliente;
    private int position = 0;

    public ClienteIterator(List<Cliente> cliente) {
        this.cliente = cliente;
    }
    
    @Override
    public boolean hasNext() {
          return position < cliente.size();
    }

    @Override
    public Cliente next() {
        return cliente.get(position++);
    }
}