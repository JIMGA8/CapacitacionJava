package clases.herencia;

import clases.Persona;

public class Cliente extends Persona {

    private int idCliente;
    private boolean vip;

    public Cliente(int idCliente, boolean vip, String nombre, String apellido, int dni, String sexo) {
        super(nombre, apellido, dni, sexo);
        this.idCliente = idCliente;
        this.vip = vip;
    }

    public String toString() {
        return "Cliente {" + "idCliente=" + idCliente + ", vip=" + vip + "," + super.toString() + '}';
    }

}
