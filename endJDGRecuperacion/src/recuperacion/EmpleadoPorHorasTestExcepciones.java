package recuperacion;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class EmpleadoPorHorasTestExcepciones {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSalarioBruto1() {
		EmpleadoPorHoras empleado = new EmpleadoPorHoras("TestEmpleado", 1400, true, 6);
		Exception error = assertThrows(IllegalArgumentException.class, ()-> empleado.calcularSalarioBruto(-200));
		assertEquals("Las comisiones obtenidas por el empleado no pueden ser negativas", error.getMessage());
	}

}
