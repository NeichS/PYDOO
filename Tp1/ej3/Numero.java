
/**
 * Write a description of class Numero here.
 *
 * @Neich
 * @8/17/2023
 */
public class Numero
{
    private int valor;
    
    public Numero(int valor) {
        this.valor = valor;
    }
    
    public int getter() {
        return this.valor;
    }
    
    public Numero sumar(Numero otroNumero) {
        int nuevoValor = this.valor + otroNumero.valor;
        return new Numero(nuevoValor);
    }
    
    public void setter(Numero nuevo_valor) {
        this.valor = nuevo_valor.valor;
    }
    
    
}
