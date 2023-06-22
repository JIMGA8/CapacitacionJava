
import java.util.InputMismatchException;
import java.util.Scanner;

public class Modulo2 {

    public static void main(String[] args) {

        // operadores de Comparacion

        int num1 = 4;
        int num2 = 7;

        // igualdad ==
        System.out.println("igualdad \"==\" num1 es igual a num2 : " + (num1 == num2));
        // distinto !=
        System.out.println("distinto \"!=\" num1 es distinto a num2 : " + (num1 != num2));
        // mayor que >
        System.out.println("mayor \">\" num1 es mayor a num2 : " + (num1 > num2));
        // menor que <
        System.out.println("menor \"<\" num1 es menor a num2 : " + (num1 < num2));
        // mayo o igual >=
        System.out.println("mayor o igual \">=\" num1 es mayor o igual a num2 : " + (num1 >= num2));
        // menor o igual <=
        System.out.println("menor o igual \"<=\" num1 es menor o igual a num2 : " + (num1 <= num2));

        num1 = 7;
        System.out.println("mayor o igual \">=\" num1 es mayor o igual a num2 : " + (num1 >= num2));
        System.out.println("menor o igual \"<=\" num1 es menor o igual a num2 : " + (num1 <= num2));

        String str1 = "hola";
        String str2 = "hola";

        System.out.println("comparacion de String " + (str1.equals(str2)));
        System.out.println(str1.contains("o"));
        System.out.println(str1.contains("j"));
        System.out.println("la longitud del string str1 es: " + str1.length());
        System.out.println(str1.isEmpty());
        System.out.println(str1.toLowerCase()); // convierte todo el string en minuscula
        System.out.println(str1.toUpperCase()); // convierte todo el string en mayuscula

        str1 = "   hola como estas   ";

        System.out.println(str1);
        System.out.println(str1.trim());

        // /*
        // * Realice un programa que se le pida el nombre del usuario y la edad por
        // * consola y se imprima
        // * hola, nombre. tienes edad anio
        // */

        Scanner consola = new Scanner(System.in);

        System.out.println("Ingresa tu nombre: ");
        String nombre = consola.nextLine();

        System.out.println("Ingresa tu edad: ");
        int edad = consola.nextInt();

        System.out.println("hola, " + nombre + " tienes " + edad + " anio");

        // condicionales
        boolean condicion = true;

        if (condicion) {
            System.out.println("condicion Verdadera");
        } else {
            System.out.println("condicion Falsa");
        }

        // // ejemplo 2

        int numA = 1;
        String numero = "numero desconocido";

        if (numA == 1) {
            numero = "el numero es 1";
        } else if (numA == 2) {
            numero = "el numero es 2";
        } else if (numA == 3) {
            numero = "el numero es 3";
        }

        System.out.println(numero);

        // /*
        // * programa que el usuario ingrese un mes de año y segun el mes ingresado me
        // * imprima la estacion del año
        // * enero a marzo es verano
        // * Abril a junio es otonio
        // * julio a septiembre es invierno
        // * octube a diciembre es primavera
        // */

        System.out.println("ingrese el mes en el formato MM: ");

        String estacion = "desconocida";

        try {
            int mes = consola.nextInt();

            if (mes == 1 || mes == 2 || mes == 3) {
                estacion = "verano";
            } else if (mes == 4 || mes == 5 || mes == 6) {
                estacion = "otonio";
            } else if (mes == 7 || mes == 8 || mes == 9) {
                estacion = "invierno";
            } else if (mes == 10 || mes == 11 || mes == 12) {
                estacion = "primavera";
            }
            System.out.println(estacion);
        } catch (InputMismatchException e) { // Exception
            e.printStackTrace(); // esto me permite imprimir la exception
            System.out.println("Entrada invalida, se espera un numero entero");
        }

        // switch

        int numeroSwitch = 35;
        String stringSwitch;

        switch (numeroSwitch) {
            case 1:
                stringSwitch = "el numero es 1";
                break;
            case 2:
                stringSwitch = "el numero es 2";
                break;
            case 3:
                stringSwitch = "el numero es 3";
                break;
            default:
                stringSwitch = "el numero es desconocido";
        }

        System.out.println(stringSwitch);

        System.out.println("ingrese el mes");
        try {
            int mes = consola.nextInt();

            switch (mes) {
                case 1:
                case 2:
                case 3:
                    estacion = "verano";
                    break;
                case 4:
                case 5:
                case 6:
                    estacion = "otonio";
                    break;
                case 7:
                case 8:
                case 9:
                    estacion = "invierno";
                    break;
                case 10:
                case 11:
                case 12:
                    estacion = "primavera";
                    break;
                default:
                    estacion = "estacion desconocida, ingrese un numero del 01 al 12";
            }
            System.out.println("la estacion es " + estacion);
        } catch (InputMismatchException e) {
            System.out.println("entrada invalida, se espera un numero del 01 al 12");
        }

        // // operador ternario
        // // (codicion) ? "codicion verdadera": "condicion Falsa"

        int edad2 = 12;
        String resultado;

        resultado = (edad2 >= 18) ? "eres mayor de edad" : "eres menor de edad";

        // la linea 178 es lo mismo que escribir esto

        if (edad2 >= 18) {
            resultado = "eres mayor de edad";
        } else {
            resultado = "eres menor de edad";
        }

        System.out.println(resultado);

        // while

        int contador = 0;

        while (contador < 3) {
            System.out.println("contador es " + contador);
            contador++;
        }

        // do while

        do {
            System.out.println("contador es " + contador);
            contador++;
        } while (contador == 0);

        // for
        // for (inicializacion de variable; codicion; icremento/decremento){}

        for (int i = 0; i < 3; i++) {
            System.out.println("contador del for es " + i);
        }

        for (int i = 3; i > 0; i--) {
            System.out.println("contador del for es " + i);
        }

        // palabras claves break y continue
        // encuentra el primer numero par

        // break

        for (int i = 3; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println("el primer numero Par es " + i);
                break;
            }
        }

        // continue
        for (int i = 1; i < 10; i++) {
            if (i % 2 != 0) {
                continue; // siguiente iteracion
            }
            System.out.println("el primer numero par es " + i);
            break;
        }

    }

}
