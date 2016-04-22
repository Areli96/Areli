
public class Alumno {
public String nombre;
public int  edad;
public String carreara;
private int matricula ;
 
public Alumno (String nombre, int edad){
	System.out.println("Creando");
	this.nombre=nombre;
	this.edad=edad;
}

public boolean equals(Alumno a){
	 boolean diferente=false;
	
	 if (!this.nombre.equals(a.nombre)){
		 diferente=true;
	 }
	 else {
		 if(this.edad!=a.edad){
			 diferente=true;
	 }
		
	 }
	return diferente;
 }

}
  	

