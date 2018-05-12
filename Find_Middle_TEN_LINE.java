import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Vector;


public class Find_Middle_TEN_LINE 
{
	public static void main(String[] args) 
	{
        String fna;
        Scanner scan=new Scanner(System.in);
        System.out.println("\n Enter the File Name->");
        fna=scan.next();
        
        File f=new File("src//"+fna);
        String line="";
        try{
        	FileReader fr=new FileReader(f);
        	BufferedReader br=new BufferedReader(fr);
        	int count=0;
        	Vector<String> v=new Vector<String>();
        	while(line!=null){
        		line=br.readLine();
        		if(line!=null)
        			v.add(line);	
        	}
        	int mid=v.size()/2;
        	System.out.println("Total Line is->"+v.size());
        	for(int i=mid-5;i<mid+5;i++){
        		System.out.println(v.get(i)+"\n");
        	}
        	fr.close();
        }
        catch(Exception e){
        	
        }
     
        
        
		 
	}

}
