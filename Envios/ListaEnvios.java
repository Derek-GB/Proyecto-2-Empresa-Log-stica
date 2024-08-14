/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Envios;

import Paquetes.ListaPaquetes;
import Personas.Cliente;
import RutasEntrega.ListaRutaEntrega;
import java.time.LocalDate;
import java.util.Queue;

/**
 *
 * @author d2tod
 */
public class ListaEnvios {

    private Queue<Envio> envios;
    private int contadorEnvios = 0;

//    private Object[] getEnvios() {
//        return envios.toArray();
//    }

    public Falla registrarEnvio(Cliente cliente, ListaPaquetes paquetes, ListaRutaEntrega rutas, LocalDate fechaEnvio, LocalDate fechaEntrega, double distanciaKm) {
        if (fechaEntrega.isBefore(LocalDate.now())) 
            return Falla.FechaEntrega;
        if (fechaEnvio.isAfter(fechaEntrega))
            return Falla.FechaEnvio;
        if (distanciaKm <= 0)
            return Falla.Distancia;
        envios.add(new Envio(contadorEnvios++,cliente, paquetes, rutas, fechaEnvio, fechaEntrega, distanciaKm));
        return Falla.Nada;
    }
    
//    public Envio buscar(int numeroEnvio){
//        return envios.
//    }

//    public void cancelar(int identificacion) {
//        envios.removeIf(Envio, getNumeroEnvio() == identificacion);
//    }

}
