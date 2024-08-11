/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RutasEntrega;

import java.util.HashSet;

/**
 *
 * @author Fernando
 */
public class RutaEntrega {
    
    private String codigo;
    private String nombre;
    private String descripcion;
    private HashSet<String> listaDestinos ;

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public HashSet<String> getListaDestinos() {
        return listaDestinos;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setListaDestinos(HashSet<String> listaDestinos) {
        this.listaDestinos = listaDestinos;
    }
    

    public RutaEntrega(String codigo, String nombre, String descripcion, HashSet<String> listaDestinos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.listaDestinos = listaDestinos;
    }
    
    public RutaEntrega() {
        this("","","",new HashSet<>());
    }

    @Override
    public String toString() {
        return "RutaEntrega{" + "codigo=" + codigo + ", nombre=" + nombre + ", descripcion=" + descripcion + ", listaDestinos=" + listaDestinos + '}';
    }
    
    
    
    
}
