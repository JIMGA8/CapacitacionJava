package clases;

public class Aritmetica {

    // atributos
    int a, b;

    public Aritmetica() {

    }

    public Aritmetica(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // metodos sin atributos
    public void sumar() {
        int resultado = a + b;
        System.out.println(resultado);
    }

    // metodo con retorno

    public int sumarConRetorno() {
        return a + b;
    }

    public boolean metodoBooleano() {
        return true;
    }

    // metodos con Argumentos

    public int sumarConArgumentos(int a, int b) {
        return a + b;
    }

    public Persona retPersona() {
        return null;
    }

}
