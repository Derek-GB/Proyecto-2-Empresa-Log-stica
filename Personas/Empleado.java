/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

import java.time.LocalDate;

/**
 *
 * @author DYLAN
 */


public class Empleado extends PersonaDetallada {
    
    private double salario;
    private PuestoEnum puesto;

    public double getSalario() {
        return salario;
    }

    public PuestoEnum getPuesto() {
        return puesto;
    }

    public void setPuesto(PuestoEnum puesto) {
        this.puesto = puesto;
    }
    
    

    public Empleado(double salario, PuestoEnum puesto, LocalDate fechaNacimiento, String correo, String telefono, String identificacion, String nombre) {
        super(fechaNacimiento, correo, telefono, identificacion, nombre);
        this.salario = salario;
        this.puesto = puesto;
    }

    

    public Empleado() {
        this(0.0,PuestoEnum.Mensajero,LocalDate.now(),"","","","");
        
    }
    
    
}
