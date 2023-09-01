import java.util.*;
public class StringReverse {
	public static void main(String []args) {
		Scanner scan=new Scanner(System.in);
		String A=scan.nextLine();
		String R=new StringBuilder(A).reverse().toString();
	     if(A.equals(R)) {
	    	 System.out.println("Yes");
	    	 
	     }
	     else {
	    	 System.out.print("No");
	     }
		
		
		
		
	}




	}

