/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

import Envios.Envio;
import Envios.ListaEnvios;
import Listas.Lista;
import Paquetes.Estado;
import Paquetes.ListaPaquetes;
import Paquetes.Paquete;
import Personas.Cliente;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author DYLAN
 */
public class ListaCliente {
    
    private ArrayList<Cliente> Clientes;
    private ListaEnvios listaEnvios;
   

    
    private List<String> obtenerCodigosPaquetes(Cliente cliente) {
        return new ArrayList<>();
    }
    public ListaCliente(ListaEnvios envio) {
        this.Clientes = new ArrayList<>();
        this.listaEnvios=envio;
    }

    
    public boolean agregar(Cliente nuevoCliente) {
        for (Cliente cliente : Clientes) {
            if (cliente.getIdentificacion().equals(nuevoCliente.getIdentificacion())) {
               
                return false; 
            }
        }
        Clientes.add(nuevoCliente);
        return true;
    }
    
    public Cliente buscar(String identificacion) {
        for (Cliente cliente : Clientes) {
            if (cliente.getIdentificacion().equals(identificacion)) {
                return cliente;
            }
        }
        return null; 
    }
    
    private boolean tienePaqueteEnTransito(Cliente cliente) {
       Iterator<Envio> iterador = listaEnvios.getEnvios(); 

    while (iterador.hasNext()) {
        Envio envio = iterador.next(); 
        Paquete paquete = envio.getPaquete();

        if (envio.getCliente().equals(cliente) && paquete.getEstado()==Estado.DESPACHADO) { 
            return true; 
        }
    }

    return false; 
    }

    public void eliminar(String identificacion)throws ClienteConPaquetesEnTransitoException {
        Cliente cliente = buscar(identificacion);
        if (cliente == null) {
            throw new IllegalArgumentException("Cliente no encontrado.");
        }

        
        if (tienePaqueteEnTransito(cliente)) {
            throw new ClienteConPaquetesEnTransitoException("No se puede eliminar el cliente. Tiene paquetes en tránsito.");
        }

       
        Clientes.remove(cliente);
        System.out.println("Cliente eliminado: " + cliente);
    
    }
    
    public boolean actualizar(String identificacion, String correo,String telefono) {
       
        for (Cliente cliente : Clientes) {
            if (cliente.getIdentificacion().equals(identificacion)) {
                if (correo != null && !correo.isEmpty()) {
                    cliente.setCorreo(correo);
                }
                if (telefono != null && !telefono.isEmpty()) {
                    cliente.setTelefono(telefono);
                }
                return true; 
            }
        }
        return false; 
    }
    
     public Iterator<Cliente> getClientes() {
        return Clientes.iterator();
    }
}
