import java.util.Scanner;

class GenderException extends Exception{
   String s;
	public GenderException(String s) {
		this.s=s;
	}
	public String toString(){
		return "Hey Your Gender Is Wrong Ok...";
	}
	
}
public class CustomException{
	public static void main(String[] args){
	   String s;
	   Scanner scan=new Scanner(System.in);
	   System.out.println("Enter The Gender->");
	   s=scan.next(); 
	   
	   if(s.equals("male")){
		  System.out.println("Gender is->"+s);  
	   }
	   else if(s.equals("female")){
		   System.out.println("Gender is->"+s);
	   }
	   else{
		   try {
			throw new GenderException(s);
		   } 
		    catch (GenderException e) {
			   e.printStackTrace();
		   }
	   }
	}
}
