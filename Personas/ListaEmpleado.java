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
public class ListaEmpleado implements Lista <Empleado> {
    private ArrayList<Empleado> empleados;

    public ListaEmpleado() {
        this.empleados = new ArrayList<>();
    }

    @Override
    public void agregar(Empleado objeto) {
      this.empleados.add(objeto);
    }
    
    
    public boolean actualizar(String identificacion, String correo,String telefono,Puesto puesto) {
       
        for (Empleado empleado : empleados) {
            if (empleado.getIdentificacion().equals(identificacion)) {
                if (correo != null && !correo.isEmpty()) {
                    empleado.setCorreo(correo);
                }
                if (telefono != null && !telefono.isEmpty()) {
                    empleado.setTelefono(telefono);
                }
                if (puesto != null && !puesto.isEmpty) {
                    empleado.setTelefono(puesto);
                }
                return true; 
            }
        }
        return false; 
    }
    
    public Empleado buscar(String identificacion) {
        for (Empleado empleado : empleados) {
            if (empleado.getIdentificacion().equals(identificacion)) {
                return empleado;
            }
        }
        return null; 
    }
    

    @Override
    public void eliminar(String identificacion) {
        empleados.removeIf(empleado -> empleado.getIdentificacion().equals(identificacion));
    }
    
    
}
