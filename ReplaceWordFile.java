import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.Vector;


public class ReplaceWordFile 
{
	public static void main(String[] args) 
	{
		String fna,sna,tna;
		Scanner scan=new Scanner(System.in);
		System.out.println("\n Enter the File Name For Reading->");
		fna=scan.nextLine();
		System.out.println("\n Enter Word To Replace File-> ");
		sna=scan.nextLine();
		System.out.println("\n Enter New FileName For Write Data-> ");
		tna=scan.nextLine();
		
		File f=new File("src//"+fna);
		
		if(!f.exists()){
			System.out.println("File Not Exist..");
		}
		else{
			System.out.println("File Is Exist...");
		}
		try
        {
			FileReader fr=new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String data = ""; 
            Vector<String> v=new Vector<String>();
            
            while(data!=null)
            {
               data=br.readLine();
               if(data!=null)
               v.add(data);
            }
            String replaced="";
            
            FileWriter fw = new FileWriter("src//"+tna);
            for(int i=v.size()-1;i>=0;i--) {
                System.out.print(v.get(i)+"\n");
                replaced= v.get(i).replaceAll("new", sna);
                fw.write(replaced);
            }
            for(int i=0;i<v.size();i++){
            	
            	
            }
            fw.close();
            fr.close();
    }
    catch (Exception ioe)
        {
        ioe.printStackTrace();
    }
	}
}
