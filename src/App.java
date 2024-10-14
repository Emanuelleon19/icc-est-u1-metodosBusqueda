import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        MetodosBusqueda metodosBusqueda = new MetodosBusqueda();
        // BUSQUEDA SECUENCIAL
        //int[] arreglo = {10,20,30,40,50,60,70,80,90,100};

        int[] arreglo = new int[100000];
        for(int i = 0; i < arreglo.length; i++){
            arreglo[i] = i + 1;
        }

        //metodosBusqueda.printArreglo(arreglo);
        long startTimeBinaria = System.nanoTime();
        int posicion = metodosBusqueda.busquedaSecuencial(arreglo, 50418);
        long endTimeBinaria = System.nanoTime();
        System.out.println("Tiempo de ejecucion: " + (endTimeBinaria - startTimeBinaria) + " nanosegundos");
        if(posicion != -1){
            System.out.println("El valor se encuentra en la posicion : " + posicion);
            System.out.println("El numero de iteraciones es: " + posicion+1);

        }else
        System.out.println("valor no encontrado 404");
        System.out.println("");
        

        // BUSQUEDA BINARIA
        //int[] arr = {10,20,30,40,50,60,70,80,90,100};

        int[] arr = new int[100000];
        for(int i = 0; i < arr.length; i++){
            arr[i] = i + 1;
        }

        //metodosBusqueda.printArreglo2(arr);
        long startTimeBinaria2 = System.nanoTime();
        int posicion2 = metodosBusqueda.busquedaBinaria(arr, 50418);
        long endTimeBinaria2 = System.nanoTime();
        System.out.println("Tiempo de ejecucion: " + (endTimeBinaria2 - startTimeBinaria2) + " nanosegundos");

        if(posicion2 != -1){
            System.out.println("El valor se encuentra en la posicion : " + posicion2);
        }else
        System.out.println("valor no encontrado 404");
    }
}
