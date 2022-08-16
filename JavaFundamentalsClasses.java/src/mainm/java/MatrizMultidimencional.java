


public class MatrizMultidimencional {
    
 public static void main(String [] args){

int[][] x = new int[2][3];

        x [0][0] = 1;
        x [0][1] = 2;
        x [0][2] = 3;
        
        x [1][0] = 4;
        x [1][1] = 5;
        x [1][2] = 6;
        
        for (int[] matrizInterna: x) {
            //Segundo for iterar datos de cada array 
            for(int dato: matrizInterna) {
                System.out.println(dato);
}
        }
 }
}