import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Bienvenido(a) a Screen Match");
        System.out.println("\nPelicula: Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;
        double media = (8.2 + 6.0 + 9.0) / 3;
        double mediaEvaluacionUsuario = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println(media);

        String sinopsis = """ 
                Matrix es una paradoja
                la mejor película del fin del milenio
                Fué lanzada en:
                """ + fechaDeLanzamiento;

        System.out.println(sinopsis);

        int clasificacion = (int)(media / 2);
        System.out.println(clasificacion);

        if(fechaDeLanzamiento >= 2023){
            System.out.println("Pelicula Popular del momento");
        }else{
            System.out.println("Pelicula retro que vale la pena ver");
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingresa la nota que le darias a Matrix");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix / 3;
        }

        System.out.println("La media de la pelicula Matrix " +
                "calculada por el usuario es " + mediaEvaluacionUsuario);

        /*for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }*/
    }
}