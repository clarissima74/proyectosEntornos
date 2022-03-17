package Calculadora;

public class Calculadora {

	private int ultimo;
	//constructor de la clase Calculadora
	public Calculadora()
	{
		ultimo=0;
	}
	public Calculadora(int ultimo)
	{
		this.ultimo=ultimo;
	}
	public boolean CadenasIguales(String a,String b)
	{
		return a==b;
	}
	public int Suma(int a,int b)
	{
		ultimo=a+b;
		return ultimo;
	}
	public int Resta(int a,int b)
	{
		ultimo=a-b;
		return ultimo;
	}
	
	public int SumaUltimo(int num)
	{
		ultimo +=num;
		return ultimo;
	}
	public int RestaUltimo(int num)
	{
		ultimo -=num;
		return ultimo;
	}
	public int DameUltimo()
	{
		return ultimo;
	}
	public String ExisteNombre(String[] nombres)
	{
		String ms=null;
		
		for(int i=0;i<nombres.length;i++)
		{
			if(nombres[i]=="Raúl")
			{
				ms="Sí";
				break;
			}
		}
		
		return ms;
	}
	public boolean NumeroPar(int numero)
	{
		boolean esPar=false;
		if(numero%2==0)
			esPar=true;
		return esPar;
	}
}
