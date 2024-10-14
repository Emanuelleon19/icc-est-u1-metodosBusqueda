public class MetodosBusqueda {
    public int busquedaSecuencial(int[] arreglo,int valorBuscar){
        for(int i = 0; i < arreglo.length; i++){
            if(arreglo[i] == valorBuscar){
                return i;
            }
        }
        return -1;
    }
    public void printArreglo(int[] arreglo){
        for (int elemento : arreglo){
            System.out.print(elemento + " ");
        }
    }

    public int busquedaBinaria(int[] arr, int value){
        int inicio = 0;
        int fin = arr.length -1;

        while(inicio <= fin){
            int medio = inicio + (fin - inicio)/2;

            if(arr[medio] == value){
                //elemento encontrado 
                return medio;
            }

            if(arr[medio] < value){
                inicio = medio + 1; // buscar en la mitad de la derecha
            }else{
                fin = medio - 1; // buscar en la mitad de la derecha
            }
        }
        return -1;
    }
    public void printArreglo2(int[] arr){
        for (int elemento : arr){
            System.out.print(elemento + " ");
        }
    }

}
