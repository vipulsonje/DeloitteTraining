import java.util.Scanner;

public class pretest
{
	/*public int reverse(String str)
	{
		int count=0;
		for(int i=0;i<str.length;i++)
		{
			if( (str.charAt(i) == 'A') || (str.charAt(i) == 'E') || (str[i] == 'I') || (str[i] == 'O') || (str[i] == 'U') || (str[i] == 'a') || (str[i] == 'e') || (str[i] == 'i') || (str[i] == 'o') || (str[i] == 'u') )
			{
				count++;
			}	
		}
		return count;
	}*/
	public void reversestring(String str)
	{
		int k=0;
		String arr = new String(); 
		int length = str.length();
		for(int i=length-1;i>=0;i--)
		{
			arr[k] = str[i];
			k++;
		}
		System.out.println("Reverse string is = "+arr);
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		
		String abc = new String();
		abc = sc.next();
		System.out.println(abc);
		
		pretest p = new pretest();
		//int result = p.reverse(abc);
		//System.out.println("No.of vowels = "+result);
		p.reversestring(abc);
	}
}
