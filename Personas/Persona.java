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
public abstract class Persona {
    private String identificacion;
    private String nombre;
    private LocalDate fechaNacimiento;
    private String correo;
    private String telefono;

    public String getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }

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

    public Persona(String identificacion, String nombre, LocalDate fechaNacimiento, String correo, String telefono) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.correo = correo;
        this.telefono = telefono;
    }

    public Persona() {
        this("","",LocalDate.now(),"","");
    }

    @Override
    public String toString() {
        return "Persona{" + "identificacion=" + identificacion + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", correo=" + correo + ", telefono=" + telefono + '}';
    }
    
    
    
}
