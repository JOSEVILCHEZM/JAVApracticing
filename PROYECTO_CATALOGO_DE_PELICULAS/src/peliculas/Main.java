
package peliculas;

import javax.swing.JOptionPane;

public class Main {

  
    public static void main(String[] args) {
        //ALGUNAS MODIFICACIONES
        /*JOptionPane.ERROR_MESSAGE.     ->0
        *JOptionPane.INFORMATION_MESSAGE.     ->1
        *JOptionPane.WARNING_MESSAGE.     ->2
        *JOptionPane.QUESTION_MESSAGE.     ->3
        */
        
        
        
        String valor = JOptionPane.showInputDialog(
                null, 
                "Ingrese texto",
                "Entrada",
                3);
        
        JOptionPane.showMessageDialog(
                null, 
                valor,
                "Mi mensaje",
                JOptionPane.ERROR_MESSAGE);
    
    
}
    
}
