/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

/**
 *
 * @author DYLAN
 */
public class Persona {

    private String identificacion;
    private String nombre;

    public String getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public Persona(String identificacion, String nombre) {
        this.identificacion = identificacion;
        this.nombre = nombre;
    }

    public Persona() {
        this("", "");
    }

    @Override
    public String toString() {
        return "Persona{" + "identificacion=" + identificacion + ", nombre=" + nombre + '}';
    }

}
