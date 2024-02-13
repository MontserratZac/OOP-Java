/* Definir dos números enteros. Asignarles un valor a cada uno. Comprobar
si un número es divisible por el segundo e indicar mediante un mensaje el
resultado obtenido. */
public class If {
    public static void main(String[] args) {
        int primerNumero = 50;
        int segundoNumero = 10;
        int residuo = primerNumero % segundoNumero;

        if(residuo == 0) {
            System.out.println("El número " + primerNumero + " es divisible entre " + segundoNumero);
        } else {
            System.out.println("El número " + primerNumero + " no es divisible entre " + segundoNumero);
        }
    }


}
