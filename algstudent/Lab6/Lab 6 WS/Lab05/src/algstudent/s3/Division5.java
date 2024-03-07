package algstudent.s3;

public class Division5 {

	//O(n2) (with a>b^k) 
	// n^logb a  
	// k=1 b=2 a=4
	
	public static long rec5 (int n)
	{
     long cont = 0;
	 if (n<=0) cont++;
	 else
	  { 
		 cont++ ; // O(1)    
		 
	  	for(int i=0;i<n;i++) {//k=1
	  		
	  	}
	  	rec5(n/2); //b=2 y a=4
	  	rec5(n/2);
	  	rec5(n/2);
	  	rec5(n/2);
	  }
	 return cont;   
	}
	
	public static void main (String arg []) 
	{
		 long t1,t2,cont = 0;	 
		 for (int n=1;n<=10000000;n*=2)
		 {
			  t1 = System.currentTimeMillis ();
			   
			  cont = rec5(n);
			      
			  t2 = System.currentTimeMillis ();
			
			  System.out.println ("n="+n+ "**TIME="+(t2-t1)+"**cont="+cont);	
		 }  // for
	} // main
} //

