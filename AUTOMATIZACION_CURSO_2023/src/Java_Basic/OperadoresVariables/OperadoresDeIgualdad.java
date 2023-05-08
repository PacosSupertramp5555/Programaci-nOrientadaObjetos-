package Java_Basic.OperadoresVariables;

public class OperadoresDeIgualdad
{
    public static void main(String[] args) {
        var a = 5;
        var b = 4;

        var c = (a==b);
        System.out.println("c = " + c);

        var cadena = "Hola";
        var cadenaDos = "Hola";
        var validacion = cadena == cadenaDos;
        System.out.println("El resultado es: " + validacion); // Compara referencias de objetos

        var validacionDos = cadena.equals(cadenaDos); // Equals es igual a igual
        System.out.println("El resultado es: " + validacionDos);
    }
}
