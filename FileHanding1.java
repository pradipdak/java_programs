import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class FileHanding1 
{
	public static void main(String[] args) throws IOException 
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
		try {
			FileReader fr=new FileReader(f);
			FileWriter fw=new FileWriter("src//"+sna);
		    BufferedReader br=new BufferedReader(fr);
		    String data="";
		    while(data!=null){
		    	data=br.readLine();
		    	if(data!=null){
		    		System.out.println(data);
		    		fw.write(data+"\n");
		    	}
		    }
		    fr.close();
		    fw.close();
		} 
		catch (FileNotFoundException e) {
			System.out.println("FileError->"+e.getMessage());
		}
	}

}
