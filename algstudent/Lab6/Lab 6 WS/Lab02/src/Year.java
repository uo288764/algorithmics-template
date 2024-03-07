import java.util.Date;

public class Year {

	
	
	public static void main(String[] args) {
		System.out.println(Long.MAX_VALUE);
		System.out.println("The provided date would be 292271023.05 years in advance to 1970");
		
		long followingYears= Long.MAX_VALUE - System.currentTimeMillis();
		Date date = new Date(Long.MAX_VALUE);
		
		System.out.println("The max year would be: "+ followingYears + " ms from now");
		System.out.println("In years would be "+date);
		}
}
