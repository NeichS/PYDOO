import java.util.Comparator;

public class CompararPorFechaContrat implements Comparator<Empleado> {
    @Override
    public int compare(Empleado empleado, Empleado otroEmpleado) {
        return empleado.getFechaContratacion().compareTo(otroEmpleado.getFechaContratacion());
    }
}
