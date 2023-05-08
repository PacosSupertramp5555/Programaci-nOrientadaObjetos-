package Java_Basic.Clases_Y_Objetos;

public class PruebaPersona

{
    public static void main(String[] args) {

        Persona objPersona = new Persona();

        objPersona.nombre = "Francisco";
        objPersona.apellido = "Patlan";
        objPersona.edad =  100;
        objPersona. genero = "Masculino";
        objPersona.nacionalidad = "Mexicano";
        objPersona.MostrarInformacion();
    }
}
