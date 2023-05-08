package Java_Basic.Tarea_1;

public class tareaUno {

    public static void main(String[] args) {


        String Nombre_del_alumno = "Francisco";
        int matematicas = 5;
        int biologia = 5;
        int quimica = 7;

        int promedio = ((matematicas + biologia + quimica)/3);

        if ( promedio >= 5.5){
            System.out.println("El alumno " + Nombre_del_alumno + " aprobo con: " + ((matematicas + biologia + quimica) / 3)  );

        }else {
            System.out.println("El alumno " + Nombre_del_alumno + " reprobo con: " + ((matematicas + biologia + quimica) / 3) );
        }
    }
}
