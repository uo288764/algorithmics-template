package algstudent.s2;

/* This class measures times for the QuicksortInsertionTimes method
for the 3 assumptions: (already ordered, reverse ordered and random ordered) */
public class QuicksortInsertionTimes {
	static int[] v;

	public static void main(String arg[]) {
		long t1, t2;
		String opcion = arg[0];

		int n = 16000000;
		v = new int[n];

		if (opcion.compareTo("ordered") == 0)
			Vector.sorted(v);
		else if (opcion.compareTo("reverse") == 0)
			Vector.reverseSorted(v);
		else
			Vector.randomSorted(v);

		t1 = System.currentTimeMillis();

		//Quicksort.quicksort(v);
		QuicksortInsertion.quicksort(v,5);
		t2 = System.currentTimeMillis();

		System.out.println(n + "\t" + (t2 - t1));

	}
}