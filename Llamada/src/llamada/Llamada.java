/**Crear una clase de nombre Llamada cuyos objetos registran los datos sobre llamadas de teléfono:
 * número que llama, número llamado y duración en segundos. La clase tendrá un constructor que recibe
 * como parámetro éstos datos, un método que reciba como parámetro el coste del establecimiento de 
 * llamada y el precio por minuto y devuelva el coste de la llamada y, por último, un método que 
 * visualice en pantalla los datos. Una clase Teléfono debe contener los datos del titular, así como
 * la colección de llamadas hechas y recibidas, los teléfonos debe poder llamar y recibir llamadas,
 * así como consultar el registro.
 */
package llamada;

import java.util.Scanner;

/**
 *
 * @author Usuario01
 */
public class Llamada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[]ranking=new int[10];
        CosteLlamada(ranking);
        
        
    }
    public static void CosteLlamada(int[]r){
        Scanner teclado = new Scanner(System.in);
        int tiempo;
        int precio;
        boolean ultimo=false;
        while(!ultimo){
            System.out.println("Tiempo de la llamada:");
            tiempo= teclado.nextInt();
            System.out.println("Precio del minuto:");
            precio= teclado.nextInt();
            if(tiempo!=-1){
                System.out.println("El precio de la llamada es:"+ tiempo*precio);   
            }
            else{
                ultimo=true;
            }
        }   
    }
}
