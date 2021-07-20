
package suma;


public class Suma {
    //crear variables para recibir los datos que envia el objeto valores
    private int vUno, vDos, Resultado; //private- modificador de acceso privado
    
    //contructor
    //recepciona las variables que trajo el objeto valores
    public Suma(int valorUno, int valorDos) {
        this.vUno = valorUno; //this hace referencia a la clases que estamos usando
        this.vDos = valorDos;
    }
    
    // metodo para realizar la suma. public (es para que se comunique con otros metodos u otras clases )
    // void (retorna los valores)
    
    public void Operacion()
    {
        Resultado = vUno + vDos;
    }
    
    //metodo para imprimir los resultados
    public void Imprimir(){
        //llamar al metodo que hace suma
        Operacion();
        System.out.println("El resulatado de la suma es: " + Resultado);
       
    }
}
