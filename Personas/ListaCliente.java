/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

import Listas.Lista;
import java.util.ArrayList;

/**
 *
 * @author DYLAN
 */
public class ListaCliente implements Lista <Cliente>{
    
    private ArrayList<Cliente> Clientes;

    public ListaCliente() {
        this.Clientes = new ArrayList<>();
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

    @Override
//    Queda pendiente la excepcion
    public void eliminar(String identificacion) {
        Clientes.removeIf(cliente -> cliente.getIdentificacion().equals(identificacion));
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
}
