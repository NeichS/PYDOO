public class EmpleadoSubordinado extends Empleado{
    private static int valorArticulo = 30;
    private int cantidadVentas;

    EmpleadoSubordinado(String nombre, String apellido,Fecha fechaContratacion, Fecha fechaCumpleanios, int cantidadVentas) {
        super(nombre, apellido, fechaContratacion, fechaCumpleanios);
        this.cantidadVentas = cantidadVentas;
    }

    @Override
    public int calcularSalario() {
        return cantidadVentas*valorArticulo;
    }
}
