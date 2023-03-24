package Evaluacion2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TablaEnterosTest {

	@BeforeEach
	void crearTablaEnteros() {
		
		Integer[] tabla = new Integer[5];
		tabla[0] = 1;
		tabla[1] = 7;
		tabla[2] = 3;
		tabla[3] = 0;
		tabla[4] = 2;
		
		TablaEnteros tablaEnteros = new TablaEnteros(tabla);
	}
	
	@Test
	void creacionTablaEnterosExceptionTest(TablaEnteros tablaEnteros) {
		
		Integer[] tabla2 = new Integer[0];
		TablaEnteros tablaEnteros2;
		
		Exception exc = ((E)tablaEnteros2 = new TablaEnteros(tabla2));
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> exc);
	}
	
	@Test
	void mayorTablaTest(TablaEnteros tablaEnteros) {
		
		int exp = 7;
		int res = tablaEnteros.sumaTabla();
		
		assertEquals(exp, res);
	}

}
