/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquetes;

import Personas.Persona;
import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author Tony
 */
public class ListaPaquetes {

    HashMap<String, Paquete> paquetes = new HashMap();

    public ListaPaquetes() {
        this.paquetes = new HashMap<>();
    }

    public void agregar(String codigo, Paquete objecto) {
        this.paquetes.put(codigo.toUpperCase(), objecto);
    }

    public Paquete buscar(String objecto) {
        if (paquetes.containsKey(objecto)) {
            return paquetes.get(objecto);
        }
        return null;
    }

    public void eliminar(String codigo) throws IllegalArgumentException {
        Paquete paquete = paquetes.get(codigo.toUpperCase());
        if (paquete != null && paquete.getEstado() == Estado.ALMACEN) {
            paquetes.remove(codigo.toUpperCase());
        } else {
            throw new IllegalArgumentException("No se puede eliminar un paquete en el Estado Actual [Despachado] ");
        }

    }

    public boolean actualizar(String codigo, String descripcion, Persona destinatario) {

        if (paquetes.containsKey(codigo)) {
            Paquete paquete = paquetes.get(codigo);
            boolean actualizado = false;
            if (descripcion != null && !descripcion.isEmpty()) {
                paquete.setDescripcion(descripcion);
                actualizado = true;
            }
            
            if (destinatario != null) {
                paquete.setDestinatario(destinatario);
                actualizado = true;
            }
            
            if (actualizado) {
                return true;
            }
        }

        return false;

    }
    public Iterator<Paquete> getPaquetes() {
        return paquetes.values().iterator();
    }

}
