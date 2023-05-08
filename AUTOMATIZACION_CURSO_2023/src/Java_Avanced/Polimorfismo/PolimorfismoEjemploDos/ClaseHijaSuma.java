package Java_Avanced.Polimorfismo.PolimorfismoEjemploDos;

public class ClaseHijaSuma extends ClasePadre
{
    @Override // ----> A esto se le conoce como sobreescribir metodos, es decir cuando utilizamos el poliformismo.
    public void Operaciones()
    {
        resultado = valorUno + valorDos;


    }
}
