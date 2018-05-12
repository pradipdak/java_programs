import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.StringTokenizer;


public class ReplaceAllOccuranceInFile 
{
	public static void main(String[] args) 
	{	
		String fna,sna;
		Scanner scan=new Scanner(System.in);
		System.out.println("\n Enter the File Name For Reading->");
		fna=scan.nextLine();
		System.out.println("\n Enter Word To Find From File-> ");
		sna=scan.nextLine();
		
		File f=new File("src//"+fna);
		
		if(!f.exists()){
			System.out.println("File Not Exist..");
		}
		else{
			System.out.println("File Is Exist...");
		}
		try {
			FileReader fr=new FileReader(f);
		    BufferedReader br=new BufferedReader(fr);
		    String data="";
		    while(data!=null){
		    	data=br.readLine();
		    StringTokenizer s=new StringTokenizer(data);
		    	String temp="",t;
		    	while(s.hasMoreTokens()){
		    		t=s.nextToken();
		    		if(t.equals(sna)){
		    			temp=temp+"SOP";
		    		}
		    		else{
		    			temp=temp+t+" ";
		    		}
		    	}
                   System.out.println(temp+"\n");
		    }
		    
		    fr.close();
		} 
		catch (Exception e) {
			System.out.println("FileError->"+e.getMessage());
		}
	}

}
