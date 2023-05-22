import java.util.Scanner;

public class Modulo1 {
    public static void main(String[] args) throws Exception {
        System.out.print("hola \n"); // imprime todo en una linea
        System.out.println("hola2"); // da un salto de linea
        System.out.println("Bienvenido a \"Java\"");
        System.out.println("Bienvenido a \tJava");

        // variables

        // tipo varable nombreVariable
        byte miByte; // 1 Byte --> 8 Bits --> 2^8= 256 ---> de -128 a 127
        miByte = 127;
        System.out.println(miByte);

        short miShort; // 2 Byte--> 16 Bits -->2^16 = 65336 ---> de -32768 a 32767
        miShort = 129;
        System.out.println(miShort);

        int miInt; // 3 Byte --> 32 Bits--> 2^32= 4294967295 --> de -2.147.483.648 a -2.147.483.647
                   // este es el que mas vamos a usar
        miInt = 4659;
        System.out.println(miInt);

        long miLong; // 4 Byte --> 64 Bits -> 2^64 18.446.744.073.709.551.615 --> de
                     // -9.223.372.036.854.775.808 a -9.223.372.036.854.775.807
        miLong = 9254135652845685l;
        System.out.println("el valor de mi variable miLong es " + miLong);

        // numeros decimales

        float miFloat; // contiene 4 Byte
        miFloat = 10.25f;
        System.out.println("el valor de mi float es " + miFloat);

        double miDouble; // contine 8 byte //este es el que mas vamos a usar
        miDouble = 10.657;
        System.out.println("el valor de mi " + miDouble);

        // boleanos y Chart

        boolean miBoolean = true; // boleano es true o false
        System.out.println(miBoolean);

        char michar = '$'; // este recibe un caracter
        System.out.println("el valor de miChar es " + michar);

        String miString = "ya sabemos Tipos de Datos";
        System.out.println(miString);

        // constantes
        final int iva = 17;
        // iva=25;

        // operadores
        System.out.println("Operadores Aritmeticos");

        int num1, num2, operacion;
        num1 = 4;
        num2 = 3;

        operacion = num1 + num2;
        System.out.println("la Suma es " + operacion);

        operacion = num1 - num2;
        System.out.println("la Resta es " + operacion);

        operacion = num1 * num2;
        System.out.println("la Multiplicacion es " + operacion);

        operacion = num1 / num2;
        System.out.println("la Division es " + operacion);

        operacion = num1 % num2;
        System.out.println("el resto es " + operacion);

        num1 = num1 + num2;
        System.out.println(num1);
        num1 += num2; // esto es lo mismo que escirba num1= num1 +num2;
        System.out.println(num1);

        num1 -= num2;
        System.out.println(num1);

        num1 *= num2;
        System.out.println(num1);

        num1 /= num2;
        System.out.println(num1);

        // operadores Logicos
        System.out.println("Operadores Logicos");

        boolean opLog1, opLog2;
        opLog1 = true;
        opLog2 = false;

        // AND
        System.out.println("el AND \"&&\" de opLog1 y opLog2 es " + (opLog1 && opLog2));

        // OR
        System.out.println("el OR \"||\" de opLog1 y opLog2 es " + (opLog1 || opLog2));

        // NOT
        System.out.println("el NOT \"!\" de opLog1 es " + !opLog1);
        System.out.println("el NOT \"!\" de opLog1 y opLog2 es " + !(opLog1 && opLog2));

        /*
         * Eeste es un comentario de multiples Lineas
         * nsjndjdjsdjsd
         * 
         */

        System.out.println("incrementar");

        int cont = 0;

        cont++;
        System.out.println(cont);

        /*
         * Realice un programa que dado un numero entero de horas muestre en la consola
         * el equivalente en semanas, dias y horas..
         * 
         * ejemplo:
         * 
         * 1800 horas equivale a:
         * n semanas
         * n dias
         * n horas
         * 
         */

        int totalHoras = 1802;
        int semanas, dias, horas, resto;

        semanas = totalHoras / (7 * 24);
        System.out.println("la cantidad de semanas es: " + semanas);

        resto = totalHoras % (7 * 24);

        dias = resto / 24;
        System.out.println("la cantindad de dias es " + dias);

        horas = resto % 24;
        System.out.println("la cantindad de horas es " + horas);

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la Cantindad de horas ");
        totalHoras = scan.nextInt();

        semanas = totalHoras / (7 * 24);

        resto = totalHoras % (7 * 24);

        dias = resto / 24;

        horas = resto % 24;
        System.out.println(
                totalHoras + " horas equivale a: \n" + semanas + " semanas \n" + dias + " dias \n" + horas + " horas");
    }
}
