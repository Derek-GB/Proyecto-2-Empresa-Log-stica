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
public class Cliente extends PersonaDetallada{
    private int edad;

    public int getEdad() {
        return edad;
    }
    
    public int calcularEdad(LocalDate fechaNacimiento){
        LocalDate fechaActual= LocalDate.now();
        edad = fechaActual.getYear() - fechaNacimiento.getYear();
        return edad;
    }

    public Cliente(int edad, LocalDate fechaNacimiento, String correo, String telefono, String identificacion, String nombre) {
        super(fechaNacimiento, correo, telefono, identificacion, nombre);
         this.edad = calcularEdad(fechaNacimiento);
    }

   
    public Cliente() {
        this(0,LocalDate.now(),"","","","");
    }

    @Override
    public String toString() {
        return "Cliente{" + "edad=" + edad + '}';
    }
    
    
    
}
