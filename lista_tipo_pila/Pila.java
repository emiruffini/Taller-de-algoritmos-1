package lista_tipo_pila;

import javax.swing.JOptionPane;

public class Pila {
    
    private Nodo UltimoValorIngresado;
    int tamano = 0;
    String Lista = "";
    
    public Pila(){
        UltimoValorIngresado = null;
        tamano = 0;
    }
    
    //M�todo para saber cuando la pila esta vacia
    public boolean PilaVacia(){
        return UltimoValorIngresado == null;
    }
    
    //M�todo para insertar un nodo en la pila
    public void InsertarNodo(Object valor_nodo){
        Nodo nuevo_nodo = new Nodo(valor_nodo);
        nuevo_nodo.siguiente = UltimoValorIngresado;
        UltimoValorIngresado = nuevo_nodo;
        tamano++;
    }        
    
    //M�todo para eliminar un nodo de la pila
    public Object EliminarNodo(){
        Object auxiliar = UltimoValorIngresado.informacion;
        UltimoValorIngresado = UltimoValorIngresado.siguiente;
        tamano--;
        return auxiliar;
    }
    
    //M�todo para conocer cual es el �ltimo valor ingresado
    public Object MostrarUltimoValorIngresado(){
        return UltimoValorIngresado.informacion;
    }
    
    //Método para conocer el tama�o de la Pila
    public int TamanoPila(){
        return tamano;
    }
    
    //M�todo para vaciar la Pila
    public void VaciarPila(){
        while (!PilaVacia()) {
            EliminarNodo();            
        }
    }
    
    //M�todo para mostrar el contenido de la pila
    public void MostrarValores(){
        Nodo recorrido = UltimoValorIngresado;
        
        while(recorrido != null){
            Lista += recorrido.informacion + "\n";
            recorrido = recorrido.siguiente;
        }
        JOptionPane.showMessageDialog(null, Lista);
        Lista = "";
    }
}
