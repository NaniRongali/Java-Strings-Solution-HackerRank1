A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

Given a string , print Yes if it is a palindrome, print No otherwise.

Constraints

 will consist at most 50  lower case english letters.
Sample Input

madam
Sample Output

Yes


















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

