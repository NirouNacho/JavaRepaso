
public class Auto {
	private String marca;
	private float precio;
	private int anio;
	
	
	public Auto() {
		
	}
	
	public Auto(String marca, float precio, int anio) {
		super();
		this.marca = marca;
		this.precio = precio;
		this.anio = anio;
	}
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	
	
}
