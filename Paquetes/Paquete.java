/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquetes;

import Personas.Cliente;

/**
 *
 * @author Tony
 */
public class Paquete {
    private String codigo;
    private String descripcion;
    private double precio;
    private Cliente remitente;
    private Cliente destinatario;
    private Boolean estado;

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public Cliente getRemitente() {
        return remitente;
    }

    public Cliente getDestinatario() {
        return destinatario;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setRemitente(Cliente remitente) {
        this.remitente = remitente;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Paquete(String codigo, String descripcion, double precio, Cliente remitente, Cliente destinatario) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.estado =false;
    }

    public Paquete() {
        this("","",0,new Cliente(),new Cliente());
    }
    
    
    
}
