package Java_Avanced.Polimorfismo.SobreCargaDeMetodo;

public class SobreCargaDeMetodo

{
    public void suma(int a, int b)
    {
        System.out.println("resultado : " +(a + b));

    }
    public void suma(int a, int b, int c)
    {
        System.out.println("resultado: " +( a + b + c));

    }

    public static void main(String[] args)
    {
        SobreCargaDeMetodo objSobreCarga = new SobreCargaDeMetodo();
        objSobreCarga.suma(100, 100);
        objSobreCarga.suma(200, 200, 200);
    }
}
