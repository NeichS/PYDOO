public class EmpleadoComision extends Empleado{
    private int salarioUniforme, porcentajeVentas;

    EmpleadoComision(String nombre, String apellido,Fecha fechaContratacion, Fecha fechaCumpleanios, int salarioUniforme, int porcentajeVentas) {
        super(nombre, apellido, fechaContratacion, fechaCumpleanios);
        this.salarioUniforme = salarioUniforme;
        this.porcentajeVentas = porcentajeVentas;
    }

    @Override
    public int calcularSalario() {
        return salarioUniforme + (salarioUniforme*porcentajeVentas)/100;
    }
}
