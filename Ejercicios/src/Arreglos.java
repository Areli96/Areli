
public class Arreglos {
	public static void main (String []args){
		int n=10;
		int []arreglo=new int[n];
		arreglo [0]=1234;
		arreglo [1]=4321;
		arreglo [2]=3421;
		arreglo [3]=4312;
		
		for (int i=0;i<arreglo.length;i++ ){
			arreglo[i]=3-i;
		}
		
		for(int i=0;i<arreglo.length;i++){
			System.out.println(arreglo[i]);
		}
	}

}
