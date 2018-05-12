import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class CountAllAsciiFile 
{
	public static void main(String[] args) throws Exception 
	{
		String fna,sna;
		Scanner scan=new Scanner(System.in);
		System.out.println("\n Enter the File Name For Reading->");
		fna=scan.nextLine();
		
		File f=new File("src//"+fna);
		
		if(!f.exists()){
			System.out.println("File Not Exist..");
		}
		else{
			System.out.println("File Is Exist...");
		}
		int n,uc=0,lc=0,ws=0,d=0,wr=0,sc=0,l=0;
		try {
			FileReader fr=new FileReader(f);
		    BufferedReader br=new BufferedReader(fr);
		    String data="";
		    char m;
		    while(data!=null){
		    	while(scan.hasNext()){
		    	data=br.readLine();
		    	n=data.length();
		    	scan.next();
		    	for(int i=0;i<n-1;i++){
		    		m=data.charAt(i);
		    		if(m>=65 && m<=90){
		    			uc++;
		    		}
		    		else if(m>=97 && m<=122){
		    			lc++;
		    		}
		    		else if(m>=48 && m<=57){
		    			d++;
		    		}	
		    		else if(m==32){
		    			ws++;
		    		}
		    		else if(m>=33 && m<=46){
		    			sc++;
		    		}
		    		else if(m==13){
		    			l++;
		    		}
		    		wr++;
		    	}
		    	}
		    }
		    
		    fr.close();
		    
		} 
		catch (FileNotFoundException e) {
			System.out.println("FileError->"+e.getMessage());
		}
		System.out.println("Uppercase->"+uc);
	    System.out.println("Uppercase->"+lc);
	    System.out.println("Uppercase->"+ws);
	    System.out.println("Uppercase->"+wr);
	    System.out.println("Uppercase->"+d);
	    System.out.println("Uppercase->"+l);
	    System.out.println("Uppercase->"+sc);
	}

}
