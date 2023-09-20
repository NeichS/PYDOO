import java.util.Comparator;

public class CompararPorFechaCumple implements Comparator<Empleado> {
    @Override
    public int compare(Empleado empleado, Empleado otroEmpleado) {
        return empleado.getFechaCumpleanios().compareTo(otroEmpleado.getFechaCumpleanios());
    }
}
