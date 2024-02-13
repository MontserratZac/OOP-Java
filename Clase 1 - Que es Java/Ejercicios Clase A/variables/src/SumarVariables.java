/* Crea dos variables, numeroEntero y numeroConComa,
   Asígnales un valor acorde a su tipo a cada variable, el valor puede ser
   cualquiera mientras que respetes el tipo de dato.
   Luego vas a declarar la variable suma de tipo double,
   sumar ambos valores y asignárselos a suma/
 */

public class SumarVariables {

    public static void main(String[] args) {
        int numeroEntero = 5;
        double numeroConComa = 5.7;

        double suma = (double)numeroEntero + numeroConComa;

        System.out.println("La suma del número entero " + numeroEntero + " + el número con coma " + numeroConComa + " es igual a: " + suma);

    }
}
