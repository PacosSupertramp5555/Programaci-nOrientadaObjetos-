package Java_Basic.Clases_Y_Objetos;

public class Persona

{
    //Atributos
    String nombre;
    String apellido;
    int edad;
    String nacionalidad;
    String genero;

    public void MostrarInformacion (){

    System.out.println("Nombre: " + nombre);
    System.out.println("Apellido: " + apellido);
    System.out.println("Edad: " + edad);
    System.out.println("Nacionalidad: " + nacionalidad);
    System.out.println("Genero: " + genero);

        System.out.println("Informacion del usuario: " + nombre + apellido + ", " + edad + nacionalidad + genero);
    }
}
