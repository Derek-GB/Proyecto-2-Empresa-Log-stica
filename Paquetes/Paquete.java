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
    private double peso;
    private Cliente remitente;
    private Cliente destinatario;
    private Estado estado;

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPeso() {
        return peso;
    }

    public Cliente getRemitente() {
        return remitente;
    }

    public Cliente getDestinatario() {
        return destinatario;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setRemitente(Cliente remitente) {
        this.remitente = remitente;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Paquete(String codigo, String descripcion, double peso, Cliente remitente, Cliente destinatario) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.peso = peso;
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.estado= Estado.ALMACEN;
    }

    public Paquete() {
        this("","",0,new Cliente(),new Cliente());
    }
    
    
    
}
