/* Para representar cada una de las características de las mascotas, crear una
variable y darle el valor correspondiente en el IDE IntelliJ. No olvidar darle
el tipo adecuado a lo que queremos que contenga. Por cada mascota de la veterinaria
que figura en la siguiente tabla, vamos a tener que mostrar la información del
animal. La información va a mostrarse como el siguiente ejemplo:

“Manchitas tiene 2 años”
“Manchitas come un kilo y medio y hace guau guau” */
public class Perro {
    public static void main(String[] args) {
        String nombre = "Manchitas";
        Integer edad = 2;
        String consumo = "1 kilo y medio";
        String sonido = "guau guau";


        System.out.println(nombre + " tiene " + edad + " años");
        System.out.println(nombre + " come " + consumo + " y hace " + sonido);
    }
}
