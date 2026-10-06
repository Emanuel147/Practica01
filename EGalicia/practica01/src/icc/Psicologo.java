import java.util.Scanner;

/**
* Programa que simula una sesión con un psicólogo
* El objetivo es familiarizarce con la creación y yso de objetos de la clase String
* @author Emanuel Tonahuayoltzin Galicia Rosas
* @version 1a edición
*/

public class Psicologo{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in); // Creacion del objeto in de la clase Scanner
        String nombre, problema; // Creacion de objetos nombre y problema de la clase String
        System.out.println("Bienvenido, cual es su nombre?");
        nombre = in.nextLine(); // Asignacion del String nombre con el metodo nextLine()
        System.out.println("Buenas tardes " + nombre);
        System.out.println("Digame, cuál es su problema en la vida?");
        problema = in.nextLine(); // Asignaicon del String problema
        System.out.println("MMM... ya veo\nY digame...");
        System.out.println("Por qué dice " + '\"' + problema + '\"');
        in.nextLine();
        System.out.println("Muy interesante!! Hablaremos de ello con más detalle en la siguiente sesión.");
    }
}
