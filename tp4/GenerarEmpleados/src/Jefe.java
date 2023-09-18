public class Jefe extends Empleado{
    int salarioFijo;

    Jefe(String nombre, String apellido,Fecha fechaContratacion, Fecha fechaCumpleanios,int salarioFijo) {
        super(nombre, apellido, fechaContratacion, fechaCumpleanios);
        this.salarioFijo = salarioFijo;
    }

    @Override
    public int calcularSalario() {
        return salarioFijo;
    }
}
