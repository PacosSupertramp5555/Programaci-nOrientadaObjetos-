package Java_Avanced.Costructores;

import java.util.Scanner;
public class SinCostructor

{

    private Scanner entrada = new Scanner(System.in);
    String nombre = "";

    public void PedirNombre()
    {
        System.out.printf("Cual es tu nombre");
        nombre = entrada.nextLine();


    }
    public void imprimir()
    {
        System.out.printf("tu nombre es : " + nombre);


    }

}
