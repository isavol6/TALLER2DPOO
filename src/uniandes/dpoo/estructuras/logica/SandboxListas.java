package uniandes.dpoo.estructuras.logica;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Esta clase tiene un conjunto de métodos para practicar operaciones sobre listas de enteros y de cadenas.
 *
 * Todos los métodos deben operar sobre los atributos listaEnteros y listaCadenas.
 * 
 * No pueden agregarse nuevos atributos.
 * 
 * Implemente los métodos usando operaciones sobre listas (ie., no haga cosas como construir arreglos para evitar la manipulación de listas).
 * 
 * Intente usar varias formas de recorrer las listas (while, for, for each, iteradores ... )
 */
public class SandboxListas
{
    /**
     * Una lista de enteros para realizar varias de las siguientes operaciones.
     */
    private List<Integer> listaEnteros;

    /**
     * Una lista de cadenas para realizar varias de las siguientes operaciones
     */
    private List<String> listaCadenas;

    /**
     * Crea una nueva instancia de la clase con las dos listas inicializadas pero vacías
     */
    public SandboxListas( )
    {
        listaEnteros = new ArrayList<Integer>( );
        listaCadenas = new LinkedList<String>( );
    }

    public List<Integer> getCopiaEnteros() //COPIA LA LISTA DE ENTEROS
    {
    	
        return new ArrayList<Integer>(listaEnteros);
    }

    public List<String> getCopiaCadenas() // COPIA LA LISTA DE CADENAS
    {
    	
        return new LinkedList<>(listaCadenas); //LINKED PORQUE ASI FUE CREADA
    }

    public int[] getEnterosComoArreglo()
    {
    	int[] nuevo = new int[listaEnteros.size()]; //NUEVO DEL TAMANO DE LA LISTA
        
        for (int i = 0; i < listaEnteros.size(); i++) {
            nuevo[i] = listaEnteros.get(i); //ACCEDO Y ASIGNO
        }
        
        return nuevo;
    }

    public int getCantidadEnteros()//TAMANIO
    {
        return listaEnteros.size();
    }

    public int getCantidadCadenas()//TAMANIO
    {
        return listaCadenas.size();
    }

    public void agregarEntero(int entero)//AGREGA AL FINAL
    {
    	listaEnteros.add(entero);
    }

    public void agregarCadena(String cadena)//AGREGA AL FINAL 
    {
    	listaCadenas.add(cadena); 
    }

    public void eliminarEntero(int valor) //ELIMINA TODAS LAS APARICIONES
    {
    	for (int i = 0; i < listaEnteros.size(); i++) {
    		if (listaEnteros.get(i) == valor) { //SI SOMOS IGUALES
    			listaEnteros.remove(i); //CHAO
    		}
    	}
    }

    public void eliminarCadena(String cadena)
    {
    	for (int i = 0; i < listaCadenas.size(); i++) {
    		if (listaCadenas.get(i) == cadena) {
    			listaCadenas.remove(i);
    			}
    		}
    	}

   
    public void insertarEntero(int entero, int posicion) //AGREGAR POR POS
    {
    	if (posicion < 0) { //SI ME SALGO
    		posicion = 0;
    	}
    	else if( posicion > listaEnteros.size()) {// SI ME PASO
    		posicion = listaEnteros.size();
    	}
    	
    	listaEnteros.add(posicion, entero); //AGREGO
    }

 
    public void eliminarEnteroPorPosicion(int posicion) //ELIMINA EN X POS
    {
    	if (posicion < 0 || posicion >= listaEnteros.size()) { //SI NO EXISTO
    		return;
    	}
    	
    	listaEnteros.remove(posicion);//ADIOS
    }


    public void reiniciarArregloEnteros(double[] valores)
    {
    	List<Integer> lista = new ArrayList<>(); //NUEVA DEL MISMO TAMANIO

	    for (int i = 0; i < valores.length; i++) {
	        int nuevo = (int) valores[i]; //CONVERSION
	        lista.add(nuevo); //AGREGO
	    }

	    listaEnteros = lista; //REASIGNO GLOBAL
}


    public void reiniciarArregloCadenas(List<Object> objetos)
    {
    	List<String> lista = new ArrayList<>(); //NUEVA MISMO TAMANIO

       
        for (int i = 0; i < objetos.size(); i++) {
            String str = objetos.get(i).toString(); //CONVERSION .toString()
            lista.add(str); //AGREGO
        }
        listaCadenas = lista; //REASIGNO
    }

    public void volverPositivos()
    {
    	
	    List<Integer> lista = new ArrayList<>(); //NUEVA MISMO TAMANIO

	    for (int i = 0; i < listaEnteros.size(); i++) {
	        int positivo = Math.abs(listaEnteros.get(i)); // CONVERSION
	        lista.add(positivo); //AGREGO
	    }

	    listaEnteros = lista; 
    }

    /**
     * Modifica la lista de enteros para que todos los valores queden organizados de MAYOR a MENOR.
     */
    public void organizarEnteros( )
    {

    }

    /**
     * Modifica la lista de cadenas para que todos los valores queden organizados lexicográficamente.
     */
    public void organizarCadenas( )
    {

    }

    public int contarApariciones(int valor)
    {
        int contador = 0;
	    for (int i = 0; i < listaEnteros.size(); i++) { 
	        if (listaEnteros.get(i) == valor) { //SI SOY IGUAL
	            contador += 1; 
	        }
	    }
	    return contador; 
       
    }

    public int contarApariciones(String cadena)
    {
    	int contador = 0;
    	for (int i = 0; i < listaCadenas.size(); i++) {
    		if (listaCadenas.get(i) == cadena) {
    			contador += 1;
    		}
    	}
    
        return contador;
    }

    /**
     * Cuenta cuántos valores dentro de la lista de enteros están repetidos.
     * @return La cantidad de enteos diferentes que aparecen más de una vez
     */
    public int contarEnterosRepetidos( )
    {
    	
        return -1;
    }

    /**
     * Compara la lista de enteros con un arreglo de enteros y verifica si contienen los mismos elementos exactamente en el mismo orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los elementos son los mismos y en el mismo orden y false de lo contrario
     */
    public boolean compararArregloEnteros( int[] otroArreglo )
    {
        return false;
    }

    /**
     * Cambia los elementos de la lista de enteros por una nueva serie de valores generada de forma aleatoria.
     * 
     * Para generar los valores se debe partir de una distribución uniforme usando Math.random().
     * 
     * Los números en la lista deben quedar entre el valor mínimo y el máximo.
     * @param cantidad La cantidad de elementos que debe haber en la lista
     * @param minimo El valor mínimo para los números generados
     * @param maximo El valor máximo para los números generados
     */
    public void generarEnteros( int cantidad, int minimo, int maximo )
    {

    }

}
