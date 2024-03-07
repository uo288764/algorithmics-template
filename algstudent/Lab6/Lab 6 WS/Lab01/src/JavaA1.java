import java.util.ArrayList;

public class JavaA1 {

	
	public static void main(String[] args) {
        javaA1();
    }
	
	public static void javaA1() {
		/*if __name__ == '__main__':
		    n = 10000
		    for casos in range(7):
		        t1 = time()
		        primes = listadoPrimos(n)
		        t2 = time()
		        print("n =", n, "***", "time =", int(1000*(t2-t1)), "milliseconds)")
		        #print(primes)
		        n = n*2*/
		long start = System.currentTimeMillis();
		
		int n= 10000;
		for(int casos=0; casos<=7;casos++) {
			
			listadoPrimos(n);
			//ArrayList <Integer> aux = listadoPrimos(n);
			//System.out.println(aux.toString());
			
			long finish = System.currentTimeMillis();
			long timeElapsed = finish - start;

			System.out.println("n = "+ n + " *** "+ " time = "+ timeElapsed + " milliseconds");
			n*=2;
		}
		
		
	}
	
	/*def listadoPrimos(n):
	    """ calculates and returns all primes up to n """
	    primes = []
	    for i in range (2, n+1):
	        if primoA1(i):
	            primes.append(i)
	    return primes*/
	public static boolean isPrime( int number ) {
		for(int i=2;i<number;i++) {
			if(number%i==0)
				return false;
		}
		return true;
	}
	
	public static ArrayList <Integer> listadoPrimos(int number) {
		ArrayList<Integer> aux = new ArrayList <>() ;
		
		for(int i = 2;i<=number;i++) {
			if(isPrime(i)) {
				aux.add(i);
			}
		}
		
		return aux;
	}

}
