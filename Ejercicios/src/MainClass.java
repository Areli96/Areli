
public class MainClass {

	public static void main (String[] args ){
	
		
	System.out.println("Los alumnos se muestran aquí: ");
	
	Alumno alumno1=new Alumno("Areli", 20);
	Alumno alumno2=new Alumno("Rodrigo", 18);
	
	
	
	System.out.println(alumno1);
		System.out.println(alumno2);
		//	System.out.println(c.nombre+"\n");
			
//System.out.println(a==b);			
			//boolean diferente=a.equals(b);	
	System.out.println("Lista de profesores en UMIN");
	
	Profesor d=new Profesor ();
	d.nombre="Andres Huerta";
	
	
	Profesor e=new Profesor ();
	e.nombre="Gerardo Camacho";
	
	Profesor f=new Profesor ();
	f.nombre="Tonette X";		
	
	System.out.println(d.nombre);
	System.out.println(e.nombre);
	
	System.out.println(f.nombre+"\n");
	System.out.println(e==d);
	
	boolean diferente1=d.equals(e);
System.out.println("Personal administrativo registrado en la Universidad Mexicana de Innovacion en Negocios");

PersonalAdm u=new PersonalAdm ();

u.nombre="Alma";
u.edad=39;

PersonalAdm v=new PersonalAdm ();
v.nombre="Rosi";
u.edad=39;

boolean diferente2=u.equals(v);
System.out.println(u.nombre);
System.out.println(v.nombre);
System.out.println(u==v);


	}
}
