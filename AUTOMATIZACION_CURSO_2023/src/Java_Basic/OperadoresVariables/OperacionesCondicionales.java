package Java_Basic.OperadoresVariables;

public class OperacionesCondicionales {
    public static void main(String[] args) {

        var a = 5;
        var resultado  =    a >= 0 && a<= 10 && a == 20; //Es en linea de codigo se declara &&, que es igual a And

        if (resultado){
            System.out.println("Dentro del rango");
        } else {
            System.out.println("Fuera del rango");
        }

        var vacaciones = false;
        var diaDescanso = true;
        var domingo = false;

        if (vacaciones || diaDescanso || domingo) // En esta linea de codigo se declara "0"
        {
            System.out.println("Puedo beber cerveza");
        }
        else {
            System.out.println("No puedo beber cerveza");

        }
    }
}
