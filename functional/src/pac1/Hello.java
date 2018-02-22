package pac1;
import java.util.*;
class Hello
{
	public static void main(String[]args)
	{
		Scanner scan =new Scanner(System.in);
	
		System.out.println("enter user name");
		String username = scan.next();
		int n = username.length();
		if(n<3)
		{
			System.out.println("invalid");
		}
		else
		{
			System.out.println("hello "+ username+" how r u");
		}	
	}
}
