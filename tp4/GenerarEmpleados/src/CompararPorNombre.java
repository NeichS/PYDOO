import java.util.Comparator;

public class CompararPorNombre implements Comparator<Empleado> {
    @Override
    public int compare(Empleado empleado, Empleado otroEmpleado) {
        return empleado.getNombre().compareTo(otroEmpleado.getNombre());
    }
}
