/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RutasEntrega;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author Fernando
 */
public class ListaRutaEntrega {
    
 private ArrayList<RutaEntrega> rutas;

    public ListaRutaEntrega() {
        this.rutas = new ArrayList<>();
    }

    public void agregar(RutaEntrega ruta) {
        this.rutas.add(ruta);
    }

    public boolean actualizar(String codigo, String descripcion, HashSet<String> listaDestinos) {
       
        for (RutaEntrega ruta : rutas) {
            if (ruta.getCodigo().equals(codigo)) {
                if (descripcion != null && !descripcion.isEmpty()) {
                    ruta.setDescripcion(descripcion);
                }
                if (listaDestinos != null && !listaDestinos.isEmpty()) {
                    ruta.setListaDestinos(listaDestinos);
                }
                return true; 
            }
        }
        return false; 
    }
        
    public boolean eliminar(String codigo) {
        return rutas.removeIf(ruta -> ruta.getCodigo().equals(codigo));
    }

 
    public RutaEntrega buscar(String codigo) {
        for (RutaEntrega ruta : rutas) {
            if (ruta.getCodigo().equals(codigo)) {
                return ruta;
            }
        }
        return null; 
    }
}
