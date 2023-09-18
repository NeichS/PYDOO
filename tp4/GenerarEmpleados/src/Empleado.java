public abstract class Empleado {
    String nombre, apellido;
    Fecha fechaContratacion, fechaCumpleanios;

    Empleado(String nombre, String apellido,Fecha fechaContratacion, Fecha fechaCumpleanios) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaContratacion = fechaContratacion;
        this.fechaCumpleanios = fechaCumpleanios;
    }

    public abstract int calcularSalario();

    public String getNombre() {
        return nombre;
    }
}
