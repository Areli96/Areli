
public class Profesor {
	
	public String nombre;
	public String grupo;
	public int edad;
	
	public boolean equals(Profesor d){
		 boolean diferente=false;
		
		 if (!this.nombre.equals(d.nombre)){
			 diferente=true;
		 }
		 else {
			 if(this.edad!=d.edad){
				 diferente=true;
		 }
			
		 }
		return diferente;

}
}
