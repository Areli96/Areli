
public class Main {
	//TODO Auto-generated method stub
	public static void main (String[] args ){
		System.out.println("Adios mundo");
		
		int entero;
		
		entero=0;
		float decimal;
		decimal=0.1f;
		
		short corto=1;
		
		boolean existe=true;
		String nombre="Areli";
		
		System.out.println(nombre);
		char caracter='a';
		int suma= 1+2;
		
		boolean resultadoIgual=(suma==entero);
		
		boolean c=true;
		boolean a=false;		
		boolean d=(a==c);
		
		
		int resultado =1*2;
		
		resultado=1/2;
		resultado=1-2;
		resultado=1%2;
		
		d=a&&c;
		d=a||c;
	
		d=a&c;
		d=a|c;
		int result;
		result='a'& 'b';
		System.out.println(result);
		char res=(char)result;
		
		System.out.println(5&7);
		
		if ((a==c)==(c||a) && (entero== resultado)){
			System.out.println("a=c");
		} else {
			System.out.println("a no es igual a c");}
		int k=0;
	while ((a==c || k<100)){
		System.out.println("dentro del ciclo: " +k);
		k++;
		
	}
	for(int i=10;i>1;i--){ 
		
	}
	
	
	//k+=2;
	//k/=2;
	//k%=2;
for(int i=10;i>1;i--){ 
System.out.println("variable i: "+ i);	
	}
	for (int i=0; i<10;i++){
	System.out.println("variable i: "+ i);		
	
		for (int j=0; j>10; j++){
			System.out.println("Variable i-j: " + i + "-" + j);
		}
	 System.out.println("\n");
	}
	imprimir("Texto mandado a una funcion");
	imprimir("el resultado es: "+ sumar(1,2));
	
	//Creacion de objetos
	Mesa n=new Mesa();
	n.color="negro";
	imprimir (n.color);
	
	Mesa n1=new Mesa();
	imprimir (n1.color);
	n1.getMarca ();
	Mesa.duenio="Are";
	imprimir (n.getMarca());
 }

	public static void imprimir(String mensaje){
		System.out.println(mensaje);
		
	}
	public static int sumar(int op1, int op2){
		return op1+op2;
		
	}
	
	
}
