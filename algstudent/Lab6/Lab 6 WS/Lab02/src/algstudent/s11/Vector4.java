package algstudent.s11;

/**
 * This program serves to measure times automatically increasing 
 * the size of the problem. In addition, we use a repetition value 
 * determined by nTimes, an argument of the program
 */
public class Vector4 {
	static int[]v;
	
	public static void main(String arg []) {
		long startTime = System.currentTimeMillis();
		
		int repetitions = Integer.parseInt(arg[0]);
		long t1,t2;
		int sum = 0;
		
		for (int n=10; n<=Integer.MAX_VALUE; n*=5){ //n is increased *5   
			  v = new int[n];
			  Vector1.fillIn(v);
			  
			  t1 = System.currentTimeMillis();
			  //We have to repeat the whole process to be measured
			  for (int repetition=1; repetition<=repetitions; repetition++){    	
			     sum = Vector1.sum(v);
			  }
			  t2 = System.currentTimeMillis();
			  System.out.printf("SIZE=%d TIME=%d milliseconds SUM=%d NTIMES=%d\n", n, t2-t1, sum, repetitions);	
			  
			  long endTime = System.currentTimeMillis();
			  long spentTime = endTime - startTime;
			  System.out.println("Time spent: " + spentTime + "ms");

		}//for 
		
	}//main

}