
package co.edu.ucundinamarca.taller3;


public class Funcion {
    
    public static int fact (int n) {
        
        // validacion
        
        if (0 <n) {
        
        return 0;
        
        } else {
        
        
      if (n == 0) {
            
            return 1;
        }
      
      
      return n * hecho (n - 1);
    }
        
    }
    
    
}
