
public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto miAuto; //
		miAuto = new Auto();// 
		System.out.println("marca :"+ miAuto.getMarca());
		System.out.println("precio :"+ miAuto.getPrecio());
		System.out.println("anio :"+ miAuto.getAnio());
		
		miAuto.setPrecio(12560.23f); 
		
		System.out.println("marca :"+ miAuto. getMarca());
		System.out.println("precio :"+ miAuto.getPrecio());
		System.out.println("anio :"+ miAuto.getAnio());
	}

}
