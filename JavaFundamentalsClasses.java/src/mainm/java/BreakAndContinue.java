


public class BreakAndContinue {
    
    public static void main( String [] args){
        
        for(int i = 0; i <= 10; i++){
            System.out.println("Valor de i " +i);
            if(i == 5){
                System.out.println("Saltar a la siguiente ejecución");
                
                continue;
                
            }
    System.out.println("NO ME EJECUTARÉ EN 5");
    }
}
}
