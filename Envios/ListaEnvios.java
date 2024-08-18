/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Envios;

import Paquetes.ListaPaquetes;
import Personas.Cliente;
import RutasEntrega.ListaRutaEntrega;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.Queue;

/**
 *
 * @author d2tod
 */
public class ListaEnvios {

    private Queue<Envio> envios;
    private int contadorEnvios = 0;

    public Iterator<Envio> getEnvios() {
        return envios.iterator();
    }

    public Falla registrarEnvio(Cliente cliente, ListaPaquetes paquetes, ListaRutaEntrega rutas, LocalDate fechaEnvio, LocalDate fechaEntrega, double distanciaKm) {
        if (fechaEntrega.isBefore(LocalDate.now())) 
            return Falla.FechaEntrega;
        if (fechaEnvio.isAfter(fechaEntrega))
            return Falla.FechaEnvio;
        if (distanciaKm <= 0)
            return Falla.Peso;
        envios.add(new Envio(contadorEnvios++,cliente, paquetes, rutas, fechaEnvio, fechaEntrega, distanciaKm));
        return Falla.Nada;
    }
    
    public Envio buscar(int numeroEnvio){
        for (Envio envio: envios){
            if (numeroEnvio == envio.getNumeroEnvio())
                return envio;
        }
        return null;
    }
    
    public boolean despachar(int identificacion){
        return false;
    }
    
    public boolean entregar(int identificacion){
        return false;
    }

    public boolean cancelar(int identificacion) {
        return envios.removeIf(envio -> envio.getNumeroEnvio() == identificacion && envio.get);
    }

}
