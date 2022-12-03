package lab9p1_diegomaradiaga;

import java.util.ArrayList;

public class Game {
    
    private int [][] Matriz;
    private int [][] MatrizNueva;
    private int x;
    private ArrayList<String> coordenadas;
    public Game(){
        
    }//Constructor

    public int[][] getMatrizNueva() {
        return MatrizNueva;
    }

    public void setMatrizNueva(int[][] MatrizNueva) {
        this.MatrizNueva = MatrizNueva;
    }
    
    public int[][] getMatriz() {
        return Matriz;
    }

    public void setMatriz(int[][] Matriz) {
        this.Matriz = Matriz;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public ArrayList<String> getcoordenadas() {
        return coordenadas;
    }

    public void setcoordenadas(ArrayList<String> coordenadas) {
        this.coordenadas = coordenadas;
    }
    
    public void jugar(int x){
         for (int i = 0; i < x; i++) {
             System.out.println(Print(coordenadas));;
             NextGen();
         }
        
    }
    public void NextGen (){
        
        int cont=0; 
        
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
            cont=0;
            if(i+1 < 10 && i-1 > -1 && j+1 < 10 && j-1 > -1) {
                if (Matriz[i-1][j-1]==1){
                    cont++;
                }
                if (Matriz[i-1][j]==1){
                    cont++;
                }
                if(Matriz[i-1][j+1]==1){
                    cont++;
                }
                if(Matriz[i][j-1]==1){
                    cont++;
                }
                if(Matriz[i][j+1]==1){
                    cont++;
                }
                if(Matriz[i+1][j-1]==1){
                    cont++;
                }
                if(Matriz[i+1][j]==1){
                    cont++;
                }
                if(Matriz[i+1][j+1]==1){
                    cont++;
                }
            }
           
            
 
                if (cont < 2) {
                    MatrizNueva[i][j] = 0;
                } else if (cont == 2) {
                    MatrizNueva[i][j] = 1;
                } else if (cont == 3) {
                    MatrizNueva[i][j] = 1;
                } else if (cont > 3) {
                    MatrizNueva[i][j] = 0;
                }
                
                if (MatrizNueva[i][j] == 1) {
                    coordenadas.add(Integer.toString(i) + ":" + Integer.toString(j));
                }
            }
        }
        System.out.println(coordenadas);
        System.out.println("");
        Matriz = MatrizNueva;
        MatrizNueva = new int [10][10];
       /* for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                
            }
        }
*/
        
        
        
    }
    public String Print(ArrayList<String> x){
        int [][] temporal = new int [10][10];
        String coordenadaxy = "";
       
        
        for (int i = 0; i < x.size(); i++) {
           String [] C = x.get(i).split(":");
           temporal[Integer.parseInt(C[0])][Integer.parseInt(C[1])] = 1;
        }//Fin for
        
        for (int k = 0; k < 10; k++) {
            for (int l = 0; l < 10; l++) {
                coordenadaxy+="["+temporal[k][l]+"]";
            }
            coordenadaxy+="\n";
        }
        return coordenadaxy;
    }
   
}

