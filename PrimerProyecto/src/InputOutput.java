import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String opcion = "";
		int resultado = 0;
		
		
		while( ! opcion.equals("9")){
			System.out.println("Bienvenido a mi programa");
			System.out.println("");
			System.out.println("");
			System.out.println("Escoge una opción: ");
			System.out.println("1.Suma");
			System.out.println("2.Resta");
			System.out.println("3.Multiplicar");
			System.out.println("4.Dividir");
			System.out.println("");
			System.out.println("9.Salir");
			System.out.println("Teclee su opcion: ");
			
			Scanner sc=new Scanner (System.in);
			String opcion1=sc.nextLine();
			System.out.println("Escriba el primer operando: ");
			String operando1=sc.nextLine();
			
			System.out.println("Escriba el segundo operando");
			String operando2=sc.nextLine();
			
			
			if (opcion1.equals("1")||opcion1.equals("2")||opcion1.equals("3")||opcion1.equals("4")){
			if (opcion1.equals("1")){
				System.out.println("La opcion fue sumar");
				
				 resultado=sumar(Integer.parseInt(operando1),Integer.parseInt(operando2));
			}
			
			if(opcion1.equals("2")){
				System.out.println("La opcion fue restar");
				 resultado=restar(Integer.parseInt(operando1),Integer.parseInt(operando2));
			}
			if(opcion1.equals("3")){
				System.out.println("La opcion fue multiplicar");
				 resultado=multiplicar(Integer.parseInt(operando1),Integer.parseInt(operando2));
			}
			if(opcion1.equals("4")){
				System.out.println("La opcion fue dividir");
			 
			 
				 try {
					 resultado=dividir(Integer.parseInt(operando1),Integer.parseInt(operando2));
				 }
				 catch(NumberFormatException e){
					 System.out.println("Esta linea ya no se ejecutara cuando ocurra una excepcion en el metodo dividir()");
					 e.printStackTrace();
				 }
			 
			}
			System.out.println("Igual a: "+resultado);
			sc.close();
		}
	}	
}
		private static int dividir(int operando1, int operando2) {
			// TODO Auto-generated method stub
			int resultado=0;
			try {
				resultado=operando1/operando2;
				
			}
			catch (ArithmeticException e){
				System.out.println("Introduzca un numero distinto a 0 como dividendo");
				
			}
			return resultado;
		
		}

			private static int multiplicar(int operando1, int operando2) {
			// TODO Auto-generated method stub
			return operando1*operando2;
}
	
			private static int restar(int operando1, int operando2) {
			// TODO Auto-generated method stub
			return operando1-operando2;
		}
	
		private static int sumar(int operando1, int operando2) {
			// TODO Auto-generated method stub
			return operando1+operando2;
		
	}

}
