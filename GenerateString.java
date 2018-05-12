import java.util.Random;
import java.util.Scanner;
public class GenerateString {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("\n Enter the TotalNo. Of String's->");
		int c=scan.nextInt();
		String []array=new String[c];
		String s="ABCD";

		for(int i=0;i<c;i++){
			array[i]=generateString(s);
		}
		for(String var:array){
			System.out.println(var);
		}	
	}
	public static String generateString(String s){	
		String ss = null;
		Random rr=new Random();
		int p=rr.nextInt(8);
		if(p>0){
		char r[]=new char[p];
		
		for(int k=0;k<p;k++){
			r[k]=(s.charAt(rr.nextInt(4)));
		}
					
		ss=new String(r);
		
		}
		return ss;
	}
}
