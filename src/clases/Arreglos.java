package clases;

public class Arreglos {
    public static void main(String[] args) {
        // definicion de un arreglo

        // tipo nombre [] o tipo [] nombre = new tipo [cantidad item];

        int edades[] = new int[3];

        edades[0] = 10;

        System.out.println(edades[0]);

        edades[2] = 4;
        System.out.println(edades[2]);

        // edades[3] = 7;
        // System.out.println(edades[3]);

        for (int i = 0; i < edades.length; i++) {
            System.out.println("edades elemento " + i + ": " + edades[i]);
        }

    }

}
