package Java_Basic.ClaseScanner;

import java.util.Scanner;
public class ClaseScanner
{
    public static void main(String[] args)
    {
        System.out.println("Escribe tu nombre");
        Scanner consola = new Scanner(System.in); // Esta funcion nos sirve para enviar informacion a la consola
        var usuario = consola.nextLine();
        System.out.println("Nombre : " + usuario);
        System.out.println("Escribe tu profsion");
        var profesion = consola.nextLine();
        System.out.println("Usuario: " + profesion +  " " + usuario);
    }
}
