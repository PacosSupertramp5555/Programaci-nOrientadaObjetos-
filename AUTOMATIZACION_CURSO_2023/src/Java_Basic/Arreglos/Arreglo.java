package Java_Basic.Ciclos;

public class Arreglo
{
    public static void main(String[] args) {

        int numeros[] = new int[5];

        numeros [0] = 52;
        numeros [1] = 125;
        numeros [2] = 654;
        numeros [3] = 478;
        numeros [4] = 52;

        for (int i = 0; i<=2; i++){

            System.out.println("[" + numeros[i] + "]");
        }
    }
}
