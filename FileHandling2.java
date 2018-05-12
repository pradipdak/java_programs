import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.lang.*;


public class FileHandling2 
{
	public static void main(String[] args) 
	{
		String fna,sna;
		Scanner scan=new Scanner(System.in);
		System.out.println("\n Enter the File Name For Reading->");
		fna=scan.nextLine();
		System.out.println("\n Enter New FileName For Write Data-> ");
		sna=scan.nextLine();
		
		File f=new File("src//"+fna);
		
		if(!f.exists()){
			System.out.println("File Not Exist..");
		}
		else{
			System.out.println("File Is Exist...");
		}
		int uc=0,lc=0,ws=0,d=0,wr=0,sc=0,l=0;
		try {
			
			FileInputStream fis=new FileInputStream(f);
			FileOutputStream fos=new FileOutputStream("src//"+sna);
		    int n=0;
		    char ch=' ';
		    while(n!=-1){
		    	n=fis.read();
		    	if(n!=-1){
		    		ch=(char)n;
		    		
		    		if(ch>=65 && ch<=90){
		    			uc++;
		    		}
		    		else if(ch>=97 && ch<=122){
		    			lc++;
		    		}
		    		else if(ch>=48 && ch<=57){
		    			d++;
		    		}	
		    		else if(ch==32){
		    			ws++;
		    		}
		    		else if(ch>=33 && ch<=46){
		    			sc++;
		    		}
		    		else if(ch==13){
		    			l++;
		    		}
		    		System.out.println(n);
		    		fos.write(n);
		    	}
		    }
		    fis.close();
		    fos.close();
		} 
		catch (Exception e) {
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
