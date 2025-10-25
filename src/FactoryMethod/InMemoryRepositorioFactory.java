/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

import Catalogo.RepositorioCategorias;
import Catalogo.RepositorioProductos;
import Clientes.RepositorioClientes;
import Facturacion.RepositorioFacturas;

/**
 *
 * @author danny
 */
public class InMemoryRepositorioFactory implements RepositorioFactory{

    @Override
    public RepositorioCategorias createRepositorioCategorias() {
        return new RepositorioCategorias();
    }

    @Override
    public RepositorioProductos createRepositorioProductos() {
        return new RepositorioProductos();
    }

    @Override
    public RepositorioClientes createRepositorioClientes() {
        return new RepositorioClientes();
    }

    @Override
    public RepositorioFacturas createRepositorioFacturas() {
        return new RepositorioFacturas();
    }
    
    
    
}
