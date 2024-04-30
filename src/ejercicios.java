import java.util.Scanner;

public class ejercicios {
    public static void main(String args []){
        String nombreCompleto = "Erick Jesús";
        String apellidoPaterno = "Dublan";
        String apellidoMaterno = "Limón";

        int edad = 30;
        String mensaje = """
                Buen día mi nombre es:
                """ + nombreCompleto + " " + apellidoPaterno + " " + apellidoMaterno +" y tengo la edad de: " +edad
                ;

        System.out.println(mensaje);

        String celsius = "";
        Scanner entradaEscaner = new Scanner(System.in);
        System.out.println("Ingrese temperatura Celsius");
        celsius = entradaEscaner.nextLine();

        int temperatura = Integer.parseInt(celsius);

        double formula = (temperatura * 1.8)+32;

        System.out.println("La temperatura de Celsius a Fahrenheit es: " + formula);
    }
}
