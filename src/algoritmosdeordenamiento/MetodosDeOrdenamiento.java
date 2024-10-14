
package algoritmosdeordenamiento;

import java.util.Arrays;

/**
 *
 * @author Pablo Siranaula
 */
public class MetodosDeOrdenamiento {
    public int[] metodoBurbuja(int[] arreglo, boolean asendente, boolean verPaso){
        int[] arr = Arrays.copyOf(arreglo, arreglo.length);
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            if(verPaso){
            System.out.println("Pasada: "+(i+1));
            }
            for(int j=i+1; j<n; j++){
                if(verPaso){
                System.out.println(Arrays.toString(arr)+"\t"
                        +"PosMenor= "+i+" Pos j= "+j);
                }
                if(asendente
                ?arr[i] > arr[j] : arr[i] < arr[j]){
                    int aux = arr[i];
                    arr[i] = arr[j];
                    arr[j] = aux;
                }
            }
        }
        System.out.println("Arreglo ordenado: "+Arrays.toString(arr)+"\n" );
        return arr;
    }
    public int[] metodoSeleccion(int[] arreglo,boolean asendente, boolean verPaso){
        int[] arr = Arrays.copyOf(arreglo, arreglo.length);
        int n = arr.length;
        int indice;
        for(int i=0; i<n-1; i++){
            indice = i;
            if(verPaso){
            System.out.println("Pasada: "+(i+1));
            }
            for(int j= i+1; j<n; j++){
                if(verPaso){
                System.out.print(Arrays.toString(arr)+"\t"+"PosMenor= "+indice+" Pos j= "+j+"\n");
                }
                if(asendente
                        ? arr[j] < arr[indice] : arr[j] > arr[indice]){
                    indice = j;
                }
            }
            int aux = arr[indice];
            arr[indice] = arr[i];
            arr[i] = aux;
        }
            System.out.println("Arreglo ordenado: "+Arrays.toString(arr)+"\n");
        return arr;
    }
    public int[] metodoInsercion(int[] arreglo, boolean asendente, boolean verPaso){
        int[] arr = Arrays.copyOf(arreglo, arreglo.length);
        int n = arr.length;
        int pasadas = 1;
        for(int i= 1; i<n; i++){
            if(verPaso){
            System.out.println("Pasada: "+pasadas);
            }
            int aux = arr[i];
            int j = i-1;
            if(verPaso){
             System.out.println(Arrays.toString(arr)+"\t"
                        +"valor a= "+ arr[j]+" valor b= "+arr[i]);
            }
            while(asendente
                    ? j >=0 && arr[j] > aux : j >=0 && arr[j] > aux){
                arr[j+1] = arr[j];
                j--;
                if(verPaso){
                 System.out.println(Arrays.toString(arr)+"\t"
                        +"valor a= "+ arr[j+1]+" valor b= "+aux);
                }
            }
            arr[j+1] = aux;
            pasadas++;
        }
        System.out.println("Arreglo ordenado: "+Arrays.toString(arr));

        return arr;
    }
    public int[] metodoBurbujaAjustes(int[] arreglo, boolean asendente, boolean verPaso){
        int[] arr = Arrays.copyOf(arreglo, arreglo.length);
        int n = arr.length;
        for(int i= 0; i<n-1; i++){
            if(verPaso){
            System.out.println("Pasada: "+(i+1));
            }
            for(int j=0; j<n-1-i; j++){
                if(verPaso){
                System.out.println(Arrays.toString(arr)+"\t"
                        +"valor a= "+ arr[j]+" valor b= "+arr[j+1]);
                }
                if(arr[j] > arr[j+1]){
                    int aux = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = aux;
                }
                
            }
        }
        System.out.println("Arreglo ordenado: "+ Arrays.toString(arr));
        return arr;
    }
}
