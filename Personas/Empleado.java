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
enum Puesto {
    Mensajero(270000.0),
    Gerente(1400000.0),
    Eecepcionista(350000.0),
    Administrador(630000.0),
    Despachador(360000.0),
    Conductor(370000.0);

    private final double salario;

    Puesto(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
}

public class Empleado extends Persona {
    
    private double salario;
    private Puesto puesto;

    public double getSalario() {
        return salario;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public Empleado(double salario, Puesto puesto, String identificacion, String nombre, LocalDate fechaNacimiento, String correo, String telefono) {
        super(identificacion, nombre, fechaNacimiento, correo, telefono);
        this.salario = salario;
        this.puesto = puesto;
    }

    public Empleado() {
        this(0.0,Puesto.Mensajero,"","",LocalDate.now(),"","");
        
    }
    
    
}
