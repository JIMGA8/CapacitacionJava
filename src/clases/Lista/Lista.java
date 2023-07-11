package clases.Lista;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {

        // definicion de una lista o collection
        // ArraysList<tipo> nombreLista = new ArraysList<tipo>();

        ArrayList<String> figuras = new ArrayList<String>();

        // como agregamos datos a una lista
        figuras.add("cuadrado");
        figuras.add("triangulo");
        figuras.add("circulo");
        figuras.add("rombo");
        figuras.add("rectangulos");

        // para ver tamaño .size();

        System.out.println(figuras.size());

        // podemos imprimir la lista
        System.out.println(figuras);

        // remover elemento de la lista

        figuras.remove(3);

        System.out.println(figuras);

        // podemos consultar uno especifico

        System.out.println(figuras.get(0));

        System.out.println(figuras.size());

        // podemos cambiar un elemento de esa lista

        figuras.set(0, "octagono");

        System.out.println(figuras.get(0));

        // podemos borrar todos los elementos de la lista

        // figuras.clear();
        System.out.println(figuras);
        System.out.println(figuras.size());

        System.out.println(figuras.contains("cuadrado"));

        System.out.println(figuras.contains("octagono"));

    }

}
