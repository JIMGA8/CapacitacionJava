package clases;

public class Persona {

    // atributos de la clase
    public String nombre;
    public String apellido;
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setSexo(String sexo) {
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
