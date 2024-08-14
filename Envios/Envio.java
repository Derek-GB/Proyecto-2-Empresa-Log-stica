/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Envios;

import Paquetes.ListaPaquetes;
import Personas.Cliente;
import RutasEntrega.ListaRutaEntrega;
import java.time.LocalDate;

/**
 *
 * @author d2tod
 */
public class Envio {
    private int numeroEnvio;
    private Cliente cliente;
    private ListaPaquetes paquetes;
    private ListaRutaEntrega rutas;
    private LocalDate fechaEnvio;
    private LocalDate fechaEntrega;
    private double precio;

    public int getNumeroEnvio() {
        return numeroEnvio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ListaPaquetes getPaquetes() {
        return paquetes;
    }

    public ListaRutaEntrega getRutas() {
        return rutas;
    }

    public LocalDate getFechaEnvio() {
        return fechaEnvio;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public double getPrecio() {
        return precio;
    }

    private double calcularPrecio(double distanciaKm){
        return 900 + (distanciaKm * 1200);
    }
    
    protected Envio(int numeroEnvio, Cliente cliente, ListaPaquetes paquetes, ListaRutaEntrega rutas, LocalDate fechaEnvio, LocalDate fechaEntrega, double distanciaKm) {
        this.numeroEnvio = numeroEnvio;
        this.cliente = cliente;
        this.paquetes = paquetes;
        this.rutas = rutas;
        this.fechaEnvio = fechaEnvio;
        this.precio = calcularPrecio(distanciaKm);
    }
    
    public Envio(){
        this(-1,new Cliente(), new ListaPaquetes(), new ListaRutaEntrega(),null,null,0.0);
    }
    
}
