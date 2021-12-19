package NumSystem;

public class NumSystem {
	public static int convert(int num) {
		  int i=1, binary=0, rem;
		    
		   
			while(num!=0){
			    rem = num%2;
			    binary += i*rem;   
			    num = num/2;
			    i=i*10;
			}
			
		return binary;
	}

}
