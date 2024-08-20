/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Personas;

/**
 *
 * @author DYLAN
 */
public enum PuestoEnum  {
    Mensajero(270000.0),
    Gerente(1400000.0),
    Recepcionista(350000.0),
    Administrador(630000.0),
    Despachador(360000.0),
    Conductor(370000.0);

    private final double salario;

    PuestoEnum(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
    
      public String toString() {
        return this.name(); // O retorna un String personalizado si prefieres
    }
}
