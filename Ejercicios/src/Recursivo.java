
public class Recursivo {
//actorial de un numero de manera recursiva
	public static int Factorial(int op1){
		if (op1==1){
			return op1;
			}
		else{
		return op1*Factorial(op1-1);
	}
}

		
		public static void main(String args[]){
		
			System.out.println(Factorial(4));

			
	}
	}


