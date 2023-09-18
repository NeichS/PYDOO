public class EmpleadoHora extends Empleado{
    private int horas;
    static int valorHora = 50;

    EmpleadoHora(String nombre, String apellido,Fecha fechaContratacion, Fecha fechaCumpleanios, int horas) {
        super(nombre, apellido, fechaContratacion,fechaCumpleanios);
        this.horas = horas;
    }

    @Override
    public int calcularSalario() {
        return horas*valorHora;
    }
}
