package Java_Avanced.Costructores;
import java.util.Scanner;
public class ConConstructor
{
   public ConConstructor()
   {
       Scanner entrada = new Scanner(System.in);
       String nombre     = "";

       System.out.printf("¿Cual es tu nombre?");
       nombre = entrada.nextLine();
       System.out.printf("Tu nombre es : " + nombre);

   }
}
