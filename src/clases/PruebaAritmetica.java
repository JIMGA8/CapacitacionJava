package clases;

public class PruebaAritmetica {
    public static void main(String[] args) {

        Aritmetica aritmetica = new Aritmetica();

        aritmetica.a = 4;
        aritmetica.b = 9;

        aritmetica.sumar();

        System.out.println(aritmetica.sumarConRetorno());

        System.out.println(aritmetica.metodoBooleano());

        Aritmetica aritmeticaConstructoInicializado = new Aritmetica(9, 4);

        System.out.println(aritmeticaConstructoInicializado.a);

        System.out.println(aritmetica.sumarConArgumentos(10, 15));

    }

}
