
package algoritmosdeordenamiento;

import java.util.Scanner;

/**
 *
 * @author Pablo Siranaula
 */
public class Menu {
    public void generarMenu(){
        int opcion = 0;
        boolean asendente;
        boolean verPaso;
        int[] arr = null;
        Scanner teclado=new Scanner(System.in);
        MetodosDeOrdenamiento mOrdenamiento=new MetodosDeOrdenamiento();
        do{
            System.out.println("\n-----MENU PRINCIPAL-----");
            System.out.println("1. Ingrese un arreglo");
            System.out.println("2. Ordenar arreglo");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = validarOpcion(teclado);
            
            switch(opcion){
                case 1:
                    System.out.print("Ingrese el tamanio del arreglo: ");
                    int tamanio = validarArreglo(teclado);
                    arr = new int[tamanio];
                    for(int i = 0; i<tamanio; i++){
                        int po = i+1;
                        System.out.print("Ingrese los valores de su arreglo en la posicion "
                                +po+ " :");
                        arr[i] = validarNumero(teclado);
                    }
                    for(int arreglo : arr){
                        System.out.print(arreglo + " " );
                    }
                    break;
                case 2:
                    System.out.println("Escoja el metodo de ordenamiento");
                    System.out.println("1. Metodo Burbuja");
                    System.out.println("2. Metodo Seleccion");
                    System.out.println("3. Metodo Insercion");
                    System.out.println("4. Metodo Burbuja Mejorado");
                    System.out.println("0. Regresar al menu principal");
                    System.out.print("Ingrese una opcion: ");
                    opcion = validarOpcion(teclado);
                    switch(opcion){
                        case 1:
                            asendente = imprimirAsendente(teclado);
                            verPaso = imprimirPaso(teclado);
                            mOrdenamiento.metodoBurbuja(arr, asendente, verPaso);
                            break;
                        case 2:
                            asendente = imprimirAsendente(teclado);
                            verPaso = imprimirPaso(teclado);
                            mOrdenamiento.metodoSeleccion(arr, asendente, verPaso);
                            break;
                        case 3:
                            asendente = imprimirAsendente(teclado);
                            verPaso = imprimirPaso(teclado);
                            mOrdenamiento.metodoInsercion(arr, asendente, verPaso);
                            break;
                        case 4:
                            asendente = imprimirAsendente(teclado);
                            verPaso = imprimirPaso(teclado);
                            mOrdenamiento.metodoBurbujaAjustes(arr, asendente, verPaso);
                            break;
                        default:
                    }
                    break;
                case 0:
                    System.out.println("Gracias por utilizar el programa :)");
                    break;
            }
        }while(opcion >0);
        teclado.close();
    }
    
    public static int validarOpcion(Scanner teclado){
        int opcion = 0;
        while(!teclado.hasNextInt()){
            System.out.println("Error: No se aceptan letras; por favor intente de nuevo: ");
            teclado.next();
        }
        opcion = teclado.nextInt();
        return opcion;
    }
    public static int validarArreglo(Scanner teclado){
        int tamanio = 0;
        boolean numeroN = true;
         while(!teclado.hasNextInt()){
            System.out.println("Error: No se aceptan letras; por favor intente de nuevo: ");
            teclado.next();
        }
        tamanio = teclado.nextInt();
        while(tamanio <= 0){
            System.out.println("Error: Numero negativo" +
                    "\nNumero igual a 0" + "\nEl numero tiene que ser positivo; "+
                    "Por favor intente de nuevo : ");
            tamanio = teclado.nextInt();
        }
         
        return tamanio;
    }
    public static int validarNumero(Scanner teclado){
        int numero = 0;
        while(!teclado.hasNextInt()){
            System.out.println("Error: No se aceptan letras; por favor intente de nuevo: ");
            teclado.next();
        }
        numero = teclado.nextInt();
        return numero;
    }
    public static boolean imprimirAsendente(Scanner teclado){
        boolean asendente = true;
        int opcion;
        System.out.println("Escoja asendente o desendente");
        System.out.println("1. Ascendente");
        System.out.println("2. Desentente");
        opcion = validarOpcion(teclado);
        switch(opcion){
            case 2:
                asendente = false;
                break;
        }
        return asendente;
    }
    public static boolean imprimirPaso(Scanner teclado){
        boolean verpaso = true;
        int opcion;
        System.out.println("Quiere ver cada paso");
        System.out.println("1. Si");
        System.out.println("2. No");
        opcion = validarOpcion(teclado);
        switch(opcion){
            case 2:
                verpaso = false;
        }      
        return verpaso;
    }        
}
