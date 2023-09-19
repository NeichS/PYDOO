public class Fecha implements Comparable<Fecha> {
    private int dia, mes, anio;

    Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + anio;
    }

    @Override
    public int compareTo(Fecha otraFecha) {
        if (this.anio != otraFecha.anio) {
            return Integer.compare(this.anio, otraFecha.anio);
        } else if (this.mes != otraFecha.mes) {
            return Integer.compare(this.mes, otraFecha.mes);
        } else {
            return Integer.compare(this.dia, otraFecha.dia);
        }
    }
}
