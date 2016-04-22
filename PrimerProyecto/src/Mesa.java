
public class Mesa {
	public int numPatas=4;
	public String color="cafe";
	public String material="plastico";
	private String marca="IKEA"; 
	public String estado="entera";
	
	//Declarar variables dentro de clase, (variables locales), 
	//LAs que no tienen static son variables de instancia 
	
	public static String duenio="UMIN";
	
	public void mover(){
		marca="sin marca";
		
	}
	public String getMarca(){
		return marca;
	}
public void romper(){
	estado="rota";
	
}
public void reparar(){
	estado="reparada";
}
}
