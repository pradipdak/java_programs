import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class GivenWordFindFromFile 
{
	public static void main(String[] args) throws Exception 
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
		    char ch;
		    while(data!=null){
		    	data=br.readLine();
		    	if(data.contains(sna)){
                   System.out.println(data+"\n");
		    	}
		    }
		    
		    fr.close();
		} 
		catch (Exception e) {
			System.out.println("FileError->"+e.getMessage());
		}
	}

}
