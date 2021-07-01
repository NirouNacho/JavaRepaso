
public class Rectangulo {
	public int base;
	public int altura;
	
	
	public int calcularPerimetro()
	{
		int per=(2*base)+(2*altura);
		return per;
	}
	
	//calcular el area devolviendo un entero, base *altura
	public int calcularArea(){
		
		return base*altura;
	}
}
