package uniandes.dpoo.estructuras.logica;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//OPERAR SOBRE MAPACADENAS. NO AGREGAR ATRIBUTOS
//LLAVES CADENAS - VALORES CADENAS

public class SandboxMapas
{
 
    private Map<String, String> mapaCadenas;

    public SandboxMapas( )
    {
        mapaCadenas = new HashMap<String, String>( );
    }

    public List<String> getValoresComoLista() //LISTA ORDENADA
    {
    	
	    List<String> lista = new ArrayList<>(); 

	    for (String llave : mapaCadenas.keySet()) { //RECORREMOS LLAVES
	        String valor = mapaCadenas.get(llave); // SACO VALOR
	        lista.add(valor); 
	    }

	    
	    for (int i = 0; i < lista.size() - 1; i++) { 
	        int petit = i; //ASUMO QUE ES EL MAS PEQUENO
	        for (int j = i + 1; j < lista.size(); j++) { //BUSCO EL SIGUIENTE PEQUENO
	            if (lista.get(j).compareTo(lista.get(petit)) < 0) { //SI SOY MAS PETIT
	            	petit = j; 
	            }
	        }


	    return lista;
     
    }

    /**
     * Retorna una lista con las llaves del mapa ordenadas lexicográficamente de mayor a menor
     * @return Una lista ordenada con las cadenas que conforman las llaves del mapa
     */
    public List<String> getLlavesComoListaInvertida( )
    {
        return null;
    }


    public String getPrimera()
    {
    	if (mapaCadenas.isEmpty()) {
    		return null;
    	}
    	
    	List<String> nueva = getValoresComoLista(); //BUSCO LA PRIMERA DE LA LISTA
    	return nueva.get(0);
    	
    }

    public String getUltima()
    {
    	if (mapaCadenas.isEmpty()) { //SI ESTOY VACIO
    		return null;
    	}
    	
    	List<String> nueva = getValoresComoLista(); //BUSCO LA ULTIMA DE LA LISTA
    	return nueva.get(mapaCadenas.size()-1);
        
    }

    /**
     * Retorna una colección con las llaves del mapa, convertidas a mayúsculas.
     * 
     * El orden de las llaves retornadas no importa.
     * @return Una lista de cadenas donde todas las cadenas están en mayúsculas
     */
    public Collection<String> getLlaves( )
    {
        return null;
    }

    /**
     * Retorna la cantidad de *valores* diferentes en el mapa
     * @return
     */
    public int getCantidadCadenasDiferentes( )
    {
        return -1;
    }

    /**
     * Agrega un nuevo valor al mapa de cadenas: el valor será el recibido por parámetro, y la llave será la cadena invertida
     * 
     * Este método podría o no aumentar el tamaño del mapa, dependiendo de si ya existía la cadena en el mapa
     * 
     * @param cadena La cadena que se va a agregar al mapa
     */
    public void agregarCadena( String cadena )
    {

    }

    /**
     * Elimina una cadena del mapa, dada la llave
     * @param cadena La llave para identificar el valor que se debe eliminar
     */
    public void eliminarCadenaConLLave( String llave )
    {

    }

    /**
     * Elimina una cadena del mapa, dado el valor
     * @param cadena El valor que se debe eliminar
     */
    public void eliminarCadenaConValor( String valor )
    {

    }

    /**
     * Reinicia el mapa de cadenas con las representaciones como Strings de los objetos contenidos en la lista del parámetro 'objetos'.
     * 
     * Use el método toString para convertir los objetos a cadenas.
     * @param valores Una lista de objetos
     */
    public void reiniciarMapaCadenas( List<Object> objetos )
    {

    }

    /**
     * Modifica el mapa de cadenas reemplazando las llaves para que ahora todas estén en mayúsculas pero sigan conservando las mismas cadenas asociadas.
     */
    public void volverMayusculas( )
    {

    }


    public boolean compararValores( String[] otroArreglo )
    {
    	if ((otroArreglo == null && mapaCadenas == null) || (otroArreglo.length == 0 && mapaCadenas.isEmpty()) {
    		return true;
    	}
    	 
    	for (String i: otroArreglo) {
    		if (!mapaCadenas.containsValue(i)) {
    			return false;
    		}
    	}
        return true;
    }

}
