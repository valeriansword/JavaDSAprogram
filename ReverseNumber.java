/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class ReverseNumber
{
	public static void main(String[] args) {
		int n=3456;
		int ans=0;
		while(n>0){
		    int rem=n%10;
		    n=n/10;
		    ans=(ans*10)+rem;
		    
		}
		System.out.print(ans);
	}
}
