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
public abstract class PersonaDetallada extends Persona {
    private LocalDate fechaNacimiento;
    private String correo;
    private String telefono;

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public PersonaDetallada(LocalDate fechaNacimiento, String correo, String telefono, String identificacion, String nombre) {
        super(identificacion, nombre);
        this.fechaNacimiento = fechaNacimiento;
        this.correo = correo;
        this.telefono = telefono;
    }

    

    public PersonaDetallada() {
        this(LocalDate.now(),"","","","");
    }

    @Override
    public String toString() {
        return "PersonaDetallada{" + "fechaNacimiento=" + fechaNacimiento + ", correo=" + correo + ", telefono=" + telefono + '}';
    }

    
    
    
    
    
}
