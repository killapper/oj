package archive;

import java.util.ArrayList;

public class Problem3 {
	
	static ArrayList<Long> POOF = new ArrayList<Long>();

	public static void main(String[] args) {
		
		long i = Long.parseLong("600851475142");
		long x = Long.parseLong("600851475143");
		
		for(;i>=2; i--){
			
			if(x%i == 0 && isPrime(i)){
				System.out.println(i);
				break;
			}
		}
	}
	
	public static boolean isPrime(long x){
		
		for(long i=2; i*i<=x; i++){
			if(x%i == 0){
				return false;
			}
		}
		
		return true;
	}

}