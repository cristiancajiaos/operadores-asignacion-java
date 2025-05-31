
package operadores.asignacion;

public class OperadoresAsignacion {

    public static void main(String[] args) {
        //Asignaciones simples 
        /*
        int a = 5
        int b = 6;
        
        a = b;
        
        System.out.println("a = " + a);
        */
        
        // Asignaciones de operación simples
        /*
        int a = 5, b = 10, c = 3, d = 8;
        
        a = a + 4;
        b = b - 5;
        c = c * 3;
        d = d / 4;
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        */
        
        // Asignaciones de operación compuestas 
        int a = 5, b = 10, c = 3, d = 8;
        
        a += 4;
        b -= 5;
        c *= 3;
        d /= 4;
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
    
}
