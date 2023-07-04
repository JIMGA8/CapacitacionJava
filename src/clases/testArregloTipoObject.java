package clases;

public class testArregloTipoObject {
    public static void main(String[] args) {

        Persona persona[] = new Persona[2];

        // cramos 2 persona
        persona[0] = new Persona();
        persona[1] = new Persona("jim", "gavidia", 96145671, "masculino");

        // System.out.println("persona o " + persona[0]);
        // System.out.println("persona 1 " + persona[1]);

        for (int i = 0; i < persona.length; i++) {
            System.out.println("persona " + i + "=" + persona[i]);
        }

        // definir un arrays desde su creacion

        String frutas[] = { "naranja", "banana", "melon" };
        String contrasena[] = { "naranja", "banana", "melon" };

        for (int i = 0; i < frutas.length; i++) {
            System.out.println("Frutas " + i + "=" + frutas[i]);
        }

    }

}
