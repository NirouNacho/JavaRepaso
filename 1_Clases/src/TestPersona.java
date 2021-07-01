
public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1; //Declaro la variable p1 de tipo persona
		p1 = new Persona();//Creo el objeto persona y lo referencio con p1
		System.out.println("nombre :"+ p1.nombre);
		System.out.println("edad :"+ p1.edad);
		System.out.println("estatura :"+ p1.estatura);
	
		p1.nombre="Juan";
		p1.edad=20;
		p1.estatura=1.75;
		
		System.out.println("nombre :"+ p1.nombre);
		System.out.println("edad :"+ p1.edad);
		System.out.println("estatura :"+ p1.estatura);
	
		System.out.println("**************");
		Persona p2;
		p2 = new Persona();
		System.out.println("nombre :"+ p2.nombre);
		p2.nombre="Marco";
		System.out.println("nombre :"+ p2.nombre);
	}

}
