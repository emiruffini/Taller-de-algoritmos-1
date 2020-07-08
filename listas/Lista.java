package listas;

import javax.swing.JOptionPane;

public class Lista {
	private Nodo ultimo;
	private Nodo primero;
	
	String Lista="";
	


public Lista(){
	primero = null;
	ultimo = null;
}
// metodo para ver si la lista esta vacia

public boolean listaVacia(){
	return ultimo == null;
}

//metodo para insertar un nodo en la lista

public void insertarNodo(int valorNodo){
	
	Nodo nuevoNodo = new Nodo (valorNodo);
	
	if (primero==null){
		primero = nuevoNodo;
		primero.siguiente = null;
		ultimo = primero;
	}else{
		ultimo.siguiente = nuevoNodo;
		nuevoNodo.siguiente = null;
		ultimo = nuevoNodo;
	}
}

//metodo para mostrar la lista

public void verLista(){
	Nodo nodoMostrar = new Nodo();
	nodoMostrar = primero;
	
	while (nodoMostrar != null){
		
		JOptionPane.showMessageDialog(null, nodoMostrar);
		nodoMostrar = nodoMostrar.siguiente;
		
	}
	
}

//metodo para buscar nodo

public void buscarNodo(int datoBuscar){
	
	Nodo nodoBuscar = new Nodo();
	nodoBuscar = primero;
	
	while (nodoBuscar != null){
		
		if (nodoBuscar.dato == datoBuscar){
			JOptionPane.showMessageDialog(null, "Nodo encontrado");
		}else{
			JOptionPane.showMessageDialog(null, "Nodo no encontrado");
		}
		
		nodoBuscar = nodoBuscar.siguiente;
		
	}
	
}





	


}
