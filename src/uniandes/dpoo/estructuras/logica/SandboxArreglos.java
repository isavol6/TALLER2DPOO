package uniandes.dpoo.estructuras.logica;

import java.util.Arrays;
import java.util.HashMap;

//ARREGLOS DE ENTEROS Y CADENAS.
//OPERAR SOBRE: arregloEnteros y arregloCadenas. 
//NO CREAR ATRIBUTOS, NO CONSTRUIR LISTAS.
//USAR LAS OPERACIONES SOBRE ARREGLOS.

public class SandboxArreglos
{
    
    private int[] arregloEnteros; //ARREGLO ENTEROS, NUNCA VACIO
    private String[] arregloCadenas; //ARREGLO CADENAS, NUNCA VACIO

    public SandboxArreglos()//NUEVA INSTANCIA DE LA CLASE
    {
        arregloEnteros = new int[0];
        arregloCadenas = new String[0];
    }
    
    
    public int[] getCopiaEnteros() //RETORNAR COPIA ARREGLO ENTEROS
    {
    	//CREO ARREGLO VACIO DEL MISMO TAMANO
    	int[] copiaEnteros = new int[arregloEnteros.length]; //.LENGTH ME DA LA CANTIDAD DE DATOS
    	
    	for (int i = 0; i < arregloEnteros.length; i++) {
    		copiaEnteros[i] = arregloEnteros[i];
    	}

        return copiaEnteros;
    }

    public String[] getCopiaCadenas()
    {
    	//CREO ARREGLO VACIO DEL MISMO TAMANO
    	String[] copiaCadenas = new String[arregloCadenas.length]; //.LENGTH ME DA LA CANTIDAD DE DATOS
    	
    	for (int i = 0; i < arregloCadenas.length; i++) {
    		copiaCadenas[i] = arregloCadenas[i];
    	}

        return copiaCadenas;
      
    }

    public int getCantidadEnteros()
    {
        return arregloEnteros.length; //SOLO LENGHT PORQUE NADIE PUEDE ESTAR VACIO
    }

    public int getCantidadCadenas()
    {
        return arregloCadenas.length;
    }

    
    public void agregarEntero(int entero) //AGREGAR ENTERO AL FINAL
    {
	     int[] nuevo = new int[arregloEnteros.length + 1]; //LOS ARREGLOS EN JAVA NO SON MUTABLES!!! CREAMOS UNO AGRANDADO
	     System.arraycopy(arregloEnteros, 0, nuevo, 0, arregloEnteros.length); //COPIO AL NUEVO
	     nuevo[arregloEnteros.length] = entero; //AGREGO VALOR
	     arregloEnteros = nuevo; //REASIGNO GLOBALMENTE

    }

    public void agregarCadena(String cadena) //AGREGAR CADENA AL FINAL
    {
    	String[] nuevo = new String[arregloCadenas.length + 1]; 
        System.arraycopy(arregloCadenas, 0, nuevo, 0, arregloCadenas.length); 
        nuevo[arregloCadenas.length] = cadena; 
        arregloCadenas = nuevo; 
    }

    public void eliminarEntero(int valor) //ELIMINAR TODAS LAS APARICIONES
    {
        int contador = 0;

        for (int i = 0; i < arregloEnteros.length; i ++){ //CUANTAS VECES EXISTE?
            int actual = arregloEnteros[i];
            if (actual == valor){
                contador += 1;
            }
        }
        
        int[] nuevo = new int[arregloEnteros.length - contador]; // NUEVO TAMANO
        int indexNuevo = 0;

        for (int i = 0; i < arregloEnteros.length; i++) {
            if (arregloEnteros[i] != valor) { //SI NO ESTOY EN EL PORIHIBIDO
                nuevo[indexNuevo] = arregloEnteros[i];
                indexNuevo++; // SOLO ME MUEVO DE POS SI CUMPLI
            }
        }

        arregloEnteros = nuevo;
    }

    public void eliminarCadena(String cadena)
    {
        int contador = 0;

        for (int i = 0; i < arregloCadenas.length; i ++){ //CUANTAS VECES EXISTE?
            String actual = arregloCadenas[i];
            if (actual == cadena){
                contador += 1;
            }
        }
        
        String[] nuevo = new String[arregloCadenas.length - contador]; // NUEVO TAMANO
        int indexNuevo = 0;

        for (int i = 0; i < arregloCadenas.length; i++) {
            if (arregloCadenas[i] != cadena) { //SI NO ESTOY EN EL PORIHIBIDO
                nuevo[indexNuevo] = arregloCadenas[i];
                indexNuevo++; // SOLO ME MUEVO DE POS SI CUMPLI
            }
        }

        arregloCadenas = nuevo;
    }

    public void insertarEntero(int entero, int posicion) //NUEVO ENTERO EN X POS
    {
    	int[] nuevo = new int[arregloEnteros.length + 1]; //ARREGLOS NO MUTABLES, CREAMOS UNO AGRANDADO
    	System.arraycopy(arregloEnteros, 0, nuevo, 0, posicion); //COPIO LA PARTE ANTES DE LA POS
    	nuevo[posicion] = entero; //INSERTO EN POS
    	System.arraycopy(arregloEnteros, posicion, nuevo, posicion + 1, arregloEnteros.length - posicion); // COPIO LO QUE VA DESPUES
    	arregloEnteros = nuevo; // REASIGNO
    	
    }


    public void eliminarEnteroPorPosicion(int posicion)
    {
    	if (posicion < 0 || posicion >= arregloEnteros.length) { //SI LA POS NO INTERESA OMITO
    		return;
    	}
    	int[] nuevo = new int[arregloEnteros.length - 1]; //ARREGLO CON UNA POS MENOS
    	int j = 0;
        for ( int i = 0; i< arregloEnteros.length; i++) {
        	if (i != posicion) {
        		nuevo[j] = arregloEnteros[i];
        		j +=1;
        		
        	}
        }
        arregloEnteros = nuevo; //REASIGNO
    	
    }
 
    public void reiniciarArregloEnteros(double[] valores)
    {
        arregloEnteros = new int[valores.length]; //REINICIAMOS CON EL NUEVO TAMANO
   
        for (int i = 0; i < valores.length; i++) {
        arregloEnteros[i] = (int) valores[i];  // (INT) CONVIERTE DIRECTAMENTE
        }
    }
    
    /**
     * Reinicia el arreglo de cadenas con las representaciones como Strings de los objetos contenidos en el arreglo del parámetro 'objetos'.
     * 
     * Use el método toString para convertir los objetos a cadenas.
     * @param valores Un arreglo de objetos
     */
    public void reiniciarArregloCadenas( Object[] objetos )
    {
     
    	arregloCadenas = new String[objetos.length]; 
    	
    	for(int i = 0; i < objetos.length; i++) {
    		if (objetos[i] != null) {
    			arregloCadenas[i] = objetos[i].toString();
    		}
            else {
                arregloCadenas[i] = "null";
            }
    	}
    	
	}
    
    public void volverPositivos() //VUELVE TODOS LOS ENTEROS POSITIVOS
    {

    	for (int i = 0; i < arregloEnteros.length; i ++) { //RECORREMOS
    		int entero = arregloEnteros[i];
    		if (entero < 0) {
    			entero = Math.abs(entero); // OPERAMOS LOS NECESARIOS
    		}
			arregloEnteros[i] = entero; //REASIGNAMOS
    	}
    }

    /**
     * Modifica el arreglo de enteros para que todos los valores queden organizados de menor a mayor.
     */
    public void organizarEnteros( )
    {

    }

    /**
     * Modifica el arreglo de cadenas para que todos los valores queden organizados lexicográficamente.
     */
    public void organizarCadenas( )
    {

    }

    public int contarApariciones(int valor) //CUANTAS VECES APARECE EL VALOR
    {
    	int total = 0;
    	for (int i = 0; i < arregloEnteros.length; i++) { //RECORREMOS
    		int entero = arregloEnteros[i];
    		if (entero == valor) { //REVISAMOS SI ES EL QUE BUSCO
    			total +=1;
    		}
    	}
    			
        return total;
    }

    public int contarApariciones(String cadena) //CUANTAS VECES APARECE LA CADENA
    {
    	int total = 0;
    	for (int i = 0; i < arregloCadenas.length; i++) { //RECORREMOS
    		String elemento = arregloCadenas[i];
    		if (elemento == cadena) { //REVISAMOS SI ES EL QUE BUSCO
    			total +=1;
    		}
    	}
    			 
        return total;
    }

    public int[] buscarEntero(int valor) //POSICIONES DE UN ENTERO
    {
	    int contador = 0;
	    for (int i = 0; i < arregloEnteros.length; i++) {
	    	int elemento = arregloEnteros[i];
	        if (elemento == valor) {
	            contador+= 1; // CUANTAS VECES EXISTE EL ELEMENTO
	        }
	    }
	    
	    if (contador == 0) { //SI ESTOY EN 0 NO ENCONTRE
	    	int[] empty = new int[0]; //CREAR VACIO
	        return empty;
	    }

	    int[] posiciones_valor = new int[contador]; //CREO USANDO CONTADOR DE TAMANIO
	   
	    for (int i = 0; i < arregloEnteros.length; i++) { //BUSCAMOS LAS POSICIONES DE NUEVO
	        if (arregloEnteros[i] == valor) {
	        	posiciones_valor[i] = i;
	        }
	    }

	    return posiciones_valor;
        
    }

    public int[] calcularRangoEnteros( )
    {
    	if (arregloEnteros.length == 0) {
    		int[] empty = {};
    		return empty; 
    	}
    	int[] rangos = new int[2];
    	int menor = 2147483646;
    	int mayor = -2147483646;
    			
    	for (int i = 0; i < arregloEnteros.length; i++) {
    		int entero_actual = arregloEnteros[i];
    		if (entero_actual > mayor) {
    			rangos[1] = entero_actual;
    			mayor = entero_actual;		
    		}
    		if (entero_actual < menor) {
    			rangos[0] = entero_actual;
    			menor = entero_actual;
    		}
    	}
        return rangos;
    }

    /**
     * Calcula un histograma de los valores del arreglo de enteros y lo devuelve como un mapa donde las llaves son los valores del arreglo y los valores son la cantidad de
     * veces que aparece cada uno en el arreglo de enteros.
     * @return Un mapa con el histograma de valores.
     */
    public HashMap<Integer, Integer> calcularHistograma( )
    {
        return null;
    }

    /**
     * Cuenta cuántos valores dentro del arreglo de enteros están repetidos.
     * @return La cantidad de enteos diferentes que aparecen más de una vez
     */
    public int contarEnterosRepetidos()
    {
        int contador = 0;
        for (int i = 0; i < arregloEnteros.length; i++){
            int actual = arregloEnteros[i];
            int apariciones = contarApariciones(actual);
            if (apariciones > 0){
                contador += 1;
            }
        }
        return contador;
    	
    }

    public boolean compararArregloEnteros(int[] otroArreglo) //SON IGUALES, POS Y VALOR 
    {
    	boolean iguales = true;

        if (arregloEnteros.length == otroArreglo.length){
            for (int i = 0; i < arregloEnteros.length; i++) {
                int ent1 = arregloEnteros[i];
                int ent2 = otroArreglo[i];
                if (ent1 != ent2){ // SI DEJA DE CUMPLIRSE MI IGUALDAD
                    iguales = false;
                }
            }
        }
    	
        return iguales;
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica que tengan los mismos elementos, aunque podría ser en otro orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los elementos en los dos arreglos son los mismos
     */
    public boolean mismosEnteros(int[] otroArreglo)
    {
    	if (arregloEnteros.length != otroArreglo.length) {
    		return false; //SI NO SON IGUAL DE GRANDES NO PUEDEN TENER LO MISMO
    	}
        int[] copiaEnteros = new int[arregloEnteros.length]; //CREO NUEVOS PARA COPIAR
        int[] copiaOtro = new int[otroArreglo.length];
        System.arraycopy(arregloEnteros, 0, copiaEnteros, 0 , arregloEnteros.length);
        System.arraycopy(otroArreglo, 0, copiaOtro, 0 , otroArreglo.length);
        Arrays.sort(copiaEnteros);
        Arrays.sort(copiaOtro);
        if (Arrays.equals(copiaEnteros, copiaOtro)) {
        	return true;
        }
        return false; //REVISAR
        				
    }

    /**
     * Cambia los elementos del arreglo de enteros por una nueva serie de valores generada de forma aleatoria.
     * 
     * Para generar los valores se debe partir de una distribución uniforme usando Math.random().
     * 
     * Los números en el arreglo deben quedar entre el valor mínimo y el máximo.
     * @param cantidad La cantidad de elementos que debe haber en el arreglo
     * @param minimo El valor mínimo para los números generados
     * @param maximo El valor máximo para los números generados
     */
    public void generarEnteros( int cantidad, int minimo, int maximo )
    {
    		
    	}
    }


