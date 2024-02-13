/* El granjero tiena un caballo Banco que usa para tirar de un carro,
 * hace dos años que lo tiene y espera que lo ayude en su trabajo diario.
 * El caballo Braulio (así es su nombre) como más de lo que produce:
 * 1250.40 pesos semanales. Pero a pesar de eso, lo conservará porque
 * la raza de caballos criollos es muy noble.
 * Arma las variables para guardar la información del caballo Braulio */

public class Caballo {
    public static void main(String[] args) {
        String color = "blanco";
        String nombre = "Braulio";
        int edad = 2;
        Double consumo = 1250.4;
        Boolean raza = true; // si es true, es criollo

        System.out.println("********Biemvenidos************"); // sout
        System.out.println("Datos del equino: " + nombre + ", edad: " + edad + ", Es criollo?: " + raza);
    }
}
