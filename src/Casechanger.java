import java.util.Scanner;


public class Casechanger {
	public static void main(String args[])
	{
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the string to be converted to UpperCase");
		 String str = sc.nextLine();
		 String str1 = str;
		 String lower = str;
		 
		 str = str.toUpperCase();  //converts string to uppercase
		 System.out.println("toUpperCase  = "+str);
		 lower = lower.toLowerCase();  //converts string to lowercase
		 System.out.println("toLowerCase  = "+lower);
		 String words[]=str.split("\\s");  
		    String capitalizeWord="";  
		    for(String w:words){  
		        String first=w.substring(0,1);  
		        String afterfirst=w.substring(1);  
		        capitalizeWord+=first.toUpperCase()+afterfirst+" "; 
		        System.out.println("capitalize = "+capitalizeWord);
		    }
		  String word[]=str.split(".");  
		  String SentenceWord="";  
		  for(String w:words){  
		        String first=w.substring(0,1);  
		        String afterfirst=w.substring(1);  
		        SentenceWord+=first.toUpperCase()+afterfirst+" "; 
		        System.out.println(" Sentence = "+SentenceWord);
		    }
		  StringBuffer newStr=new StringBuffer(str1);    
          
	        for(int i = 0; i < str1.length(); i++)
	        {    
	                
	            //Checks for lower case character    
	            if(Character.isLowerCase(str1.charAt(i)))
	            {    
	                //Convert it into upper case using toUpperCase() function    
	                newStr.setCharAt(i, Character.toUpperCase(str1.charAt(i)));    
	            }    
	            //Checks for upper case character    
	            else if(Character.isUpperCase(str1.charAt(i))) 
	            {    
	                //Convert it into upper case using toLowerCase() function    
	                newStr.setCharAt(i, Character.toLowerCase(str1.charAt(i)));    
	            }    
	        }    
	        System.out.println("String after case conversion : " + newStr);
	}

}
