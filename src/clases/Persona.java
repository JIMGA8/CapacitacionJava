package clases;

public class Persona {

    // atributos de la clase
    String nombre;
    String apellido;
    int dni;
    String sexo;

    public Persona() {

    }

    // contructor de la clase
    public Persona(String nombre, String apellido, int dni, String sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.sexo = sexo;
    }

    // metodos de la clase
    public void obtenerPersona() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Dni: " + dni);
        System.out.println("Sexo: " + sexo);
    }

    public String getNombre() {
        return nombre;
    }

    public String toString() {
        return "Persona {" + "nombre=" + nombre + " apellido=" + apellido + " dni=" + dni + " sexo=" + sexo + '}';
    }

}
