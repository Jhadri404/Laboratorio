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
public class CatalogoIterator implements Iterator {

    private final List<Categoria> Categoria;
    private int position = 0;

    public CatalogoIterator(List<Categoria> Categoria) {
        this.Categoria = Categoria;
    }

    @Override
    public boolean hasNext() {
        return position < Categoria.size();
    }

    @Override
    public Object next() {
        return Categoria.get(position++);
    }

}
