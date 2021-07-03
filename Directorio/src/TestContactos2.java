import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contacto c1 = new Contacto("Nico", "Rosero", 
				new Telefono("movi", "2134325", 123), 231123 );
		
		Contacto c2 = new Contacto("Ign", "Urru", 
				new Telefono("claro", "2asdf5", 2223), 231123 );

		AdminContactos adminC = new AdminContactos();
		
		Contacto resultado = adminC.buscarMasPesado(c1, c2);
		if(resultado==null){
			System.out.println("Son Iguales sus pesos");
		}else{
			System.out.println("Contacto mas pesado: "+resultado.toString());
		}
		
		boolean resultadoBool= adminC.compararOperadoras(c1, c2);
		
		if(resultadoBool){
			System.out.println("Son mismas operadoras");
		}else{
			System.out.println("Son diferenrtes operadoras");
		}
	}

}
