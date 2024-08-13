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
public class Cliente extends Persona{
    private int edad;

    public int getEdad() {
        return edad;
    }
    
    public int calcularEdad(LocalDate fechaNacimiento){
        LocalDate fechaActual= LocalDate.now();
        edad = fechaActual.getYear() - fechaNacimiento.getYear();
        return edad;
    }

    public Cliente(int edad, String identificacion, String nombre, LocalDate fechaNacimiento, String correo, String telefono) {
        super(identificacion, nombre, fechaNacimiento, correo, telefono);
        this.edad = calcularEdad(fechaNacimiento);
    }

    public Cliente() {
        this(0,"","",LocalDate.now(),"","");
    }

    @Override
    public String toString() {
        return "Cliente{" + "edad=" + edad + '}';
    }
    
    
    
}
