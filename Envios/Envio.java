/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Envios;

import Paquetes.Paquete;
import Personas.Cliente;
import RutasEntrega.RutaEntrega;
import java.time.LocalDate;

/**
 *
 * @author d2tod
 */
public class Envio {
    private int numeroEnvio;
    private Cliente cliente;
    private Paquete paquete;
    private RutaEntrega ruta;
    private LocalDate fechaEnvio;
    private LocalDate fechaEntrega;
    private double precio;

    public int getNumeroEnvio() {
        return numeroEnvio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Paquete getPaquete() {
        return paquete;
    }

    public RutaEntrega getRuta() {
        return ruta;
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

    private double calcularPrecio(double pesoKg){
        return 900 + (pesoKg * 1200);
    }
    
    public void finalizar(){
        fechaEntrega = LocalDate.now();
        paquete.entregar();
    }
    
    protected Envio(int numeroEnvio, Cliente cliente, Paquete paquete, RutaEntrega ruta, double pesoKg) {
        this.numeroEnvio = numeroEnvio;
        this.cliente = cliente;
        this.paquete = paquete;
        this.ruta = ruta;
        this.fechaEnvio = LocalDate.now();
        this.precio = calcularPrecio(pesoKg);
    }
    
    public Envio(){
        this(-1,new Cliente(), new Paquete(), new RutaEntrega(),0.0);
        this.fechaEnvio = null;
        this.fechaEntrega = null;
    }
    
}
