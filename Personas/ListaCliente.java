/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

import Listas.Lista;
import Paquetes.Estado;
import Paquetes.ListaPaquetes;
import Paquetes.Paquete;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author DYLAN
 */
public class ListaCliente implements Lista <Cliente>{
    
    private ArrayList<Cliente> Clientes;
    private ListaPaquetes listaPaquetes;

    
    private List<String> obtenerCodigosPaquetes(Cliente cliente) {
        return new ArrayList<>();
    }
    public ListaCliente() {
        this.Clientes = new ArrayList<>();
        this.listaPaquetes = listaPaquetes;
    }

    @Override
    public void agregar(Cliente objeto) {
      this.Clientes.add(objeto);
    }
    
    public Cliente buscar(String identificacion) {
        for (Cliente cliente : Clientes) {
            if (cliente.getIdentificacion().equals(identificacion)) {
                return cliente;
            }
        }
        return null; 
    }
    
     public boolean tienePaqueteEnTransito(Cliente cliente){
      boolean tienePaqueteEnTransito = false;
      List<String> codigosPaquetes = obtenerCodigosPaquetes(cliente); // Implementar este método según tu lógica

        for (String codigo : codigosPaquetes) {
            Paquete paquete = listaPaquetes.buscar(codigo);
            if (paquete != null && paquete.getEstado() == Estado.DESPACHADO) {
                tienePaqueteEnTransito = true;
                break;
            }
        }

        return tienePaqueteEnTransito;
    
     }

    @Override
//    Queda pendiente la excepcion
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
