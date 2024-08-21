/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Envios;

import Paquetes.Paquete;
import Personas.Cliente;
import RutasEntrega.RutaEntrega;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author d2tod
 */
public class ListaEnvios {

    private Queue<Envio> envios;
    private int contadorEnvios;

    public Iterator<Envio> getEnvios() {
        return envios.iterator();
    }
    
    public int getContador(){
        return this.contadorEnvios;
    }

    public void registrarEnvio(Cliente cliente, Paquete paquete, RutaEntrega ruta, double pesoKg) throws IllegalArgumentException {
        if (pesoKg <= 0)
            throw new IllegalArgumentException("Peso no puede ser cero o negativa");
        envios.add(new Envio(contadorEnvios++,cliente, paquete, ruta, pesoKg));
    }
    
    public Envio buscar(int identificacion){
        for (Envio envio: envios){
            if (envio.getNumeroEnvio() == identificacion)
                return envio;
        }
        return null;
    }
    
    public boolean despachar(int identificacion){
        for (Envio envio : envios){
            if (envio.getNumeroEnvio() == identificacion)
                return envio.getPaquete().despachar();
        }
        return false;
    }
    
    public boolean entregar(int identificacion){
        for (Envio envio : envios){
            if (envio.getNumeroEnvio() == identificacion)
                return envio.getPaquete().entregar();
        }
        return false;
    }

    public boolean cancelar(int identificacion) {
        for (Envio envio : envios){
            if (envio.getNumeroEnvio() == identificacion)
                return envio.getPaquete().cancelar();
        }
        return false;
    }

    public ListaEnvios() {
        this.envios = new LinkedList<>();
        this.contadorEnvios = 0;
    }
    
}
