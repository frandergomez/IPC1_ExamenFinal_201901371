package menu_examen_final;

import java.util.Scanner;
import java.util.Iterator;

public class Menu_Examen_Final {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("***** EXAMEN FINAL *****");
        System.out.println(" 1. Programa 1 ==>> ");
        System.out.println(" 2. Programa 2 ==>> ");
        System.out.println(" 3. Programa 3 ==>> ");
        System.out.println(" 4. Salir ");
        
        System.out.println("Seleccione una opción: ");
        
        int opcion = scanner.nextInt();
        
        switch(opcion){
            case 1:
                programa1();
                break;
            case 2:
                programa2();
                break;
            case 3:
                programa3();
            case 4:
                salir();
                break;
                
        }
    }
    static void programa1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("***Numero mayor y menor***");
        
        System.out.println("Digite la cantidad de numero a evaluar");
        
        int cantidadNumeros = scanner.nextInt();
        
        int numeroMenor = 0;
        int numeroMayor = 0;
        
        for (int i = 0; i < cantidadNumeros; i++){
            System.out.println("Digite el numero en la posicion "+(i+1));
            int tmp = scanner.nextInt();
            if (i==0){
                numeroMenor = tmp;
                numeroMayor = tmp;
            }else if (tmp<numeroMenor){
                numeroMenor = tmp;
            }
            if (tmp > numeroMayor){
                numeroMayor = tmp;
            }
        }
        System.out.println("El numero menor es "+numeroMenor);
        System.out.println("El numero mayor es "+numeroMayor);
    }
    
    static void programa2(){
        Scanner piramide = new Scanner(System.in);
        System.out.println("***Triangulo con asteriscos***");
        System.out.println("Ingresar el numero para el triangulo");
        int filas = piramide.nextInt();
        piramide.close();
        
        System.out.println();
        for(int alto = 1; alto <= filas; alto++) {
            //Espacios
            for(int espacio = 1; espacio <= filas-alto; espacio++){
                System.out.print(" ");
            }
            //Asteriscos
            for(int asteriscos = 1; asteriscos <=(alto*2)-1; asteriscos++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
    static void programa3(){
        System.out.println("***Vacas Jutiapa***");
        int matriz [][] = new int[3][];
                
                //Llenado de matriz
                matriz[0][0] = 1;
                matriz[0][1] = 223;
                matriz[0][2] = 30;
                matriz[1][0] = 2;
                matriz[1][1] = 243;
                matriz[1][2] = 34;
                matriz[2][0] = 3;
                matriz[2][1] = 100;
                matriz[2][2] = 28;
                matriz[3][0] = 4;
                matriz[3][1] = 200;
                matriz[3][2] = 45;
                matriz[4][0] = 5;
                matriz[4][1] = 200;
                matriz[4][2] = 31;
                matriz[5][0] = 6;
                matriz[5][1] = 155;
                matriz[5][2] = 50;
                matriz[6][0] = 7;
                matriz[6][1] = 300;
                matriz[6][2] = 29;
                matriz[7][0] = 8;
                matriz[7][1] = 150;
                matriz[7][2] = 1;
                //Imprimir matriz
                imprimir(matriz);
                
                //Suma de columnas
                for(int i = 0; i < matriz[0].length; i++){
                    int suma = 0;
                    for(int j = 0; j < matriz.length; j++){
                        suma += matriz[j][i];
                    }
                    System.out.println("La suma de la columna "+(i+1)+"es: "+ suma);
    }
    }
    public static void imprimir (int matriz[][]){
        for(int i = 0; i < matriz.length; i++){
            for( int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println();
        }
    }
    
    static void salir(){
        System.out.println("***Fin del programa***");
        System.exit(0);
    }
}
