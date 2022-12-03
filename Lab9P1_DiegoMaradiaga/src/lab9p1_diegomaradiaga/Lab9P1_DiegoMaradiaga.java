package lab9p1_diegomaradiaga;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Lab9P1_DiegoMaradiaga {
    
    public static Scanner leer = new Scanner(System.in);
    static Random aleatorio = new Random();
    static Game G = new Game();
    
    public static void main(String[] args) {
       
    int opcion;    
    do{
        opcion=Integer.parseInt(JOptionPane.showInputDialog(""
                    + " >>>>>>>>>>>>    MENU    <<<<<<<<<<<\n"
                    + ""
                    + "1)  Game of life                    \n"
                    + "2)  Salir                           \n"
                    + "Ingrese su opcion: "));
        
        switch (opcion){
            case 1:
                int M1 [][]  = new int [10][10];
                int M2 [][]  = new int [10][10];
                ArrayList <String> coordenadas = new ArrayList <> ();
                
                M1 = imprimir(M1, M2, coordenadas);
                
                System.out.print("Ingrese el numero de rondas: ");
                int x  = leer.nextInt();
                G.setMatriz(M1);
                G.setMatrizNueva(M2);
                G.jugar(x);
                break;
        }
    } while (opcion != 2);
    
}//Fin main
    
     public static int [][] imprimir (int [][] Matriz1, int [][] Matriz2, ArrayList <String> coordenadas){
        //int temporal [][] = new int [filas][columnas];
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i==0 || i == 9 || j ==0 || j == 9){
                    Matriz1 [i][j] = 0;
                } else{
                    Matriz1 [i][j] = aleatorio.nextInt(2);
                    if (Matriz1[i][j]==1){
                        coordenadas.add(Integer.toString(i)+":"+Integer.toString(j));
                    }
                }
            }
        }
        G.setcoordenadas(coordenadas);
        return Matriz1;
    }//Fin metodo lectura
    
}//FIn clase
