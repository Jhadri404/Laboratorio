/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clientes;

import Utilidades.IterableCollection;
import Utilidades.Iterator;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jprod
 */
public class Cliente implements IterableCollection<MetodoPago>{
    private String id;
    private String nombre;
    private String email;
    private String telefono;
    private List<MetodoPago> metodosPago;

    public String getId(){ return id; }
    public String getNombre(){ return nombre; }
    public String getEmail(){ return email; }
    public String getTelefono(){ return telefono; }
    /**
     * Cambiar por iterador
     * @return 
     */
    
    @Override
    public Iterator<MetodoPago> createIterator() {
        return new MetodosDePagoIterator(metodosPago);
    }  
    
    public void setNombre(String n){ this.nombre=n; }
    public void setEmail(String e){ this.email=e; }
    public void setTelefono(String t){ this.telefono=t; }
    
    public Cliente(String id, String nombre, String email, String telefono) {
        this.id=id; 
        this.nombre=nombre; 
        this.email=email; 
        this.telefono=telefono;
        metodosPago = new ArrayList<>();
    }

    public void addMetodoPago(MetodoPago mp){
        metodosPago.add(mp); 
    }
    
    public void removeMetodoPago(int metodoId){
        metodosPago.removeIf(m->m.getId()==metodoId);
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", email=" + email + ", telefono=" + telefono + ", metodosPago=" + metodosPago + '}';
    }

    

}
