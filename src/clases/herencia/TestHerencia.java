package clases.herencia;

public class TestHerencia {
    public static void main(String[] args) {

        Empleado empleado1 = new Empleado();

        System.out.println(empleado1);

        empleado1.setIdEmpleado(4);

        empleado1.setNombre("jim");
        empleado1.setApellido("gavidia");
        empleado1.setDni(9614671);
        empleado1.setSexo("masculino");

        System.out.println(empleado1);

        Cliente cliente1 = new Cliente(1, true, "jose", "marquez", 5545455, "masculino");

        System.out.println(cliente1);

    }

}
