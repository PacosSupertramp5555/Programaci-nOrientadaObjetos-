package Java_Basic.Metodos;

public class Aritmetica
{
    //Atributos

    int a;
    int b;
    int resultado;

    // Metodo Sumar

    public void sumar (){

        int resultado = a + b;
        System.out.println("Resultado = " + resultado);
    }
    public int SumarConRetorno(){
        int resultado = a + b ;
        return  resultado;
        //return a + b;   ---->>> Este es el correcto pero se queda comentado
    }


    public int SumarConParametros(int param1, int param2){

        a = param1;
        b = param2;
        return a + b;

    }
}
