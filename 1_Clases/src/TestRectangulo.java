import javax.print.attribute.standard.PrinterMoreInfoManufacturer;

public class TestRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo r1 =new Rectangulo();
		
		r1.base=10;
		r1.altura=2;
		
		int perimetro = r1.calcularPerimetro();
		int area = r1.calcularArea();
		System.out.println("El perimetro es:"+perimetro);
		System.out.println("El area es:"+area);
		
		
		Rectangulo r2 =new Rectangulo();
		
		r2.base=12;
		r2.altura=8;
		
		int perimetro2 = r2.calcularPerimetro();
		int area2 = r2.calcularArea();
		System.out.println("El perimetro de r2 es: "+perimetro2);
		System.out.println("El area es:"+area2);
	}

}
