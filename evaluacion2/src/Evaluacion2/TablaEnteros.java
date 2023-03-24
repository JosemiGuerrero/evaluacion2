package Evaluacion2;

/**
 * Clase para crear una Tabla de Enteros a partir de un array de enteros.
 * Tiene métodos para sumar todos los valores de la tabla, devolver el valor mayor de la tabla 
 * y devolver la posición en el array de uno de los enteros de la tabla
 * 
 * @author DAM-1
 * @since 24/3/2023
 * @see <a href="https://github.com/JosemiGuerrero/evaluacion2">Ver Repositorio Git</a>
 */

public class TablaEnteros {
	
	private Integer[] tabla;

	/**
	 * Constructor de la clase TablaEnteros. Se le tiene que pasar un array de Enteros
	 * Se comprueba que el array no esté vacío
	 * 
	 * @param tabla Array de ints
	 * @throws IllegalArgumentException si el Array está vacío
	 */
	TablaEnteros(Integer[] tabla) {
		if (tabla == null || tabla.length == 0)
			throw new IllegalArgumentException("No hay elementos");
		this.tabla = tabla;
	}

	/**
	 * Devuelve la suma de los elementos de la tabla
	 * 
	 * @return int con la suma de todos los elementos de la tabla
	 */
	public int sumaTabla() {
		int suma = 0;
		for (int i = 0; i < tabla.length; i++)
			suma += tabla[i];
		return suma;
	}

	/**
	 * devuelve el mayor elemento de la tabla
	 * 
	 * @return int con el mayor valor de los elementos de la tabla
	 */
	public int mayorTabla() {
		int max = -999;
		for (int i = 0; i < tabla.length; i++)
			if (tabla[i] > max)
				max = tabla[i];
		return max;
	}

	/**
	 * Devuelve la posición de un elemento cuyo valor se pasa
	 * Controla que el valro a buscar no se encuentre en la tabla
	 * 
	 * @param n valor a buscar
	 * @throws NoSuchElementException en caso de que el valor no exista en la tabla
	 * @return int con la posicion del elemento en la tabla
	 */
	public int posicionTabla(int n) {
		for (int i = 0; i < tabla.length; i++)
			if (tabla[i] == n)
				return i;
		throw new java.util.NoSuchElementException("No existe: " + n);
	}
}//
