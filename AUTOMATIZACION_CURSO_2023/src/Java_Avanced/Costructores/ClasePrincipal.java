package Java_Avanced.Costructores;

import java.util.Scanner;

public class ClasePrincipal
{
    public static void main(String[] args)
    {
        SinCostructor sin = new SinCostructor();
        sin.PedirNombre();
        sin.imprimir();
        //Instancia a la clase que tiene el construtor
        ConConstructor con = new ConConstructor();
    }
}
