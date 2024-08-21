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
public class ListaEmpleado {
    private ArrayList<Empleado> empleados;

    public ListaEmpleado() {
        this.empleados = new ArrayList<>();
    }


    
    public boolean agregar(Empleado nuevoEmpleado) {
        for (Empleado empleado : empleados) {
            if (empleado.getIdentificacion().equals(nuevoEmpleado.getIdentificacion())) {
               
                return false; 
            }
        }
        empleados.add(nuevoEmpleado);
        return true;
    }
    
    
    public boolean actualizar(String identificacion, String correo,String telefono,PuestoEnum puesto) {
       
        for (Empleado empleado : empleados) {
            if (empleado.getIdentificacion().equals(identificacion)) {
                if (correo != null && !correo.isEmpty()) {
                    empleado.setCorreo(correo);
                }
                if (telefono != null && !telefono.isEmpty()) {
                    empleado.setTelefono(telefono);
                }
                if (puesto != null) {
                    empleado.setPuesto(puesto);
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
    

    public void eliminar(String identificacion) {
        empleados.removeIf(empleado -> empleado.getIdentificacion().equals(identificacion));
    }
    
    
}
