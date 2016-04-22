
public class Main {
	//TODO Auto-generated method stub
		public static void main (String[] args ){
			
			ObjetoUno n=new ObjetoUno ();
		System.out.println	("El numero de pisos es: "+n.nPiso);
		
		ObjetoUno a=new ObjetoUno ();
		a.color="Verde";
		
		ObjetoUno b=new ObjetoUno ();
		
		System.out.println("Casa color: "+a.color);
		System.out.println("Casa color: "+b.color);
		
		
		System.out.println("Aquí comienza el objeto 2.... ");
		
		ObjetoDos m=new ObjetoDos ();
		m.nombre="Llorón";
		
		ObjetoDos p=new ObjetoDos ();
		p.nombre="Dolar";
		System.out.println(m.nombre);
		System.out.println(p.nombre);
		
		
		System.out.println("Aquí comienza el objeto 3.... ");
		ObjetoTres n1=new ObjetoTres();
		System.out.println (n1.marca);
		n1.getPlaca ();
		
		System.out.println(n1.getPlaca());
		
		System.out.println("Aquí comienza el objeto 4 .... ");
		
		ObjetoCuatro c=new ObjetoCuatro ();
		c.ml= 159.42;
		System.out.println(c);
		
		
		ObjetoCuatro z=new ObjetoCuatro ();
		z.bebida ="Coca-cola";
				System.out.println(z.bebida);
				
				ObjetoCuatro k=new ObjetoCuatro ();
				k.bebida="Té";
			
				
				ObjetoCuatro q=new ObjetoCuatro ();
				q.temp="Caliente";
				System.out.println(k.bebida+" "+ q.temp);
				
		
		
		}
}
