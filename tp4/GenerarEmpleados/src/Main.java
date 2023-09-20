import java.util.*;
import java.util.Scanner;

public class Main {
    public static void ordernarPorApellido(Empleado arr[]) {

    }
    public static void main(String[] args) {

        Fecha contratacion = new Fecha(18,9,2023);
        Fecha cumple = new Fecha(3,8,2001);
        Fecha contratacion1 = new Fecha(16,9,2023);
        Fecha cumple1 = new Fecha(3,8,2001);
        Fecha contratacion2 = new Fecha(18,12,2023);
        Fecha cumple2 = new Fecha(3,8,2001);
        Fecha contratacion3 = new Fecha(18,1,2020);
        Fecha cumple3 = new Fecha(3,8,2001);

        Jefe jefe = new Jefe("Nacho", "Sanchez", contratacion, cumple, 5000);

        EmpleadoComision empleadoComision = new EmpleadoComision("Fulano", "Rodriguez", contratacion1, cumple1, 2300, 25);

        EmpleadoSubordinado empleadoSubordinado = new EmpleadoSubordinado("Cami", "Alavarez", contratacion2, cumple2, 80);

        EmpleadoHora empleadoHora = new EmpleadoHora("Facu", "Rogel", contratacion3, cumple3, 60);

        List<Empleado> listaEmpleados = new ArrayList<>();

        listaEmpleados.add(jefe);
        listaEmpleados.add(empleadoComision);
        listaEmpleados.add(empleadoHora);
        listaEmpleados.add(empleadoSubordinado);
        /*
        for (Empleado  empleado : listaEmpleados) {
            System.out.println("Salario de " + empleado.getNombre() + ": " + empleado.calcularSalario());
        }*/
        String atributo = "";
        while (atributo == "") {
            System.out.println("Elegir por cual criterio ordenar: 1)Apellido 2)Nombre 3)Fecha de cumpleaños 4)Fecha de contratacion");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            switch (input) {
                case "1" -> {
                    Collections.sort(listaEmpleados);
                    atributo = "apellido";
                }
                case "2" -> {
                    Collections.sort(listaEmpleados, new CompararPorNombre());
                    atributo = "nombre";
                }
                case "3" -> {
                    Collections.sort(listaEmpleados, new CompararPorFechaCumple());
                    atributo = "fecha de cumpleaños";
                }
                case "4" -> {
                    Collections.sort(listaEmpleados, new CompararPorFechaContrat());
                    atributo = "fecha de contratacion";
                }
                default -> System.out.println("Numero ingresado invalido");
            }
        }

        System.out.println("Ordenado por " + atributo);
        for (Empleado empleado : listaEmpleados) {
            System.out.println(empleado.getApellido() + " "+ empleado.getNombre()+" " + empleado.getFechaContratacion());
        }

    }
}