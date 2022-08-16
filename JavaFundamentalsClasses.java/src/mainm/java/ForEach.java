


public class ForEach {
    public static void main (String [] args){
         String[] nombres = {"JOSE1", "JOSE2", "JOSE3", "JOSE4", "JOSE5"};
         int c = 0;
         while(c < nombres.length){
             System.out.println(nombres[c]);
             c++;
             
         }
         
         for(int i= 0; i < nombres.length; i++){
             System.out.println(nombres[i]);
             
         }
         for(String dato: nombres){
             System.out.println(dato);
         }
    }
               
}
