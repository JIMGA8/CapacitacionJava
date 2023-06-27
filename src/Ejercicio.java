import java.util.Scanner;

public class Ejercicio {

    public static void main(String[] args) {

        /*
         * Crea un programa en el que el usuario ingrese una oración y se muestre el
         * carácter que más se repite, junto con el número de repeticiones. El programa
         * debe excluir los espacios en blanco y no permitir oraciones vacías. Si se
         * ingresa una oración vacía, se debe volver a solicitar al usuario que ingrese
         * una oración.
         * ejemplo de salida:
         * ingrese la oración a evaluar (no puede estar vacía):
         * oración ingresada por el usuario: el día de hoy aprendimos switch, operador
         * ternario, ciclos while, do while y for
         * el carácter que mas se repitió es: (o) y se repitió 8 veces
         */

        Scanner scaner = new Scanner(System.in);
        String oracion;
        char caracter = 'a';
        char caracterAux;
        int cantidadRepeticiones = 0;

        do {
            System.out.println("ingrese la oracion a evaluar (no puede estar vacia): ");
            oracion = scaner.nextLine();
        } while (oracion.length() == 0); // oracion.isEmpty();

        for (int i = 0; i < oracion.length(); i++) {
            caracterAux = oracion.charAt(i);
            int contadorAux = 0;

            if (caracterAux == ' ') {
                continue;
            }

            for (int j = 0; j < oracion.length(); j++) {
                if (caracterAux == oracion.charAt(j)) {
                    contadorAux++;
                }
            }

            if (contadorAux > cantidadRepeticiones) {
                cantidadRepeticiones = contadorAux;
                caracter = caracterAux;
            }

        }
        if (cantidadRepeticiones > 0) {
            System.out.println("el caracter que mas se repito es: (" + caracter + ") y se repitio "
                    + cantidadRepeticiones + " veces");
        } else {
            System.out.println("no hubo repeticiones");
        }

        scaner.close();
    }

}
