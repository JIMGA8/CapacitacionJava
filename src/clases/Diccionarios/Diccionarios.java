package clases.Diccionarios;

import java.util.Hashtable;

public class Diccionarios {
    public static void main(String[] args) {

        // crear una instancia hashtable vamos a pasar pares key :value

        // creamos un diccionario de paises y capitales de sur america

        // hashtable<tipo,tipo> nombre = hashtable<tipo,tipo>();

        Hashtable<String, String> paisesyCapitales = new Hashtable<String, String>();

        // como agregar valores a un diccionario
        paisesyCapitales.put("Argentina", "Buenos Aires");
        paisesyCapitales.put("Bolivia", "Sucre");
        paisesyCapitales.put("Brasil", "Brasilia");
        paisesyCapitales.put("Colombia", "Bogota");
        paisesyCapitales.put("Venezuela", "Caracas");

        // podemos saber el tamaño
        System.out.println(paisesyCapitales.size());

        // podemos imprimirlo
        System.out.println(paisesyCapitales);

        // como obtener un valor de un diccionario
        System.out.println(paisesyCapitales.get("Argentina"));

        // validar que diccionario no este vacio
        System.out.println(paisesyCapitales.isEmpty());

        // podemos remover
        paisesyCapitales.remove("Colombia");
        System.out.println(paisesyCapitales);

        // podemos ver que una key contenga algo

        System.out.println(paisesyCapitales.contains(2));

        System.out.println(paisesyCapitales.contains("Venezuela"));

        System.out.println(paisesyCapitales.contains("Caracas"));

    }

}
