
public class PersonalAdm{
	public String nombre;
	public String cargo;
	public int edad;
	
	public boolean equals(PersonalAdm u){
		 boolean diferente=false;
		
		 if (!this.nombre.equals(u.nombre)){
			 diferente=true;
		 }
		 else {
			 if(this.edad!=u.edad){
				 diferente=true;
		 }
			
		 }
		return diferente;

}
}

