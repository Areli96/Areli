
public class Recursividad {
public static int sumarRecursivo(int op1){
			if (op1==1){
				return op1;
				}
			else{
			return op1+sumarRecursivo(op1-1);
		}
	}

			public static int sumarInterativo (int op1){
			int resultado=0;
			for (int i=op1;i>0; i--){
				resultado=resultado+i;
				
			}
			return resultado;
		}
			public static void main(String args[]){
			
				System.out.println(sumarInterativo(10));

				System.out.println(sumarRecursivo(10));
		}
		}
