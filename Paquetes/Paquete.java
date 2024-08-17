/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquetes;

import Personas.Cliente;
import Personas.Persona;

/**
 *
 * @author Tony
 */
public class Paquete {
    private String codigo;
    private String descripcion;
    private double peso;
    private Persona remitente;
    private Persona destinatario;
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

    public Persona getRemitente() {
        return remitente;
    }

    public Persona getDestinatario() {
        return destinatario;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setRemitente(Persona remitente) {
        this.remitente = remitente;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Paquete(String codigo, String descripcion, double peso, Persona remitente, Persona destinatario) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.peso = peso;
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.estado= Estado.ALMACEN;
    }

    public Paquete() {
        this("","",0,new Persona(),new Persona());
    }

    @Override
    public String toString() {
        return "Paquete " + "codigo = " + codigo + ", descripcion = " + descripcion + ", peso = " + peso + ", remitente =" + remitente + ", destinatario = " + destinatario + ", estado = " + estado;
    }
    
    
}
