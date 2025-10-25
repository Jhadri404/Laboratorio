/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
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
public interface RepositorioFactory {
    RepositorioCategorias createRepositorioCategorias();
    RepositorioProductos createRepositorioProductos();
    RepositorioClientes createRepositorioClientes();
    RepositorioFacturas createRepositorioFacturas();
}