package com.demo.model.persistencia;
// Generated 10/10/2019 10:52:41 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

public class Proveedor  implements java.io.Serializable {


     private int idProveedor;
     private String descripcion;
     private Set productos = new HashSet(0);

    public Proveedor() {
    }

	
    public Proveedor(int idProveedor, String descripcion) {
        this.idProveedor = idProveedor;
        this.descripcion = descripcion;
    }
    public Proveedor(int idProveedor, String descripcion, Set productos) {
       this.idProveedor = idProveedor;
       this.descripcion = descripcion;
       this.productos = productos;
    }
   
    public int getIdProveedor() {
        return this.idProveedor;
    }
    
    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Set getProductos() {
        return this.productos;
    }
    
    public void setProductos(Set productos) {
        this.productos = productos;
    }




}


