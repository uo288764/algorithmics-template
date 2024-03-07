package algstudent.s3;

//y O(3 ^n/2)
public class Subtraction5 {

	static long cont;

	public static long rec5(int n) {
		if (n <= 0)
			cont++;
		else {
			//b is 2 bc. you do n-2
			rec5(n - 2); 
			rec5(n - 2);
			rec5(n - 2); //a=3
		}
		return cont;
	}

	public static void main(String arg[]) {
		long t1, t2 = 0;
		int nTimes = Integer.parseInt (arg [0]);

		for (int n = 30; n <= 100000; n += 2) {
			t1 = System.currentTimeMillis();

			for (int reps=1; reps<=nTimes;reps++)
			{ 
				cont = rec5(n);
			} 			

			t2 = System.currentTimeMillis();

			System.out.println("n=" + n + "**TIME=" + (t2 - t1) + "**cont=" + cont);
		} // for
	} // main
} // class



