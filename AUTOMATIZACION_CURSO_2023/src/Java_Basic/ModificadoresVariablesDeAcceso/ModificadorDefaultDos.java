package Java_Basic.ModificadoresVariablesDeAcceso;

class ModificadorDefaultDos {

    public static void main(String[] args) {

        ModificadorDefault objModificadorDefault = new ModificadorDefault(); // Me esta haciendo referencia a mi objeto
        ModifiadorPublic objModificadorPublic = new ModifiadorPublic();
        objModificadorDefault.ejemplo();
        objModificadorDefault.ejemploDos();
        objModificadorPublic.ejemploCuatro();



        /* En este modificador de acceso nos permite acceder a los metodos y atributos de la clase, simpre se encuentre en el mismo package,
         al utilizar el modificador de acceso, nos devolveria un errorde compilacion*/
    }
}
