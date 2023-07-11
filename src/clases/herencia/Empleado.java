package clases.herencia;

import clases.Persona;

public class Empleado extends Persona {

    // atributos
    public int idEmpleado;
    private String departamento;
    private double sueldo;

    // metodos empleado

    public double getSueldo() {
        return sueldo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

}
