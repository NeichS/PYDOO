public abstract class Empleado implements Comparable<Empleado>{
    String nombre, apellido;
    Fecha fechaContratacion, fechaCumpleanios;

    Empleado(String nombre, String apellido,Fecha fechaContratacion, Fecha fechaCumpleanios) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaContratacion = fechaContratacion;
        this.fechaCumpleanios = fechaCumpleanios;
    }

    @Override
    public int compareTo(Empleado otroEmpleado) {
        return this.apellido.compareTo(otroEmpleado.apellido); //Comparable te hace impementar este metodo en el cual elegis el criterio por el cual se ordena el contenedor
    }

    public abstract int calcularSalario();

    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return  apellido;
    }
    public Fecha getFechaContratacion() {
        return  fechaContratacion;
    }
    public Fecha getFechaCumpleanios() {
        return  fechaCumpleanios;
    }

}
