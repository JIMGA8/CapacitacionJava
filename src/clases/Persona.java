package clases;

public class Persona {

    // atributos de la clase
    String nombre;
    String apellido;
    int dni;
    String sexo;

    // contructor de la clase
    // public Persona(String nombre){
    // this.nombre=nombre;
    // }

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

}
