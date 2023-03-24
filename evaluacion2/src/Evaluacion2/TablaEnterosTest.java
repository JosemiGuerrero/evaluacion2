package Evaluacion2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TablaEnterosTest {

	@BeforeEach
	Integer[] crearTablaEnteros() {
		
		Integer[] tabla = new Integer[5];
		tabla[0] = 1;
		tabla[1] = 7;
		tabla[2] = 3;
		tabla[3] = 0;
		tabla[4] = 2;
		
		return tabla;	
	}
	
//	@Test
//	void creacionTablaEnterosExceptionTest(TablaEnteros tablaEnteros) {
//		
//		Integer[] tablaVacia = null;
//		TablaEnteros tablaEnterosVacia;
//		
//		Assertions.assertThrows(IllegalArgumentException.class, () -> tablaEnterosVacia = new TablaEnteros(tablaVacia));
//	}
	
	@Test
	void sumaTablaTest(Integer[] tabla) {
		
		Integer[] tabla2 = new Integer[5];
		tabla2[0] = 1;
		tabla2[1] = 7;
		tabla2[2] = 3;
		tabla2[3] = 5;
		tabla2[4] = 2;
		
		TablaEnteros tablaEnteros = new TablaEnteros(tabla2);
		
		int exp = 18;
		int res = tablaEnteros.sumaTabla();
		
		assertEquals(exp, res, "El resultado no es el esperado");
	}
	
	@Test 
	void mayorTablaTest(){
		
		Integer[] tabla2 = new Integer[5];
		tabla2[0] = 1;
		tabla2[1] = 7;
		tabla2[2] = 3;
		tabla2[3] = 5;
		tabla2[4] = 2;
		
		TablaEnteros tablaEnteros = new TablaEnteros(tabla2);
		
		int exp = 7;
		int res = tablaEnteros.mayorTabla();
		
		assertEquals(exp, res, "El resultado no es el esperado");
	}

}
