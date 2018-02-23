import java.util.regex.*;
import java.util.*;
public class User_Name { 
		    public static String replaceWithPattern(String str,String replace){
		         
		        Pattern ptn = Pattern.compile("<<UserName>>");
		        Matcher mtch = ptn.matcher(str);
		        return mtch.replaceAll(replace);
		    }

		    public static void main(String []args){
		    	Scanner scan = new Scanner (System.in);
		        String str = "Hello <<UserName>>, How are you?";
		        
		        System.out.println("enter username ");
		        String username =scan.next();
		        int n=username.length();
		        if(n<3)
		        {
		        	System.out.println("username not valid");
		        	
		        }
		        else
		        {
		        	System.out.println(replaceWithPattern(str, username));
		        }
		        
		        
		    }
		}

		
