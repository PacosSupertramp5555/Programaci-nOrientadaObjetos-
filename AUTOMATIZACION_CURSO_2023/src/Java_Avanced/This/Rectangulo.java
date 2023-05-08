package Java_Avanced.This;

public class Rectangulo

{
    private int base, altura, area;
    public Rectangulo(int base, int altura){

        this.base = base;
        this.altura = altura;

    }
    public void CalculoArea()
    {
        area = base * altura;
    }
    public void Imprimir()
    {
        CalculoArea();
        System.out.printf("El area es: " + area);

    }
}
