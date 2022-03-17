package Calculadora;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;


class CalculadoraTest {

	Calculadora calc;
	@BeforeAll
	public static void beforeTodo()
	{
		System.out.println("before todo");
	}
	@BeforeEach
	public void before()
	{
		calc=new Calculadora();
	}
	@AfterEach
	public void after()
	{
		System.out.println("después de la prueba");
	}
	@RepeatedTest(value=3)
	@DisplayName("Repetición del test")
//	@RepeatedTest(value = 5, name = "{displayName} -> {currentRepetition} de {totalRepetitions}")
	public void TestSuma()
	{
		System.out.println("prueba suma");
		
		int resultado=calc.Suma(5, 2);
		int esperado=7;//5+2=7
	    assertNotEquals(esperado,resultado,"Fallo:los resultados son iguales");
	}
	
	@Test
	@DisplayName("Probando las cadenas")
	public void TestCadenas()
	{
		System.out.println("prueba cadenas");
		
		String a="palabra";
		String b="palabras";
		
		boolean iguales=calc.CadenasIguales(a, b);
		//assertEquals(true,iguales,"pues no son iguales");
		assertTrue(iguales,"Son iguales");
	}
	@Test
	public void TestTiempo()
	{
		//assertTimeout(Duration 5,)
	}
	
	@Test
//	@Tag("A")
	@Order(1)
	public void TestResta()
	{
		System.out.println("prueba resta");
		
		int resultado=calc.Resta(5, 2);
		int esperado=3;//5-2=3	
		assertEquals(esperado,resultado);
	}
	@Test
	@Disabled
	public void TestEncontrado()
	{
	
		String[] nombres= {"Juan","Damián","Sergio"};
		assertNull(calc.ExisteNombre(nombres),"El nombre está en la lista");
	}
	@Test
	@DisplayName("Probando par")
	public void TestNumeroPar()
	{
		System.out.println("Par, para");
		int numero=8;
		//assertTrue(calc.NumeroPar(8),"No es par");
		assertTrue((numero%2==0),"Es par");
		
	}
	@Test
	public void CompararArrays()
	{
		assertArrayEquals(new int[]{1,2,3},new int[]{1,2,3},"Los arrays no son iguales");
		assertArrayEquals(new int[]{1,2,3},new int[]{1,3,2},"Los arrays no son iguales");
		assertArrayEquals(new int[]{1,2,3,4},new int[]{1,2,3},"Los arrays no son iguales");
		
	}
}
