

import java.sql.SQLOutput;
import java.util.Scanner;
/*
Ejercicio 8
Queremos guardar los nombres y la edades de los alumnos de un curso. Realiza un programa que
introduzca el nombre y la edad de cada alumno. El proceso de lectura de datos terminará cuando se
introduzca como nombre un asterisco (*) Al finalizar se mostrará los siguientes datos:
Todos lo alumnos mayores de edad.
Los alumnos mayores (los que tienen más edad)
 */
public class Curso {
    String[] nombre;
    int[]   edad;
    int cont;
    int aux;
    String p;

    Scanner entrada;

    public Curso(){
        //El problema no especifica la cantidad de alumnos suponemos que son 100
        nombre = new String[100];
        edad = new int[100];
        cont = 0;
        p = "*";
        entrada = new Scanner(System.in);
    }

    public void pedirDatos(){
        //Pedimos los datos del alumno
        System.out.println("Los datos del alumno");
        for(int i=0; i< nombre.length; i++){
            System.out.print("\nDigite el nombre["+i+"]:");
            nombre[i] = entrada.next();

            if(nombre[i].equals(p)){
                break;
            }
            else{
                System.out.print("Digite la edad["+i+"]:");
                edad[i] = entrada.nextInt();
            }
            cont++;

        }
    }
    public void ordenarDatos(){
        //Metodo Burbuja ordenamos el vector
        for(int i=0 ; i< (cont-1) ;i++){
            for (int j=0; j< (cont-1);j++){
                if(edad[j]>edad[j+1]){
                    aux=edad[j];
                    edad[j]=edad[j+1];
                    edad[j+1]=aux;
                }
            }
        }
    }
    public void mostrarDatos(){

        System.out.println("\n");
        System.out.print("De Mayor a menor edad: ");
        for (int i =(cont-1); i>=0; i--){
            System.out.print(edad [i] +"  -  ");
        }
        System.out.println("\n");
    }
}
