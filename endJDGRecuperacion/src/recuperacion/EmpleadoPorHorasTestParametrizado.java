package recuperacion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class EmpleadoPorHorasTestParametrizado {
	
	private static ArrayList<Empleado> listaEmpleados;
	private static EmpleadoPorHoras empleado;
	
	private double pagaExtra;
	private int prorrateoPaga;
	private double salarioEsperado;
	
	public EmpleadoPorHorasTestParametrizado(double pagaExtra, int prorrateoPaga, double salarioEsperado) {
		this.pagaExtra = pagaExtra;
		this.prorrateoPaga = prorrateoPaga;
		this.salarioEsperado = salarioEsperado;
	}
	
	@Parameterized.Parameters
	public static Collection<Object[]> parametros() {
		return Arrays.asList(new Object[][] {
			{200.5,2,1302.2325},
			{100.0,6,1224.503},
			{3956.23,12,1515.58},
			{1,1,1209.93},
			{500.0,10,1255.5}
			}); 
		}
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		listaEmpleados  = new ArrayList<>();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		listaEmpleados = null;
	}

	@Before
	public void setUp() throws Exception {
		empleado = new EmpleadoPorHoras("Julián", 1300, true, 7);
	}

	@After
	public void tearDown() throws Exception {
		empleado = null;
	}
	
	@Test
	public void testSalarioNeto() {
		assertEquals(salarioEsperado, empleado.calcularSalarioBruto(pagaExtra, prorrateoPaga),0.01);
	}
	
	@Ignore
	@Test
	public void testSalario() {
		//No implementado
	}

}
