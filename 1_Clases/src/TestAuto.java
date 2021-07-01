
public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto miAuto; //
		miAuto = new Auto();// 
		System.out.println("marca :"+ miAuto.marca);
		System.out.println("precio :"+ miAuto.precio);
		System.out.println("anio :"+ miAuto.anio);
		
		miAuto.precio= 12560.23f;
		
		System.out.println("marca :"+ miAuto.marca);
		System.out.println("precio :"+ miAuto.precio);
		System.out.println("anio :"+ miAuto.anio);
	}

}
