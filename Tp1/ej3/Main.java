
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
   public static void main(String[] args) {
       Numero num1 = new Numero(9);
       Numero num2 = new Numero(47);
       
       Numero resultado = num1.sumar(num2);
       
       System.out.println("El resultado de 9 + 47 es: " + resultado.getter());
       
       Numero num_aux = new Numero(0);
       
       /**num_aux.setter(num1);
       num1.setter(num2);
       num2.setter(num_aux);
       
       Numero resultado_dos = num1.sumar(num2);**/
       
       System.out.println("El resultado de 9 + 47 despues del intercambio de referencias es: " + resultado.getter());
       
       Numero valor = new Numero(47);
       num1.setter(valor);
       
       System.out.println("Valor de la primera referencia cambiada: " + num1.getter() + " valor de la segunda referencia:" + num2.getter() );
   }
}
