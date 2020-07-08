package lista_tipo_pila;

public class Nodo {
    Object informacion;
    Nodo siguiente;
    
    public Nodo(Object valor){
        informacion = valor;
        siguiente = null;
    }
}
