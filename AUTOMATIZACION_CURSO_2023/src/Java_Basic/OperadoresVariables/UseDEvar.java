package Java_Basic.OperadoresVariables;

public class UseDEvar
{
    public static void main(String[] args){
   //Uso de la palabra reservada "var", infiere en los tipos de datos
        var intEntera = 10;
        System.out.println(intEntera);
        var miNombre = "Francisco";

        // Concatenación de variables
        System.out.println("miNombre = " + miNombre);
        // Concatenación de variables Ejemplo 2
        var usuario = "Patlan";
        var ocupacion = "Tester";
        var perfil = ocupacion + " " + usuario;
        System.out.println("Perfil :" + perfil);

        var i = 3;
        var j = 4;

        System.out.println("Resultado: " + (i + j)); // Se realiza la suma dado que no hay un texto previo
        System.out.println(i + j + " " + perfil); // Cadena de contexto

    }
}
