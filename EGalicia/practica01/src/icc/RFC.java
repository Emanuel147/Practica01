import java.util.Scanner;

/**
* Programa para generar una clave al estilo del RFC
* El objetivo utilizar Strings y algunos metodos de la clase
* @author Emanuel Tonahuayoltzin Galicia Rosas
* @version 1a edición
*/

public class RFC{
    public static void main(String[] args){
        // Asignacion de variables a utilizar
        Scanner in = new Scanner(System.in);
        String nombreCompleto = new String();
        String fechaNacimiento = new String();
        char inicialNombre, inicialMaterno;
        String rfc, inicialPaterno, año, mes, dia;
        int posicion; // Variable determinar la posicion de ' ' en nuestro string

        // Pedir al usuario el nombre completo y la fecha de nacimiento
        System.out.println("Dame el nombre completo (Empezando con nombre, apellido paterno y materno)");
        nombreCompleto = in.nextLine(); // Asgnacion del nombre completo a nuestro string
        System.out.println("Ingresa la fecha de nacimiento en formato dd/mm/aa");
        fechaNacimiento = in.nextLine(); // Asignacion de la fecha de nacimiento

        // Obtener las iniciales del rfc
        nombreCompleto = nombreCompleto.trim(); // Utilizamos el metodo trim() para eliminar espacion vacios al final de la cadena
        inicialNombre = nombreCompleto.charAt(0);// Obtiene la inicial del Nombre basandonos en la primera posicion de la cadena, que corresponde a la primera inicial
        posicion = nombreCompleto.indexOf(' ') + 1; // Asignamos la posicion del primer " " en la cadena y le sumamos uno, de tal forma que obtengamos la posicion del apellido paterno
        inicialPaterno = nombreCompleto.substring(posicion, posicion + 2); // Obtiene un substring de los primeros dos caracteres de nuestro string nombreCompleto
        posicion = nombreCompleto.indexOf(' ', posicion) + 1; // Repetimos la asignacion del elemento ' ' pero a partir de nuestra posicion anterior, de esta forma encuentra el segundo ' ' en la cadena
        inicialMaterno = nombreCompleto.charAt(posicion);

        // Manipular la fecha de nacimiento dd/mm/aa
        dia = fechaNacimiento.substring(0, 2); // Toma los primeros dos elementos de fechaNacimiento dd/mm/aa. (empezando a contar desde 0)
        mes = fechaNacimiento.substring(3, 5); // Toma los elementos 3 y 4 que corresponden a los valores del mes en dd/mm/aa
        año = fechaNacimiento.substring(6); // Toma los ultimos elementos elementos del string a partir del 6

        // Armar el RFC
        rfc = (inicialPaterno + inicialMaterno + inicialNombre + año + mes + dia).toUpperCase(); // Hacemos una concatenacion de todos los elementod en el orden solicitado
                                                                                                 // y mandamos a llamar la funcion toUpperCase() para convertir nuesto string a mayuscuas
        System.out.println("El RFC de Andrea Lopez es: " + rfc); // Por ultimo le mostramos al usuario el rfc ya terminado
    }
}
