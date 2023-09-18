import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Fecha contratacion = new Fecha(18,9,2023);
        Fecha cumple = new Fecha(3,8,2001);
        Jefe jefe = new Jefe("Nacho", "Sanchez", contratacion, cumple, 5000);

        EmpleadoComision empleadoComision = new EmpleadoComision("Fulano", "Rodriguez", contratacion, cumple, 2300, 25);

        EmpleadoSubordinado empleadoSubordinado = new EmpleadoSubordinado("Cami", "Alavarez", contratacion, cumple, 80);

        EmpleadoHora empleadoHora = new EmpleadoHora("Facu", "Rogel", contratacion, cumple, 60);

        List<Empleado> listaEmpleados = new ArrayList<>();

        listaEmpleados.add(jefe);
        listaEmpleados.add(empleadoComision);
        listaEmpleados.add(empleadoHora);
        listaEmpleados.add(empleadoSubordinado);


        for (Empleado  empleado : listaEmpleados) {
            System.out.println("Salario de " + empleado.getNombre() + ": " + empleado.calcularSalario());
        }

    }
}