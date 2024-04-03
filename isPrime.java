/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class isPrime
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		System.out.println(isPrime(n));
		
	}
		static String isPrime(int n){
		    if(n<=1){
		       
		        return "composite";
		    }
		    int c=2;
		    while(c*c <=n){
		        if(n%c==0){
		            return "composite";
		        }
		        c++;
		    }
		    if( c*c >n){
		        return "prime";
		    }
		    return "composite";
		    
		}
	
}
