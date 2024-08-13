/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquetes;


import java.util.HashMap;

/**
 *
 * @author Tony
 */
public class ListaPaquetes {
    HashMap<String,Paquete> paquetes = new HashMap();
    
   

    public ListaPaquetes() {
        this.paquetes = new HashMap<>();
    }
  
    public void agregar (String codigo,Paquete objecto){
        this.paquetes.put(codigo.toUpperCase(), objecto);
    }
    
    public Paquete buscar (String objecto){
       if(paquetes.containsKey(objecto)){
           return paquetes.get(objecto);
       } 
           return null;
    }

    public void eliminar(String codigo) {
        paquetes.remove(codigo);
    }
    
    public boolean actualizar (String codigo,String descripcion , Boolean estado){
      
        if(paquetes.containsKey(codigo)){
             Paquete paquete = paquetes.get(codigo);
             
        if(descripcion != null && !descripcion.isEmpty()){
           paquete.setDescripcion(descripcion);
        }
       if(estado != null){
           paquete.setEstado(estado);
    }
       return true;
    }
    return false;
    
    }
    
    
    
    
    
}
