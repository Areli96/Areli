
public class Fibonacci {

public	static int fibonacci(int n){
		//System.out.println(n+ ",");
		 if(n==0 || n==1) {
		    	  return n;  
		      }
		    	
	     else {
			    	  return fibonacci(n-1)+fibonacci(n-2);
			      }
		    }  
		public static void main(String args[]){
			int n=4;
			
			System.out.println("fibonacci de "+n+ " es "+fibonacci(n));
	}
	}
