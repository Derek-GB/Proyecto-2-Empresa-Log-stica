/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RutasEntrega;

import Listas.Lista;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author Fernando
 */
public class ListaRutaEntrega  {
 
 private ArrayList<RutaEntrega> rutas;

    public ListaRutaEntrega() {
        this.rutas = new ArrayList<>();
    }

    public boolean agregar(RutaEntrega nuevaRuta) {
        for (RutaEntrega ruta : rutas) {
            if (ruta.getCodigo().equals(nuevaRuta.getCodigo())) {
               
                return false; 
            }
        }
        rutas.add(nuevaRuta);
        return true;
    }

   public boolean actualizar(String codigo, String descripcion, HashSet<String> listaDestinos) {
     for (RutaEntrega ruta : rutas) {
        if (ruta.getCodigo().equals(codigo)) {
            boolean actualizado = false;

            if (descripcion != null && !descripcion.isEmpty()) {
                ruta.setDescripcion(descripcion);
                actualizado = true;
            }

            if (listaDestinos != null && !listaDestinos.isEmpty()) {
                ruta.getListaDestinos().clear(); 
                ruta.getListaDestinos().addAll(listaDestinos);  
                actualizado = true;
            }

            if (actualizado) {
                return true;
            }
        }
    }
    return false;
}
  
 
    public RutaEntrega buscar(String codigo) {
        for (RutaEntrega ruta : rutas) {
            if (ruta.getCodigo().equals(codigo)) {
                return ruta;
            }
        }
        return null; 
    }

    
    public boolean eliminar(String codigo) {
        boolean rutaEliminada = rutas.removeIf(ruta -> ruta.getCodigo().equals(codigo));
        return rutaEliminada; 
    }
    
     public Iterator<RutaEntrega> getRutas() {
        return rutas.iterator();
    }
}
