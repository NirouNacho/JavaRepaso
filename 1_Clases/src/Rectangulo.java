
public class Rectangulo {
	private int base;
	private int altura;
	
	
	
	
	public Rectangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}

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
