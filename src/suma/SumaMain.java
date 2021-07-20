
package suma;

import java.util.Scanner;
import static java.lang.Math.*;

public class SumaMain {
    
    public static void main(String[] args) {
         
        
        //peticion y almacenamiento de datos
        Scanner entrada = new Scanner(System.in);//creacion del objeto entrada
    
        System.out.println("Dame el primer valor: ");
        int valorUno = entrada.nextInt();//objeto entrada.metodo nextInt
        
        System.out.println("Dame el segundo valor");
        int valorDos = entrada.nextInt();
        
        //enviar o pasar datos atraves de argumentos(enviando las variables a la otra clase)        
          Suma valores = new Suma(valorUno, valorDos); // objeto (objeto valores que cumple el papel de mensajero)de tipo suma
    
    //imprimir en pantalla el resultado
    //objeto  que comunica o el mensajero valores.metodo Imprimir
    valores.Imprimir();
    
    }
}
