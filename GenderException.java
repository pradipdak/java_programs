import java.util.*;
class GenderExceptionClass extends Exception{
  String gen;
  GenderExceptionClass(String g){
        gen=g;
  }
  public String toString(){
  	return "Your Entered Gender is Not In Male or Female Please Check..!!";
  }
}
public class GenderException{
	public static void main(String[] args) {
		String gen;
		Scanner scan=new Scanner(System.in);

		System.out.print("Enter Your Gender->");
		gen=scan.nextLine();

		if(gen.equals("male")){
            System.out.println("Your Gender Is->"+gen);
 		}
 		else if(gen.equals("female")){
 		    System.out.println("Your Gender Is->"+gen);	
 		}
 		else{
 			try{
 				throw new GenderExceptionClass(gen);
 			}
 			catch(GenderExceptionClass ge){
               System.out.println(ge);
 			}
 		}
	}
}